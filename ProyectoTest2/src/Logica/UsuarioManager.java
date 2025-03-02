
package Logica;
import DAO.ConexionBD;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioManager {

    public static void verificarUsuario(String usuario, String contraseña) {
        String query = "SELECT tipo FROM usuarios WHERE usuario = ? AND contraseña = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String tipo = rs.getString("tipo");
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + tipo);
                ConexionBD.cerrarConexion(conn);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
        }
    }
}

