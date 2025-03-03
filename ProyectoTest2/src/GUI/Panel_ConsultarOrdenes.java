/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Panel_ConsultarOrdenes extends javax.swing.JPanel {

    private boolean indicadorZ = false;
    public Panel_ConsultarOrdenes() {
        initComponents();
        vaciarContenedores();
    }

    public void vaciarContenedores(){
        panelCrearOrdenes.setVisible(false);
        panelUpdateOrdenes.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorConslOrdenes = new javax.swing.JPanel();
        panelCentralConslOrdenes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelOpcionesConslOrdenes = new javax.swing.JPanel();
        panelContainerCrearOrden = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelContainerUpdateOrden = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelContainerDeleteOrden = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelSupCentConslOrdenes = new javax.swing.JPanel();
        IDText = new javax.swing.JTextField();
        btnBuscarOrden = new javax.swing.JButton();
        Orden = new javax.swing.JComboBox<>();
        btnFiltrarOrdenes = new javax.swing.JButton();
        panelCrearOrdenes = new javax.swing.JPanel();
        lblCodOrden = new javax.swing.JLabel();
        lblNameClienteCronCrea = new javax.swing.JLabel();
        lblNameProdcCronCrea = new javax.swing.JLabel();
        lblFechaInicioCronCrear = new javax.swing.JLabel();
        lblFechaFinCronCrear = new javax.swing.JLabel();
        txtFieldNumOrdenCrea = new javax.swing.JTextField();
        txtFieldNomClientCrea = new javax.swing.JTextField();
        txtFieldNomProdcCrea = new javax.swing.JTextField();
        txtFieldFICrea = new javax.swing.JTextField();
        txtFieldFFCrea = new javax.swing.JTextField();
        btnGuardarCrear = new javax.swing.JButton();
        panelUpdateOrdenes = new javax.swing.JPanel();
        lblCodOrden1 = new javax.swing.JLabel();
        lblNameClienteCronCrea1 = new javax.swing.JLabel();
        lblNameProdcCronCrea1 = new javax.swing.JLabel();
        lblFechaInicioCronCrear1 = new javax.swing.JLabel();
        lblFechaFinCronCrear1 = new javax.swing.JLabel();
        scrollPaneUpdateCron = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtFieldNumOrdenCUpdate = new javax.swing.JTextField();
        txtFieldNomClientUpdate = new javax.swing.JTextField();
        txtFieldNomProdcUpdate = new javax.swing.JTextField();
        btnGuardarUpdate = new javax.swing.JButton();
        btnEliminarEmpleCronUpdate = new javax.swing.JButton();
        lblCodCronograma1 = new javax.swing.JLabel();
        txtFieldCronogramaIdUpdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserFinalUpdate = new com.toedter.calendar.JDateChooser();
        jDateChooserInicioUpdate = new com.toedter.calendar.JDateChooser();
        btnAgregarEmpleCronUpdate = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenedorConslOrdenes.setPreferredSize(new java.awt.Dimension(840, 560));
        panelContenedorConslOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCentralConslOrdenes.setBackground(new java.awt.Color(214, 250, 140));
        panelCentralConslOrdenes.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCentralConslOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Orden", "Producto", "Fecha inicio", "Fecha Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelCentralConslOrdenes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 440));

        panelOpcionesConslOrdenes.setBackground(new java.awt.Color(165, 215, 33));
        panelOpcionesConslOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContainerCrearOrden.setBackground(new java.awt.Color(165, 215, 33));
        panelContainerCrearOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerCrearOrdenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerCrearOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerCrearOrdenMouseExited(evt);
            }
        });
        panelContainerCrearOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/add.png"))); // NOI18N
        panelContainerCrearOrden.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 40, 40));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setText("Crear");
        panelContainerCrearOrden.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesConslOrdenes.add(panelContainerCrearOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 50));

        panelContainerUpdateOrden.setBackground(new java.awt.Color(165, 215, 33));
        panelContainerUpdateOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerUpdateOrdenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerUpdateOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerUpdateOrdenMouseExited(evt);
            }
        });
        panelContainerUpdateOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/update2.png"))); // NOI18N
        panelContainerUpdateOrden.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setText("Modificar");
        panelContainerUpdateOrden.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesConslOrdenes.add(panelContainerUpdateOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 50));

        panelContainerDeleteOrden.setBackground(new java.awt.Color(165, 215, 33));
        panelContainerDeleteOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerDeleteOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerDeleteOrdenMouseExited(evt);
            }
        });
        panelContainerDeleteOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/delete.png"))); // NOI18N
        panelContainerDeleteOrden.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar");
        panelContainerDeleteOrden.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        panelOpcionesConslOrdenes.add(panelContainerDeleteOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 50));

        panelCentralConslOrdenes.add(panelOpcionesConslOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 370));

        panelSupCentConslOrdenes.setBackground(new java.awt.Color(93, 135, 0));
        panelSupCentConslOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDText.setText("Ingrese el código a buscar...");
        IDText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDTextMouseClicked(evt);
            }
        });
        IDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextActionPerformed(evt);
            }
        });
        panelSupCentConslOrdenes.add(IDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 210, -1));

        btnBuscarOrden.setBackground(new java.awt.Color(93, 135, 0));
        btnBuscarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/search.png"))); // NOI18N
        btnBuscarOrden.setBorder(null);
        btnBuscarOrden.setBorderPainted(false);
        btnBuscarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarOrdenMouseExited(evt);
            }
        });
        panelSupCentConslOrdenes.add(btnBuscarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Orden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "Menor a mayor", "Mayor a menor" }));
        Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenActionPerformed(evt);
            }
        });
        panelSupCentConslOrdenes.add(Orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 150, -1));

        btnFiltrarOrdenes.setBackground(new java.awt.Color(93, 135, 0));
        btnFiltrarOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/sort.png"))); // NOI18N
        btnFiltrarOrdenes.setBorder(null);
        btnFiltrarOrdenes.setBorderPainted(false);
        btnFiltrarOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFiltrarOrdenesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFiltrarOrdenesMouseExited(evt);
            }
        });
        panelSupCentConslOrdenes.add(btnFiltrarOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 70));

        panelCentralConslOrdenes.add(panelSupCentConslOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 110));

        panelContenedorConslOrdenes.add(panelCentralConslOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCrearOrdenes.setBackground(new java.awt.Color(255, 204, 204));
        panelCrearOrdenes.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCrearOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodOrden.setText("N° Orden");
        panelCrearOrdenes.add(lblCodOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        lblNameClienteCronCrea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameClienteCronCrea.setText("Nombre Cliente");
        panelCrearOrdenes.add(lblNameClienteCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblNameProdcCronCrea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameProdcCronCrea.setText("Nombre Producto");
        panelCrearOrdenes.add(lblNameProdcCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));

        lblFechaInicioCronCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInicioCronCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInicioCronCrear.setText("Fecha Inicio");
        panelCrearOrdenes.add(lblFechaInicioCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblFechaFinCronCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaFinCronCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFinCronCrear.setText("Fecha Final");
        panelCrearOrdenes.add(lblFechaFinCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, -1));

        txtFieldNumOrdenCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearOrdenes.add(txtFieldNumOrdenCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 130, 50));

        txtFieldNomClientCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearOrdenes.add(txtFieldNomClientCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, -1));

        txtFieldNomProdcCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearOrdenes.add(txtFieldNomProdcCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, -1));

        txtFieldFICrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearOrdenes.add(txtFieldFICrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, -1));

        txtFieldFFCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearOrdenes.add(txtFieldFFCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, -1));

        btnGuardarCrear.setText("Guardar");
        btnGuardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCrearActionPerformed(evt);
            }
        });
        panelCrearOrdenes.add(btnGuardarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 180, 40));

        panelContenedorConslOrdenes.add(panelCrearOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelUpdateOrdenes.setBackground(new java.awt.Color(247, 191, 216));
        panelUpdateOrdenes.setMinimumSize(new java.awt.Dimension(0, 0));
        panelUpdateOrdenes.setPreferredSize(new java.awt.Dimension(840, 560));
        panelUpdateOrdenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodOrden1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodOrden1.setText("N° Orden");
        panelUpdateOrdenes.add(lblCodOrden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        lblNameClienteCronCrea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameClienteCronCrea1.setText("Nombre Cliente");
        panelUpdateOrdenes.add(lblNameClienteCronCrea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        lblNameProdcCronCrea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameProdcCronCrea1.setText("Nombre Producto");
        panelUpdateOrdenes.add(lblNameProdcCronCrea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));

        lblFechaInicioCronCrear1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInicioCronCrear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInicioCronCrear1.setText("Fecha Inicio");
        panelUpdateOrdenes.add(lblFechaInicioCronCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        lblFechaFinCronCrear1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaFinCronCrear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFinCronCrear1.setText("Fecha Final");
        panelUpdateOrdenes.add(lblFechaFinCronCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre ", "Area", "Turno", "Maquina", "Fecha Asignacion"
            }
        ));
        scrollPaneUpdateCron.setViewportView(jTable3);

        panelUpdateOrdenes.add(scrollPaneUpdateCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 790, 240));

        txtFieldNumOrdenCUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUpdateOrdenes.add(txtFieldNumOrdenCUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 130, 50));

        txtFieldNomClientUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUpdateOrdenes.add(txtFieldNomClientUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 200, -1));

        txtFieldNomProdcUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUpdateOrdenes.add(txtFieldNomProdcUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

        btnGuardarUpdate.setText("Guardar");
        btnGuardarUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUpdateActionPerformed(evt);
            }
        });
        panelUpdateOrdenes.add(btnGuardarUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 120, 40));

        btnEliminarEmpleCronUpdate.setText("Eliminar");
        btnEliminarEmpleCronUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleCronUpdateActionPerformed(evt);
            }
        });
        panelUpdateOrdenes.add(btnEliminarEmpleCronUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 120, 40));

        lblCodCronograma1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodCronograma1.setText("N° Cronograma");
        panelUpdateOrdenes.add(lblCodCronograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelUpdateOrdenes.add(txtFieldCronogramaIdUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 50));

        jLabel11.setBackground(new java.awt.Color(247, 71, 128));
        jLabel11.setOpaque(true);
        panelUpdateOrdenes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 170, 120));

        jLabel13.setBackground(new java.awt.Color(247, 71, 128));
        jLabel13.setOpaque(true);
        panelUpdateOrdenes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 120));
        panelUpdateOrdenes.add(jDateChooserFinalUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, -1));
        panelUpdateOrdenes.add(jDateChooserInicioUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, -1));

        btnAgregarEmpleCronUpdate.setText("Agregar");
        btnAgregarEmpleCronUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleCronUpdateActionPerformed(evt);
            }
        });
        panelUpdateOrdenes.add(btnAgregarEmpleCronUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 120, 40));

        panelContenedorConslOrdenes.add(panelUpdateOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(panelContenedorConslOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void panelContainerCrearOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearOrdenMouseClicked
        panelCentralConslOrdenes.setVisible(false);
        panelCrearOrdenes.setVisible(true);
    }//GEN-LAST:event_panelContainerCrearOrdenMouseClicked

    private void panelContainerCrearOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearOrdenMouseEntered
        panelContainerCrearOrden.setBackground(new Color(214,250,140));
    }//GEN-LAST:event_panelContainerCrearOrdenMouseEntered

    private void panelContainerCrearOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearOrdenMouseExited
        panelContainerCrearOrden.setBackground(new Color(165,215,33));
    }//GEN-LAST:event_panelContainerCrearOrdenMouseExited

    private void panelContainerUpdateOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateOrdenMouseEntered
        panelContainerUpdateOrden.setBackground(new Color(214,250,140));
    }//GEN-LAST:event_panelContainerUpdateOrdenMouseEntered

    private void panelContainerUpdateOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateOrdenMouseExited
        panelContainerUpdateOrden.setBackground(new Color(165,215,33));
    }//GEN-LAST:event_panelContainerUpdateOrdenMouseExited

    private void panelContainerDeleteOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteOrdenMouseEntered
        panelContainerDeleteOrden.setBackground(new Color(214,250,140));
    }//GEN-LAST:event_panelContainerDeleteOrdenMouseEntered

    private void panelContainerDeleteOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteOrdenMouseExited
        panelContainerDeleteOrden.setBackground(new Color(165,215,33));
    }//GEN-LAST:event_panelContainerDeleteOrdenMouseExited

    private void IDTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTextMouseClicked
        // TODO add your handling code here:
        IDText.setText(null);
    }//GEN-LAST:event_IDTextMouseClicked

    private void IDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextActionPerformed

    private void btnBuscarOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarOrdenMouseEntered
        btnBuscarOrden.setBackground(new Color(214,250,140));
    }//GEN-LAST:event_btnBuscarOrdenMouseEntered

    private void btnBuscarOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarOrdenMouseExited
        btnBuscarOrden.setBackground(new Color(165,215,33));
    }//GEN-LAST:event_btnBuscarOrdenMouseExited

    private void OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenActionPerformed
        /*if (Orden.getSelectedIndex() == 1){
            try {
                LlenarArrays();

                ArrayList<Proveedor> Aux_P = new ArrayList<>(Lista_Proveedor);
                VaciarArrays();
                //  Ordenación por QuickSort
                QuickSort(Aux_P, 0, Aux_P.size() - 1, 1);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Panel_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error para QuickSortMenorMayor");
            }
        }
        else{
            try {
                LlenarArrays();

                ArrayList<Proveedor> Aux_P = new ArrayList<>(Lista_Proveedor);

                VaciarArrays();
                //  Ordenación por QuickSort
                QuickSort(Aux_P, 0, Aux_P.size() - 1, 2);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Panel_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error para QuickSortMayorMenor");
            }
        }*/
    }//GEN-LAST:event_OrdenActionPerformed

    private void btnFiltrarOrdenesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarOrdenesMouseEntered
        btnFiltrarOrdenes.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnFiltrarOrdenesMouseEntered

    private void btnFiltrarOrdenesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarOrdenesMouseExited
        btnFiltrarOrdenes.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_btnFiltrarOrdenesMouseExited

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed

    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void btnGuardarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarUpdateActionPerformed

    private void btnEliminarEmpleCronUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleCronUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEmpleCronUpdateActionPerformed

    private void btnAgregarEmpleCronUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCronUpdateActionPerformed
        panelUpdateOrdenes.setVisible(false);
    }//GEN-LAST:event_btnAgregarEmpleCronUpdateActionPerformed

    private void panelContainerUpdateOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateOrdenMouseClicked
        panelCentralConslOrdenes.setVisible(false);
        panelUpdateOrdenes.setVisible(true);
    }//GEN-LAST:event_panelContainerUpdateOrdenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JButton btnAgregarEmpleCronUpdate;
    private javax.swing.JButton btnBuscarOrden;
    private javax.swing.JButton btnEliminarEmpleCronUpdate;
    private javax.swing.JButton btnFiltrarOrdenes;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton btnGuardarUpdate;
    private com.toedter.calendar.JDateChooser jDateChooserFinalUpdate;
    private com.toedter.calendar.JDateChooser jDateChooserInicioUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblCodCronograma1;
    private javax.swing.JLabel lblCodOrden;
    private javax.swing.JLabel lblCodOrden1;
    private javax.swing.JLabel lblFechaFinCronCrear;
    private javax.swing.JLabel lblFechaFinCronCrear1;
    private javax.swing.JLabel lblFechaInicioCronCrear;
    private javax.swing.JLabel lblFechaInicioCronCrear1;
    private javax.swing.JLabel lblNameClienteCronCrea;
    private javax.swing.JLabel lblNameClienteCronCrea1;
    private javax.swing.JLabel lblNameProdcCronCrea;
    private javax.swing.JLabel lblNameProdcCronCrea1;
    private javax.swing.JPanel panelCentralConslOrdenes;
    private javax.swing.JPanel panelContainerCrearOrden;
    private javax.swing.JPanel panelContainerDeleteOrden;
    private javax.swing.JPanel panelContainerUpdateOrden;
    private javax.swing.JPanel panelContenedorConslOrdenes;
    private javax.swing.JPanel panelCrearOrdenes;
    private javax.swing.JPanel panelOpcionesConslOrdenes;
    private javax.swing.JPanel panelSupCentConslOrdenes;
    private javax.swing.JPanel panelUpdateOrdenes;
    private javax.swing.JScrollPane scrollPaneUpdateCron;
    private javax.swing.JTextField txtFieldCronogramaIdUpdate;
    private javax.swing.JTextField txtFieldFFCrea;
    private javax.swing.JTextField txtFieldFICrea;
    private javax.swing.JTextField txtFieldNomClientCrea;
    private javax.swing.JTextField txtFieldNomClientUpdate;
    private javax.swing.JTextField txtFieldNomProdcCrea;
    private javax.swing.JTextField txtFieldNomProdcUpdate;
    private javax.swing.JTextField txtFieldNumOrdenCUpdate;
    private javax.swing.JTextField txtFieldNumOrdenCrea;
    // End of variables declaration//GEN-END:variables
}
