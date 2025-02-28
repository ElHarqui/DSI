/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Beans.Empleado;
import DAO.EmpleadoDAO;

/**
 *
 * @author quino
 */
public class EmpleadoControlador {
    
    private EmpleadoDAO employee = new EmpleadoDAO();
    
    public Empleado obtenerNombreCompleto(int idEmpleado){
        return employee.obtenerNombreEmpleado(idEmpleado);
    }
    

}
