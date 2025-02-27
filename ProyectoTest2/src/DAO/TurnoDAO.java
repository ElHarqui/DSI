/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Beans.Turno;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author quino
 */
public class TurnoDAO {
    public List<Turno> obtenerListaTurno(){
        List<Turno> listaTurnos = new ArrayList<>();
        Connection conn = ConexionBD.obtenerConexion();

        String consulta = "SELECT idTurno, nombre FROM Turno";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idTurno = rs.getInt("idTurno");
                String nombreTurno = rs.getString("nombre");
                listaTurnos.add(new Turno(idTurno, nombreTurno));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                System.out.println("Conexion cerrada en PaisDAO.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return listaTurnos;
    }
}
