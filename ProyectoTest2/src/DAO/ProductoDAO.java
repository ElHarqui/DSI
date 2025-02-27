package DAO;

import Beans.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements IProducto{
    private Connection conexion;

    @Override
    public List<Producto> listarProductos() {
        if (this.conexion == null) {
            this.conexion = ConexionBD.obtenerConexion();
        }
        List<Producto> productos = new ArrayList<>();
        try (Statement stmt = this.conexion.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM producto")) {
            while (rs.next()) {
                // Suponiendo que tienes un constructor en Producto que acepta los campos de la tabla
                Producto producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("idCliente")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public boolean agregarProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre, descripcion, idCliente) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getDescripcion());
            stmt.setInt(3, producto.getIdCliente());

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    producto.setIdProducto(rs.getInt(1)); // Asignar el ID generado
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editarProducto(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, idCliente = ? WHERE idProducto = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getDescripcion());
            stmt.setInt(3, producto.getIdCliente());
            stmt.setInt(4, producto.getIdProducto());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Producto obtenerProductoPorId(Integer id) {
        String sql = "SELECT idProducto, nombre, descripcion, idCliente FROM productos WHERE idProducto = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("idCliente")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean eliminarProductoPorId(Integer id) {
        String sql = "DELETE FROM productos WHERE idProducto = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Producto> encontrarProductosPorIdCliente(Integer idCliente) {
        if (this.conexion == null) {
            this.conexion = ConexionBD.obtenerConexion();
        }
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE idCliente=?";

        try (PreparedStatement stmt = this.conexion.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            try (ResultSet rs = stmt.executeQuery()) { // Corrección aquí
                while (rs.next()) {
                    Producto producto = new Producto(
                            rs.getInt("idProducto"),
                            rs.getString("nombre"),
                            rs.getString("descripcion"),
                            rs.getInt("idCliente")
                    );
                    productos.add(producto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }


    public static void main(String[] args) {
        ProductoDAO prueba = new ProductoDAO();
        for (var producto:prueba.listarProductos()){
            System.out.println(producto);
        }
    }
}

