/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.AsignacionTurno;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AsignacionTurnoDAO {
    private Connection conn = ConexionBD.obtenerConexion();
    
    public ArrayList<AsignacionTurno> listaAsignacion = new ArrayList<>();
    
    /*public ArrayList<AsignacionTurno> listarActual(){
        String sql = "SELECT * FROM pdf";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                
            }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                ps.close();
                rs.close();
                conn.desconectar();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listaAsignacion;
    }
    
    public void LimpiarLista(){
        listaAsignacion.clear();
    }*/
}

