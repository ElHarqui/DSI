/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.DAO.ICronograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quino
 */
public class CronogramaDAO implements ICronograma{

    @Override
    public void leer() {
    }
    
    public static ArrayList<ArrayList<String>> obtenerCronogramasPorEmpleado(int idEmpleado) {
        ArrayList<ArrayList<String>> lista = new ArrayList<>();
        String sql = """
            SELECT
                cr.idCronograma AS NumeroCronograma,
                c.nombre AS NombreCliente,
                p.nombre AS NombreProducto,
                o.fechaInicio AS FechaInicio,
                o.fechaAcabado AS FechaTermino,
                a.nombre AS NombreArea
            FROM AsignacionTurno at
            JOIN Cronograma cr ON at.idCronograma = cr.idCronograma
            JOIN Orden o ON cr.idOrden = o.idOrden
            JOIN Producto p ON o.idProducto = p.idProducto
            JOIN Cliente c ON p.idCliente = c.idCliente
            JOIN Area a ON at.idArea = a.idArea
            WHERE at.idEmpleado = ?;
        """;

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEmpleado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ArrayList<String> fila = new ArrayList<>();
                fila.add(String.valueOf(rs.getInt("NumeroCronograma"))); // Convertir ID a String
                fila.add(rs.getString("NombreCliente"));
                fila.add(rs.getString("NombreProducto"));
                fila.add(rs.getString("FechaInicio"));
                fila.add(rs.getString("FechaTermino"));
                fila.add(rs.getString("NombreArea"));

                lista.add(fila);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
     public static void cargarDatosEnJTable(JTable tabla, int idEmpleado) {
        // Consulta SQL
        String sql = """
            SELECT
                cr.idCronograma AS NumeroCronograma,
                c.nombre AS NombreCliente,
                p.nombre AS NombreProducto,
                o.fechaInicio AS FechaInicio,
                o.fechaAcabado AS FechaTermino,
                a.nombre AS NombreArea
            FROM AsignacionTurno at
            JOIN Cronograma cr ON at.idCronograma = cr.idCronograma
            JOIN Orden o ON cr.idOrden = o.idOrden
            JOIN Producto p ON o.idProducto = p.idProducto
            JOIN Cliente c ON p.idCliente = c.idCliente
            JOIN Area a ON at.idArea = a.idArea
            WHERE at.idEmpleado = ?;
        """;

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEmpleado);
            ResultSet rs = ps.executeQuery();

            // Crear el modelo de la tabla y definir las columnas
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Numero Cronograma");
            modelo.addColumn("Nombre Cliente");
            modelo.addColumn("Nombre Producto");
            modelo.addColumn("Fecha Inicio");
            modelo.addColumn("Fecha Termino");
            modelo.addColumn("Nombre Area");

            // Recorrer el ResultSet y agregar cada fila al modelo
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("NumeroCronograma");
                fila[1] = rs.getString("NombreCliente");
                fila[2] = rs.getString("NombreProducto");
                fila[3] = rs.getString("FechaInicio");
                fila[4] = rs.getString("FechaTermino");
                fila[5] = rs.getString("NombreArea");

                modelo.addRow(fila);
            }

            // Asignar el modelo construido al JTable
            tabla.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
