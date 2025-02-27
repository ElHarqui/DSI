/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Beans.Maquina;
import DAO.MaquinaDAO;
import java.util.List;

/**
 *
 * @author quino
 */
public class MaquinaControlador {
    MaquinaDAO maquinaDAO = new MaquinaDAO();
    public List<Maquina> obtenerMaquinas(){
        return maquinaDAO.obtenerListaMaquinas();
    }
}
