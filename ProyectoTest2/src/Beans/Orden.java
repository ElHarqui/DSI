/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author quino
 */
public class Orden {
    private Integer idOrden;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private Integer idProducto;
    private String nombreProducto;

    public Orden(){}

    public Orden(Integer idOrden, LocalDate fechaInicio, LocalDate fechaTermino, Integer idProducto) {
        this.idOrden = idOrden;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.idProducto = idProducto;
    }

    public Orden(LocalDate fechaInicio,LocalDate fechaTermino,Integer idProducto){
        this.fechaInicio=fechaInicio;
        this.fechaTermino=fechaTermino;
        this.idProducto=idProducto;
    }


    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "idOrden=" + idOrden +
                ", fechaInicio=" + fechaInicio +
                ", fechaTermino=" + fechaTermino +
                ", idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                '}';
    }
}
