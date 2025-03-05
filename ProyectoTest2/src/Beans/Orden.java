/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;
import java.sql.Date;
/**
 *
 * @author quino
 */
public class Orden {
    private int idOrden;
    private int idProducto;
    private Date fechaInicio;
    private Date fechaTermino;

    public Orden(int idOrden, int idProducto, Date fechaInicio, Date fechaTermino) {
        this.idOrden = idOrden;
        this.idProducto = idProducto;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
    
    public Orden(){
        
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
    
}
