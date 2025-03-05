package DAO;

import Beans.Cliente;
import Beans.Producto;
import Interfaces.DAO.ICliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements ICliente{

    private final Connection conexion=ConexionBD.obtenerConexion();


    @Override
    public List<Cliente> listarClientes() {
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

    @Override
    public String obtenerNombreClientePorIdProducto(Integer id) {

            String sql = "SELECT cliente.nombre FROM cliente " +
                    "INNER JOIN producto ON producto.idCliente = cliente.idCliente LIMIT 1";

            try (PreparedStatement stmt = conexion.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    return rs.getString("nombre"); // Retorna solo el primer nombre encontrado
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null; // Si no encuentra resultados, retorna null
        }

    @Override
    public Integer obtenerIdPorNombre(String nombre) {
        String sql = "SELECT idCliente FROM cliente WHERE nombre = ? LIMIT 1";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idCliente"); // Devuelve el ID del cliente encontrado
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Retorna null si no hay coincidencias
    }

    }



