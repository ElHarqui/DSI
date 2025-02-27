package DAO;

import Beans.Cliente;
import Beans.Producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements ICliente{

    private Connection conexion;

    @Override
    public List<Cliente> listarClientes() {
        if (this.conexion == null) {
            this.conexion = ConexionBD.obtenerConexion();
        }
        List<Cliente> clientes = new ArrayList<>();
        try (Statement stmt = this.conexion.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM cliente")) {
            while (rs.next()) {
                // Suponiendo que tienes un constructor en Producto que acepta los campos de la tabla
                Cliente cliente = new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getString("codPais")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
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


//    public static void main(String[] args) {
//        ClienteDAO prueba = new ClienteDAO();
//        for(var cliente:prueba.listarClientes())
//            System.out.println(cliente);
//    }
}
