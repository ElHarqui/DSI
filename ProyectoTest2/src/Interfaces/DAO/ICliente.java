package Interfaces.DAO;

import Beans.Cliente;
import Beans.Producto;

import java.util.List;

public interface ICliente {
    public List<Cliente> listarClientes();
    public boolean agregarClientes(Cliente cliente);
    public boolean editarCliente(Cliente cliente);
    public Producto encontrarProductoPorId(Integer id);
    public boolean eliminarProductoPorId(Integer id);
    public String obtenerNombreClientePorIdProducto(Integer id);
    public Integer obtenerIdPorNombre(String nombre);
}
