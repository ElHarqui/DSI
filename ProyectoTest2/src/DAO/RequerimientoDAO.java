package DAO;

import Beans.Producto;
import Beans.Requerimiento;
import Interfaces.DAO.IRequerimientos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RequerimientoDAO implements IRequerimientos {

    private final Connection conexion = ConexionBD.obtenerConexion();


    @Override
    public List<Requerimiento> listarRequerimientos() {
        List<Requerimiento> requerimientos = new ArrayList<>();
        String sql = "SELECT * FROM requerimientos";
        try (Statement stmt = this.conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Requerimiento requerimiento = new Requerimiento(
                        rs.getInt("idReque"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("idOrden")
                );
                requerimientos.add(requerimiento);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar requerimientos: " + e.getMessage());
        }
        return requerimientos;
    }

    @Override
    public void crearRequerimiento(Integer idOrden) {
        String sql = "INSERT INTO requerimientos (nombre, descripcion, idOrden) " +
                "SELECT CONCAT(' - ', c.nombre, ' - ', p.nombre), " +
                "'Generado automáticamente', ? " +
                "FROM orden o " +
                "JOIN producto p ON o.idProducto = p.idProducto " +
                "JOIN cliente c ON p.idCliente = c.idCliente " +
                "WHERE o.idOrden = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setInt(1, idOrden);
            stmt.setInt(2, idOrden);

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("✅ Requerimiento creado correctamente para la orden " + idOrden);
            } else {
                System.out.println("⚠ No se pudo crear el requerimiento para la orden " + idOrden);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al crear el requerimiento: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        RequerimientoDAO prueba = new RequerimientoDAO();
        for (Requerimiento req:prueba.listarRequerimientos())
            System.out.println(req);
    }
}
