/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Panel_ConsultarOrdenes extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ConsultarOrdenes
     */
    public Panel_ConsultarOrdenes() {
        initComponents();
        vaciarContenedores();
    }

    public void vaciarContenedores(){
        panelCrearOrdenes.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        Orden = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        panelCrearOrdenes = new javax.swing.JPanel();
        lblCodOrden = new javax.swing.JLabel();
        lblNameClienteCronCrea = new javax.swing.JLabel();
        lblNameProdcCronCrea = new javax.swing.JLabel();
        lblFechaInicioCronCrear = new javax.swing.JLabel();
        lblFechaFinCronCrear = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtFieldNumOrdenCrea = new javax.swing.JTextField();
        txtFieldNomClientCrea = new javax.swing.JTextField();
        txtFieldNomProdcCrea = new javax.swing.JTextField();
        txtFieldFICrea = new javax.swing.JTextField();
        txtFieldFFCrea = new javax.swing.JTextField();
        btnGuardarCrear = new javax.swing.JButton();
        lblCodCronograma = new javax.swing.JLabel();
        txtFieldCronogramaIdCrea = new javax.swing.JTextField();

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

        jButton1.setBackground(new java.awt.Color(93, 135, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/search.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        panelSupCentConslOrdenes.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Orden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "Menor a mayor", "Mayor a menor" }));
        Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenActionPerformed(evt);
            }
        });
        panelSupCentConslOrdenes.add(Orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 150, -1));

        jButton2.setBackground(new java.awt.Color(93, 135, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/sort.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        panelSupCentConslOrdenes.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 70));

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        panelCrearOrdenes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 820, 250));

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

        lblCodCronograma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodCronograma.setText("N° Cronograma");
        panelCrearOrdenes.add(lblCodCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelCrearOrdenes.add(txtFieldCronogramaIdCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 50));

        panelContenedorConslOrdenes.add(panelCrearOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(panelContenedorConslOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void panelContainerCrearOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearOrdenMouseClicked
        panelCentralConslOrdenes.setVisible(false);
        panelCrearOrdenes.setVisible(true);
    }//GEN-LAST:event_panelContainerCrearOrdenMouseClicked

    private void panelContainerCrearOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearOrdenMouseEntered
        panelContainerCrearOrden.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerCrearOrdenMouseEntered

    private void panelContainerCrearOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearOrdenMouseExited
        panelContainerCrearOrden.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerCrearOrdenMouseExited

    private void panelContainerUpdateOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateOrdenMouseEntered
        panelContainerUpdateOrden.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerUpdateOrdenMouseEntered

    private void panelContainerUpdateOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateOrdenMouseExited
        panelContainerUpdateOrden.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerUpdateOrdenMouseExited

    private void panelContainerDeleteOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteOrdenMouseEntered
        panelContainerDeleteOrden.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerDeleteOrdenMouseEntered

    private void panelContainerDeleteOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteOrdenMouseExited
        panelContainerDeleteOrden.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerDeleteOrdenMouseExited

    private void IDTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTextMouseClicked
        // TODO add your handling code here:
        IDText.setText(null);
    }//GEN-LAST:event_IDTextMouseClicked

    private void IDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_jButton1MouseExited

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

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_jButton2MouseExited

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed

    }//GEN-LAST:event_btnGuardarCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCodCronograma;
    private javax.swing.JLabel lblCodOrden;
    private javax.swing.JLabel lblFechaFinCronCrear;
    private javax.swing.JLabel lblFechaInicioCronCrear;
    private javax.swing.JLabel lblNameClienteCronCrea;
    private javax.swing.JLabel lblNameProdcCronCrea;
    private javax.swing.JPanel panelCentralConslOrdenes;
    private javax.swing.JPanel panelContainerCrearOrden;
    private javax.swing.JPanel panelContainerDeleteOrden;
    private javax.swing.JPanel panelContainerUpdateOrden;
    private javax.swing.JPanel panelContenedorConslOrdenes;
    private javax.swing.JPanel panelCrearOrdenes;
    private javax.swing.JPanel panelOpcionesConslOrdenes;
    private javax.swing.JPanel panelSupCentConslOrdenes;
    private javax.swing.JTextField txtFieldCronogramaIdCrea;
    private javax.swing.JTextField txtFieldFFCrea;
    private javax.swing.JTextField txtFieldFICrea;
    private javax.swing.JTextField txtFieldNomClientCrea;
    private javax.swing.JTextField txtFieldNomProdcCrea;
    private javax.swing.JTextField txtFieldNumOrdenCrea;
    // End of variables declaration//GEN-END:variables
}
