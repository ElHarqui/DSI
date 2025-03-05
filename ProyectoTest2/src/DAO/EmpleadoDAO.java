/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Empleado;
import Interfaces.DAO.IEmpleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author quino
 */
public class EmpleadoDAO implements IEmpleado {
    private Connection conn;
    @Override
    public Empleado obtenerNombreEmpleado(int codigoEmpleado){
        if(conn==null){
            this.conn=ConexionBD.obtenerConexion();
        }
        String query = "SELECT nombre, apellido FROM empleado WHERE idEmpleado = ?";
        Empleado emp = null;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,codigoEmpleado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                emp = new Empleado(nombre,apellido);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return emp; 
    }
}
