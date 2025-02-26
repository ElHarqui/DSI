/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

public class JefeProduccionGUI extends javax.swing.JPanel {

    public JefeProduccionGUI() {
        initComponents();
        iniciarPaneles();
        System.out.println("Tmre");
    }
    
    public void iniciarPaneles(){
        panelMenu.setVisible(true);
        panelContenedor.setVisible(true);
    }
    
    public void limpiarContenedor(){
        panelArmarCron.setVisible(false);
        panelConsultarOrd.setVisible(false);
        panelConsultarReq.setVisible(false);
        panelCrearCron.setVisible(false);
    }
    
    public void limpiarContenedor1(){
        panelArmarCron.setVisible(false);
        panelConsultarOrd.setVisible(false);
        panelConsultarReq.setVisible(false);
        panelCrearCron.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panelMenu = new javax.swing.JPanel();
        btnConsultarReq = new javax.swing.JButton();
        btnConsultarOrd = new javax.swing.JButton();
        btnArmarCron = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        panelArmarCron = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCrearCron = new javax.swing.JButton();
        btnUpdateCron = new javax.swing.JButton();
        btnEliminarCron = new javax.swing.JButton();
        panelConsultarOrd = new javax.swing.JPanel();
        panelConsultarReq = new javax.swing.JPanel();
        panelCrearCron = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtFieldNumOrdenCrea = new javax.swing.JTextField();
        txtFieldNomClientCrea = new javax.swing.JTextField();
        txtFieldNomProdcCrea = new javax.swing.JTextField();
        txtFieldFICrea = new javax.swing.JTextField();
        txtFieldFFCrea = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnGuardarCrear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setMinimumSize(new java.awt.Dimension(620, 420));
        setPreferredSize(new java.awt.Dimension(620, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarReq.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnConsultarReq.setText("Consultar Requerimientos");
        btnConsultarReq.setPreferredSize(new java.awt.Dimension(160, 50));
        btnConsultarReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarReqActionPerformed(evt);
            }
        });
        panelMenu.add(btnConsultarReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 50));

        btnConsultarOrd.setText("Consultar Ordenes");
        panelMenu.add(btnConsultarOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 50));

        btnArmarCron.setText("Armar Cronograma");
        btnArmarCron.setPreferredSize(new java.awt.Dimension(160, 50));
        btnArmarCron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmarCronActionPerformed(evt);
            }
        });
        panelMenu.add(btnArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, 50));

        add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 420));

        panelContenedor.setBackground(new java.awt.Color(102, 102, 255));
        panelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelArmarCron.setBackground(new java.awt.Color(255, 102, 204));
        panelArmarCron.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelArmarCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        panelArmarCron.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 330));

        btnCrearCron.setText("Crear +");
        btnCrearCron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCronActionPerformed(evt);
            }
        });
        panelArmarCron.add(btnCrearCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 50));

        btnUpdateCron.setText("Modificar");
        panelArmarCron.add(btnUpdateCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 130, 50));

        btnEliminarCron.setText("Eliminar");
        panelArmarCron.add(btnEliminarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, 50));

        panelContenedor.add(panelArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        panelConsultarOrd.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout panelConsultarOrdLayout = new javax.swing.GroupLayout(panelConsultarOrd);
        panelConsultarOrd.setLayout(panelConsultarOrdLayout);
        panelConsultarOrdLayout.setHorizontalGroup(
            panelConsultarOrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        panelConsultarOrdLayout.setVerticalGroup(
            panelConsultarOrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        panelContenedor.add(panelConsultarOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 428, 408));

        panelConsultarReq.setBackground(new java.awt.Color(102, 255, 102));
        panelConsultarReq.setPreferredSize(new java.awt.Dimension(428, 408));

        javax.swing.GroupLayout panelConsultarReqLayout = new javax.swing.GroupLayout(panelConsultarReq);
        panelConsultarReq.setLayout(panelConsultarReqLayout);
        panelConsultarReqLayout.setHorizontalGroup(
            panelConsultarReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        panelConsultarReqLayout.setVerticalGroup(
            panelConsultarReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        panelContenedor.add(panelConsultarReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        panelCrearCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("N° Orden");
        panelCrearCron.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Cliente");
        panelCrearCron.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Producto");
        panelCrearCron.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha Inicio");
        panelCrearCron.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha Final");
        panelCrearCron.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        panelCrearCron.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 410, 160));

        txtFieldNumOrdenCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCron.add(txtFieldNumOrdenCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, -1));

        txtFieldNomClientCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCron.add(txtFieldNomClientCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, -1));

        txtFieldNomProdcCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCron.add(txtFieldNomProdcCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, -1));

        txtFieldFICrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCron.add(txtFieldFICrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, -1));

        txtFieldFFCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCron.add(txtFieldFFCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Extrusión", "Corte", "Impresión", "Laminador", "Sellador" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panelCrearCron.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 100, -1));

        btnGuardarCrear.setText("Guardar");
        btnGuardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCrearActionPerformed(evt);
            }
        });
        panelCrearCron.add(btnGuardarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 180, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tipo Operario");
        panelCrearCron.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 100, 30));

        panelContenedor.add(panelCrearCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 410));

        add(panelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 440, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarReqActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void btnCrearCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCronActionPerformed
        limpiarContenedor();
        panelCrearCron.setVisible(true);
    }//GEN-LAST:event_btnCrearCronActionPerformed

    private void btnArmarCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmarCronActionPerformed
        limpiarContenedor();
        panelArmarCron.setVisible(true);
    }//GEN-LAST:event_btnArmarCronActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArmarCron;
    private javax.swing.JButton btnConsultarOrd;
    private javax.swing.JButton btnConsultarReq;
    private javax.swing.JButton btnCrearCron;
    private javax.swing.JButton btnEliminarCron;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton btnUpdateCron;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JPanel panelArmarCron;
    private javax.swing.JPanel panelConsultarOrd;
    private javax.swing.JPanel panelConsultarReq;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelCrearCron;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextField txtFieldFFCrea;
    private javax.swing.JTextField txtFieldFICrea;
    private javax.swing.JTextField txtFieldNomClientCrea;
    private javax.swing.JTextField txtFieldNomProdcCrea;
    private javax.swing.JTextField txtFieldNumOrdenCrea;
    // End of variables declaration//GEN-END:variables
}
