package GUI;

import Beans.Orden;
import DAO.OrdenDAO;

import javax.swing.*;

public class TestVista {
    public static void main(String[] args) {
        Orden orden = new Orden();
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Prueba de Modificación de Órdenes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);

            // Crear una instancia de la vista
            PanelModificarOrdenes panel = new PanelModificarOrdenes(orden);

            // Agregar el panel al frame
            frame.add(panel);

            // Hacer visible el frame
            frame.setVisible(true);
        });
    }
}
