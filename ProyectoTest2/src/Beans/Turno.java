/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author quino
 */
public class Turno {
    private int idTurno;
    private String nombreTurno;

    public Turno(int idTurno, String nombreTurno) {
        this.idTurno = idTurno;
        this.nombreTurno = nombreTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

    @Override
    public String toString() {
        return nombreTurno;
    }
    
  
}
