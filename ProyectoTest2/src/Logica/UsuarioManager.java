
package Logica;

import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioManager {
    private static final String URL = "jdbc:mysql://localhost:3306/dsi";
    private static final String USER = "root";
    private static final String PASSWORD = "1421";

    public static void verificarUsuario(String usuario, String contraseña) {
        String query = "SELECT tipo FROM usuarios WHERE usuario = ? AND contraseña = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String tipo = rs.getString("tipo");
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + tipo);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
        }
    }
}

