package DAO;

import Beans.Producto;
import Beans.Requerimiento;
import Interfaces.DAO.IRequerimientos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public static void main(String[] args) {
        RequerimientoDAO prueba = new RequerimientoDAO();
        for (Requerimiento req:prueba.listarRequerimientos())
            System.out.println(req);
    }
}
