package DAO;

import Beans.Producto;

import java.util.List;

public interface IProducto {
    public List<Producto> listarProductos();
    public boolean agregarProducto(Producto producto);
    public boolean editarProducto(Producto producto);
    public Producto obtenerProductoPorId(Integer id);
    public boolean eliminarProductoPorId(Integer id);
}
