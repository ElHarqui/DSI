/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.AsignacionTurnoDAO;
import DAO.ConexionBD;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.CronogramaDAO;
/**
 *
 * @author Gabriel Cuba
 */
public class Panel_ListarCronogramasEmpleado extends javax.swing.JPanel {

    private int idEmpleado;
    private static AsignacionTurnoDAO AgTu = new AsignacionTurnoDAO();
    private CronogramaDAO CronDao = new CronogramaDAO();
    
    public Panel_ListarCronogramasEmpleado(int idEmp) {
        this.idEmpleado = idEmp;
        initComponents();
        CronDao.cargarDatosEnJTable(tableCronosEmpleadosId, idEmpleado);
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorCronoEmple = new javax.swing.JPanel();
        panelCentralArmarCrono = new javax.swing.JPanel();
        scrollPanelOrdenesCrono = new javax.swing.JScrollPane();
        tableCronosEmpleadosId = new javax.swing.JTable();
        panelSupCentArmarCron = new javax.swing.JPanel();
        Orden = new javax.swing.JComboBox<>();
        btonFiltrar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenedorCronoEmple.setPreferredSize(new java.awt.Dimension(840, 560));

        panelCentralArmarCrono.setBackground(new java.awt.Color(204, 204, 255));
        panelCentralArmarCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCentralArmarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCronosEmpleadosId.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Cronograma", "Cliente", "Producto", "Fecha Inicio", "Fecha Final", "Area"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelOrdenesCrono.setViewportView(tableCronosEmpleadosId);

        panelCentralArmarCrono.add(scrollPanelOrdenesCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 820, 440));

        panelSupCentArmarCron.setBackground(new java.awt.Color(102, 102, 255));
        panelSupCentArmarCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Orden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "Menor a mayor", "Mayor a menor" }));
        Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenActionPerformed(evt);
            }
        });
        panelSupCentArmarCron.add(Orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 150, -1));

        btonFiltrar.setBackground(new java.awt.Color(102, 102, 255));
        btonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/sort.png"))); // NOI18N
        btonFiltrar.setBorder(null);
        btonFiltrar.setBorderPainted(false);
        btonFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btonFiltrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btonFiltrarMouseExited(evt);
            }
        });
        panelSupCentArmarCron.add(btonFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 70));

        panelCentralArmarCrono.add(panelSupCentArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 110));

        javax.swing.GroupLayout panelContenedorCronoEmpleLayout = new javax.swing.GroupLayout(panelContenedorCronoEmple);
        panelContenedorCronoEmple.setLayout(panelContenedorCronoEmpleLayout);
        panelContenedorCronoEmpleLayout.setHorizontalGroup(
            panelContenedorCronoEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(panelContenedorCronoEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorCronoEmpleLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCentralArmarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelContenedorCronoEmpleLayout.setVerticalGroup(
            panelContenedorCronoEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(panelContenedorCronoEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorCronoEmpleLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCentralArmarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(panelContenedorCronoEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenActionPerformed
        
    }//GEN-LAST:event_OrdenActionPerformed

    private void btonFiltrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btonFiltrarMouseEntered
        btonFiltrar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btonFiltrarMouseEntered

    private void btonFiltrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btonFiltrarMouseExited
        btonFiltrar.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_btonFiltrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JButton btonFiltrar;
    private javax.swing.JPanel panelCentralArmarCrono;
    private javax.swing.JPanel panelContenedorCronoEmple;
    private javax.swing.JPanel panelSupCentArmarCron;
    private javax.swing.JScrollPane scrollPanelOrdenesCrono;
    private javax.swing.JTable tableCronosEmpleadosId;
    // End of variables declaration//GEN-END:variables
}
