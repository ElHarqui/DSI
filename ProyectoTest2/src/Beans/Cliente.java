package Beans;

import java.util.Objects;

public class Cliente {
    private Integer IdCliente;
    private String nombre;
    private String correo;
    private String telefono;
    private String codPais;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String nombre, String correo, String telefono, String codPais) {
        this.IdCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.codPais = codPais;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return IdCliente == cliente.IdCliente && Objects.equals(nombre, cliente.nombre) && Objects.equals(correo, cliente.correo) && Objects.equals(telefono, cliente.telefono) && Objects.equals(codPais, cliente.codPais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdCliente, nombre, correo, telefono, codPais);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "IdCliente=" + IdCliente +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", codPais='" + codPais + '\'' +
                '}';
    }
}
