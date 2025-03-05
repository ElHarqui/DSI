package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author quino
 */

public class ConexionBD {

    // Datos de conexión a MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/envolturaperu";
    private static final String USER = "root"; // Tu usuario de MySQL
    private static final String PASSWORD = "root"; // Tu contraseña de MySQL

    // Método para obtener la conexión
    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos.");

        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexion cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion.");
            e.printStackTrace();
        }
    }
}
