/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author quino
 */
public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String correoCliente;
    private String telefono;
    private String codPais;

    public Cliente(int idCliente, String nombreCliente, String correoCliente, String telefono, String codPais) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefono = telefono;
        this.codPais = codPais;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }
    
    
}
