package Beans;

import java.util.Objects;

public class Producto {
    private Integer idProducto;
    private String nombre;
    private String descripcion;
    private Integer idCliente;

    public Producto(){

    }

    public Producto(Integer idProducto,String nombre,String descripcion, Integer idCliente){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idCliente = idCliente;

    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(idProducto, producto.idProducto) && Objects.equals(nombre, producto.nombre) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(idCliente, producto.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombre, descripcion, idCliente);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
