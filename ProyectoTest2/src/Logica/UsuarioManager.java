/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.*;
import java.io.*;

public class UsuarioManager {
    public static void verificarUsuario(String usuario, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3 && datos[0].equals(usuario) && datos[1].equals(password)) {
                    if (datos[2].equalsIgnoreCase("admin")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                        
                        //
                    } else if (datos[2].equalsIgnoreCase("usuario")) {
                        JOptionPane.showMessageDialog(null, "Bienvenido Usuario");
                        //
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
    }
}
