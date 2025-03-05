package Beans;

import DAO.RequerimientoDAO;

import java.util.Objects;

public class Requerimiento {
    private Integer id;
    private String nombre;
    private String Description;
    private Integer IdOrden;

    public Requerimiento() {
    }

    public Requerimiento(Integer id, String nombre, String description, Integer idOrden) {
        this.id = id;
        this.nombre = nombre;
        Description = description;
        IdOrden = idOrden;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoombre() {
        return nombre;
    }

    public void setNoombre(String noombre) {
        this.nombre = noombre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(Integer idOrden) {
        IdOrden = idOrden;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Requerimiento that = (Requerimiento) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(Description, that.Description) && Objects.equals(IdOrden, that.IdOrden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, Description, IdOrden);
    }

    @Override
    public String toString() {
        return "RequerimientoDAO{" +
                "id=" + id +
                ", noombre='" + nombre + '\'' +
                ", Description='" + Description + '\'' +
                ", IdOrden=" + IdOrden +
                '}';
    }
}
