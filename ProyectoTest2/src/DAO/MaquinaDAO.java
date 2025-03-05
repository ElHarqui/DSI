/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import Beans.Maquina;
import Interfaces.DAO.IMaquina;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author quino
 */
public class MaquinaDAO implements IMaquina{
    private Connection conn;

    @Override
    public List<Maquina> obtenerListaMaquinas() {
        if(this.conn == null){
            this.conn= ConexionBD.obtenerConexion();
        }
        List<Maquina> maquinas = new ArrayList<>();
        String consulta = "SELECT idMaquina, modelo,idArea FROM Maquina ";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {

            while (rs.next()) {
                int idMaquina = rs.getInt("idMaquina");
                String modelo = rs.getString("modelo");
                int idArea = rs.getInt("idArea");
                maquinas.add(new Maquina(idMaquina, modelo, idArea));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                System.out.println("Conexion cerrada en MaquinaDAO.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return maquinas;
    }

}
