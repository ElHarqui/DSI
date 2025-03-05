/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.Date;

/**
 *
 * @author Gabriel Cuba
 */
public class AsignacionTurno {
    private int idEmpleado;
    private int idArea;
    private int idTurno;
    private Date fechaAsignacion;
    private int idMaquina;
    private int idCronograma;

    public AsignacionTurno(int idEmpleado, int idArea, int idTurno, Date fechaAsignacion, int idMaquina, int idCronograma) {
        this.idEmpleado = idEmpleado;
        this.idArea = idArea;
        this.idTurno = idTurno;
        this.fechaAsignacion = fechaAsignacion;
        this.idMaquina = idMaquina;
        this.idCronograma = idCronograma;
    }

    public AsignacionTurno(int idEmpleado, int idArea, int idTurno, Date fechaAsignacion, int idMaquina) {
        this.idEmpleado = idEmpleado;
        this.idArea = idArea;
        this.idTurno = idTurno;
        this.fechaAsignacion = fechaAsignacion;
        this.idMaquina = idMaquina;
    }
    
    public AsignacionTurno() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }
    
    
    
    
}
