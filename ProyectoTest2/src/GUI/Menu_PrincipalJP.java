/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Menu_PrincipalJP extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_PrincipalJP() {
        initComponents();
        this.setLocationRelativeTo(null);
        TiempoReal();
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
        panelContainerReq = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelContainerOrdenes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        setName("JFramMP"); // NOI18N
        setResizable(false);

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

        panelContainerReq.setBackground(new java.awt.Color(153, 255, 255));
        panelContainerReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerReqMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerReqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerReqMouseExited(evt);
            }
        });
        panelContainerReq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/Req3.png"))); // NOI18N
        panelContainerReq.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel6.setText("Requerimientos");
        panelContainerReq.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, 170, 40));

        Botones.add(panelContainerReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 80));

        panelContainerOrdenes.setBackground(new java.awt.Color(153, 255, 255));
        panelContainerOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerOrdenesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerOrdenesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerOrdenesMouseExited(evt);
            }
        });
        panelContainerOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/orden2.png"))); // NOI18N
        panelContainerOrdenes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel8.setText("Ordenes");
        panelContainerOrdenes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, 110, 40));

        Botones.add(panelContainerOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 260, 70));

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

        Botones.add(panelContainerCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 70));

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

    private void panelContainerReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerReqMouseClicked
       
    }//GEN-LAST:event_panelContainerReqMouseClicked

    private void panelContainerSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelContainerSalirMouseClicked

    private void panelContainerReqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerReqMouseEntered
        panelContainerReq.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_panelContainerReqMouseEntered

    private void panelContainerReqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerReqMouseExited
        panelContainerReq.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_panelContainerReqMouseExited

    private void panelContainerOrdenesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerOrdenesMouseEntered
        panelContainerOrdenes.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_panelContainerOrdenesMouseEntered

    private void panelContainerOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerOrdenesMouseClicked
        Panel_ConsultarOrdenes pOrdenes = new Panel_ConsultarOrdenes();
        CambiarPanel(pOrdenes);
    }//GEN-LAST:event_panelContainerOrdenesMouseClicked

    private void panelContainerOrdenesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerOrdenesMouseExited
        panelContainerOrdenes.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_panelContainerOrdenesMouseExited

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

    private void panelContainerSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerSalirMouseEntered
        panelContainerSalir.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_panelContainerSalirMouseEntered

    private void panelContainerSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerSalirMouseExited
        panelContainerSalir.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_panelContainerSalirMouseExited

   

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelContainerCrono;
    private javax.swing.JPanel panelContainerOrdenes;
    private javax.swing.JPanel panelContainerReq;
    private javax.swing.JPanel panelContainerSalir;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSuperiorMarco;
    private javax.swing.JPanel panelUsuarioMenu;
    // End of variables declaration//GEN-END:variables
}
