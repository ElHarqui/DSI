/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Beans.Area;
import DAO.AreaDAO;
import java.util.List;


/**
 *
 * @author quinoS
 */
public class AreaControlador {
    AreaDAO areaDAO = new AreaDAO();
    public List<Area> obtenerAreas(){
        return areaDAO.obtenerListaAreas();
    }
}
