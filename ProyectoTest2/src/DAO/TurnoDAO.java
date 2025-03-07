/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Beans.Turno;
import Interfaces.DAO.ITurno;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author quino
 */
public class TurnoDAO implements ITurno {
    private Connection conn ;
    @Override
    public List<Turno> ObtenerListaTurnos() {
        if(this.conn == null){
            this.conn= ConexionBD.obtenerConexion();
        }
        List<Turno> listaTurnos = new ArrayList<>();
        String consulta = "SELECT idTurno, nombre FROM turno";

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
                System.out.println("Conexion cerrada en TurnoDAO.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listaTurnos;
    }
    
}
