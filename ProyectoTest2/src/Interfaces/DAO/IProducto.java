package Interfaces.DAO;

import Beans.Producto;

import java.util.List;

public interface IProducto {
    public List<Producto> listarProductos();
    public boolean agregarProducto(Producto producto);
    public boolean editarProducto(Producto producto);
    public Producto obtenerProductoPorId(Integer id);
    public boolean eliminarProductoPorId(Integer id);
    public List<Producto> encontrarProductosPorIdCliente(Integer idCliente);
    public Integer obtenerIdClientePorIdProducto(Integer id);
    public Integer obtenerIdProductoPorNombre(String nombre);
}
