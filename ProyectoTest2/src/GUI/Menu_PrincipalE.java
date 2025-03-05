/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.ConexionBD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;

/**
 *
 * @author Gabriel Cuba
 */
public class Menu_PrincipalE extends javax.swing.JFrame {

    private int idEmpleado;
    private String nombreEmpleado;
    
    public Menu_PrincipalE(int idEmp) {
        this.idEmpleado = idEmp;
        nombreEmpleado = obtenerNombreEmpleado(idEmpleado);
        initComponents();
        Nombre.setText(nombreEmpleado);
    }
    
    public static String obtenerNombreEmpleado(int idEmpleado) {
        String sql = "SELECT nombre, apellido FROM Empleado WHERE idEmpleado = ?";
        String nombreCompleto = "";

        try {
            Connection conn = ConexionBD.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idEmpleado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                nombreCompleto = nombre + " " + apellido; // Concatenamos nombre y apellido
            }

        } catch (SQLException ex) {
            System.out.println("Error al obtener el nombre del empleado: " + ex.getMessage());
        }

        return nombreCompleto;
    }
    
    private void TiempoReal() {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        etiquetaReloj.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }
    
    public void CambiarPanel(JPanel panel){
        panel.setSize(830, 550);
        panel.setLocation(5,5);
        PANEL_INTRO.removeAll();
        PANEL_INTRO.add(panel);
        PANEL_INTRO.revalidate();
        PANEL_INTRO.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelContainerSalir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelContainerCrono = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelUsuarioMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        etiquetaReloj = new javax.swing.JLabel();
        PANEL_INTRO = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelSuperiorMarco = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botones.setBackground(new java.awt.Color(153, 255, 255));
        Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Botones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 10));

        panelContainerSalir.setBackground(new java.awt.Color(153, 255, 255));
        panelContainerSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerSalirMouseExited(evt);
            }
        });
        panelContainerSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/lOGOUT2.png"))); // NOI18N
        panelContainerSalir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel2.setText("Salir");
        panelContainerSalir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 40));

        Botones.add(panelContainerSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 260, 70));

        panelContainerCrono.setBackground(new java.awt.Color(153, 255, 255));
        panelContainerCrono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerCronoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerCronoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerCronoMouseExited(evt);
            }
        });
        panelContainerCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/calendar2.png"))); // NOI18N
        panelContainerCrono.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel10.setText("Cronogramas");
        panelContainerCrono.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 40));

        Botones.add(panelContainerCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 70));

        panelUsuarioMenu.setBackground(new java.awt.Color(0, 153, 153));
        panelUsuarioMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/icono-removebg-preview (1).png"))); // NOI18N
        panelUsuarioMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 130));

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Usuario");
        panelUsuarioMenu.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 160, 20));

        Botones.add(panelUsuarioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 190));

        etiquetaReloj.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        etiquetaReloj.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Botones.add(etiquetaReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 220, 30));

        panelMenu.add(Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 690));

        PANEL_INTRO.setBackground(new java.awt.Color(255, 255, 255));
        PANEL_INTRO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 79, 150), 3));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/logoEmpresa2.png"))); // NOI18N

        javax.swing.GroupLayout PANEL_INTROLayout = new javax.swing.GroupLayout(PANEL_INTRO);
        PANEL_INTRO.setLayout(PANEL_INTROLayout);
        PANEL_INTROLayout.setHorizontalGroup(
            PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        PANEL_INTROLayout.setVerticalGroup(
            PANEL_INTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE)
        );

        panelMenu.add(PANEL_INTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 840, 560));

        panelSuperiorMarco.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panelSuperiorMarcoLayout = new javax.swing.GroupLayout(panelSuperiorMarco);
        panelSuperiorMarco.setLayout(panelSuperiorMarcoLayout);
        panelSuperiorMarcoLayout.setHorizontalGroup(
            panelSuperiorMarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelSuperiorMarcoLayout.setVerticalGroup(
            panelSuperiorMarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        panelMenu.add(panelSuperiorMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 840, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelContainerSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelContainerSalirMouseClicked

    private void panelContainerSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerSalirMouseEntered
        panelContainerSalir.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_panelContainerSalirMouseEntered

    private void panelContainerSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerSalirMouseExited
        panelContainerSalir.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_panelContainerSalirMouseExited

    private void panelContainerCronoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCronoMouseClicked
        Panel_ArmarCronograma pCronograma = new Panel_ArmarCronograma();
        CambiarPanel(pCronograma);
    }//GEN-LAST:event_panelContainerCronoMouseClicked

    private void panelContainerCronoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCronoMouseEntered
        panelContainerCrono.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_panelContainerCronoMouseEntered

    private void panelContainerCronoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCronoMouseExited
        panelContainerCrono.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_panelContainerCronoMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel PANEL_INTRO;
    private javax.swing.JLabel etiquetaReloj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelContainerCrono;
    private javax.swing.JPanel panelContainerSalir;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSuperiorMarco;
    private javax.swing.JPanel panelUsuarioMenu;
    // End of variables declaration//GEN-END:variables
}
