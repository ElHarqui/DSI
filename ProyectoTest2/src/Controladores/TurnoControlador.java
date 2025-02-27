/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Beans.Turno;
import DAO.TurnoDAO;
import java.util.List;

/**
 *
 * @author quino
 */
public class TurnoControlador {
    private final TurnoDAO turnoDAO = new TurnoDAO();
    public List<Turno> obtenerTurnos(){
        return turnoDAO.ObtenerListaTurnos();
    } 
}
