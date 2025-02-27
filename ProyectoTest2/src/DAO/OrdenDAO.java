/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Orden;
import Interfaces.DAO.IOrden;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author quino
 */
public class OrdenDAO implements IOrden {

    private Connection conexion;

    @Override
    public List<Orden> listarOrdenes() {
        List<Orden> listaOrdenes = new ArrayList<>();
        String sql = "SELECT o.idOrden, o.fechaInicio, o.fechaAcabado, p.nombre AS nombreProducto " +
                "FROM orden o " +
                "JOIN producto p ON o.idProducto = p.idProducto";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                orden.setFechaTermino(rs.getDate("fechaAcabado").toLocalDate());
                orden.setNombreProducto(rs.getString("nombreProducto")); // Guardar el nombre del producto

                listaOrdenes.add(orden);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaOrdenes;
    }

    @Override
    public boolean agregarOrden(Orden orden) {

        if(conexion==null){
            conexion= ConexionBD.obtenerConexion();
        }

        String sql = "INSERT INTO orden (fechaInicio,fechaAcabado,idProducto) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDate(1, java.sql.Date.valueOf(orden.getFechaInicio()));
            stmt.setDate(2,java.sql.Date.valueOf(orden.getFechaTermino()));
            stmt.setInt(3, orden.getIdProducto());

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    orden.setIdProducto(rs.getInt(1)); // Asignar el ID generado
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editarOrden(Orden orden) {
        return false;
    }

    @Override
    public Orden obtenerOrdenPorId(Integer idOrden) {
        return null;
    }

    @Override
    public void obtenerNumeroOrden(JTextField txtOrden) {
        Connection conn = ConexionBD.obtenerConexion();
        String consulta = "SELECT COUNT(*) FROM Orden";
        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta)) {

            int numeroOrden = 1;//Valor predeterminado si no hay registros
            if(rs.next()){
                numeroOrden = rs.getInt(1) + 1;
            }
            txtOrden.setText(String.valueOf(numeroOrden)); // Mostrar en el JTextField
            txtOrden.setEditable(false);
            // Cerrar conexión
            rs.close();
            stmt.close();
            conn.close();

        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener el número de orden: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Orden ord = new Orden(1,LocalDate.now(), LocalDate.now(),1);
        OrdenDAO ordenDAO = new OrdenDAO();
        if(ordenDAO.agregarOrden(ord))
            System.out.println("Se agrego correctamente");
        else
            System.out.println("GG report falla");
    }
}
