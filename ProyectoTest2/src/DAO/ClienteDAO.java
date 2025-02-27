package DAO;

import Beans.Cliente;
import Beans.Producto;

import java.util.List;

public class ClienteDAO implements ICliente{
    @Override
    public List<Cliente> listarClientes() {
        return List.of();
    }

    @Override
    public boolean agregarClientes(Cliente cliente) {
        return false;
    }

    @Override
    public boolean editarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public Producto encontrarProductoPorId(Integer id) {
        return null;
    }

    @Override
    public boolean eliminarProductoPorId(Integer id) {
        return false;
    }
}
