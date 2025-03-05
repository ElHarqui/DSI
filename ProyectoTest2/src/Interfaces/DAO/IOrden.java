/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces.DAO;

import Beans.Orden;

import javax.swing.JTextField;
import java.util.List;
import java.util.Map;

/**
 *
 * @author quino
 */
public interface IOrden {
    public List<Orden> listarOrdenes();
    public boolean agregarOrden(Orden orden);
    public boolean editarOrden(Orden orden);
    public Orden obtenerOrdenPorId(Integer idOrden);
    public void obtenerNumeroOrden(JTextField txtOrden);
    public boolean eliminarOrdenPorId(Integer id);
    public Integer obtenerUltimoIdOrden();
    public Map<String, String> obtenerDatosOrden(Integer idOrden);
}