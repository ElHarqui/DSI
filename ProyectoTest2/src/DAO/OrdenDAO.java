/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.DAO.IOrden;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author quino
 */
public class OrdenDAO implements IOrden {
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
}
