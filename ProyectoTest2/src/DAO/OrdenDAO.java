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
import java.util.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author quino
 */
public class OrdenDAO implements IOrden {

    private Connection conexion=ConexionBD.obtenerConexion();

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
        if (orden.getIdOrden() == null) {
            System.err.println("Error: El ID de la orden es NULL");
            return false;
        }

        String sql = "UPDATE orden SET idOrden = ?, fechaInicio = ?, fechaAcabado = ?, idProducto = ? WHERE idOrden = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, orden.getIdOrden());
            stmt.setDate(2, java.sql.Date.valueOf(orden.getFechaInicio()));
            stmt.setDate(3, java.sql.Date.valueOf(orden.getFechaTermino()));
            stmt.setInt(4, orden.getIdProducto());
            stmt.setInt(5, orden.getIdOrden()); // Establecer el parámetro faltante

            // Depuración
            System.out.println("Ejecutando SQL: " + sql);
            System.out.println("Valores: ID=" + orden.getIdOrden() +
                    ", FechaInicio=" + orden.getFechaInicio() +
                    ", FechaAcabado=" + orden.getFechaTermino() +
                    ", IDProducto=" + orden.getIdProducto());

            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    @Override
    public boolean eliminarOrdenPorId(Integer id) {
        String sql = "DELETE FROM orden WHERE idOrden = ?";

        if (id == null) {
            System.out.println("Error: El ID de la orden es null.");
            return false;
        }

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int filasEliminadas = stmt.executeUpdate();
            return filasEliminadas > 0; // True si se eliminó correctamente
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Retorna false si hubo un error
    }

    @Override
    public Integer obtenerUltimoIdOrden() {
        int idOrden = -1;
        String sql = "SELECT MAX(idOrden) FROM orden";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                idOrden = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al obtener el último ID de orden: " + e.getMessage());
        }

        return idOrden;
    }

    @Override
    public Map<String, String> obtenerDatosOrden(Integer idOrden) {
        String sql = "SELECT c.nombre, p.nombre, o.fechaInicio, o.fechaAcabado " +
                "FROM orden o " +
                "JOIN producto p ON o.idProducto = p.idProducto " +
                "JOIN cliente c ON p.idCliente = c.idCliente " +
                "WHERE o.idOrden = ?";

        Map<String, String> datosExtras = new HashMap<>();

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idOrden);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                datosExtras.put("nombreCliente", rs.getString("nombre"));
                datosExtras.put("nombreProducto", rs.getString("nombre"));
                datosExtras.put("fechaInicio", rs.getString("fechaInicio"));
                datosExtras.put("fechaAcabado", rs.getString("fechaAcabado"));
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al obtener datos de la orden: " + e.getMessage());
        }

        return datosExtras;
    }
}


//    public static void main(String[] args) {
//        Orden ord = new Orden(1,LocalDate.now(), LocalDate.now(),1);
//        OrdenDAO ordenDAO = new OrdenDAO();
//        if(ordenDAO.agregarOrden(ord))
//            System.out.println("Se agrego correctamente");
//        else
//            System.out.println("GG report falla");
//    }

