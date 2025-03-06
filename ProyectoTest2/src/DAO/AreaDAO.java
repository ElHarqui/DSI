/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Area;
import Interfaces.DAO.IArea;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author quino
 */
public class AreaDAO implements IArea{
    private Connection conn;
    @Override
    public List<Area> obtenerListaAreas() {
        if(this.conn == null){
            this.conn= ConexionBD.obtenerConexion();
        }
        List<Area> areas = new ArrayList<>();
        String consulta = "SELECT idArea, nombre FROM area";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idArea = rs.getInt("idArea");
                String nombreArea = rs.getString("nombre");
                areas.add(new Area(idArea, nombreArea));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                System.out.println("Conexion cerrada en AreaDAO.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return areas;
    }
    
}
