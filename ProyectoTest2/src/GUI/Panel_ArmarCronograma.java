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
public class Panel_ArmarCronograma extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ArmarCrono
     */
    public Panel_ArmarCronograma() {
        initComponents();
        vaciarContenedores();
    }

    public void vaciarContenedores(){
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorArmarCron = new javax.swing.JPanel();
        panelCentralArmarCrono = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelOpcionesArmarCron = new javax.swing.JPanel();
        panelContainerCrearCron = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelContainerUpdateCron = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelContainerDeleteCron = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelSupCentArmarCron = new javax.swing.JPanel();
        IDText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Orden = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        panelCrearCrono = new javax.swing.JPanel();
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
        btnAgregarEmpleCron = new javax.swing.JButton();
        lblCodCronograma = new javax.swing.JLabel();
        txtFieldCronogramaIdCrea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelCrearCronAddEmple = new javax.swing.JPanel();
        lblCodEmplCronAdddEmpl = new javax.swing.JLabel();
        lblNamEmplCronAdddEmpl = new javax.swing.JLabel();
        lblTurCronAdddEmpl = new javax.swing.JLabel();
        lblAreaCronAdddEmpl = new javax.swing.JLabel();
        lblNamMaquCronAdddEmpl = new javax.swing.JLabel();
        lblDateAsigCronAdddEmpl = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        panelUpdateCrono = new javax.swing.JPanel();
        panelDeleteCrono = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenedorArmarCron.setPreferredSize(new java.awt.Dimension(840, 560));

        panelCentralArmarCrono.setBackground(new java.awt.Color(204, 204, 255));
        panelCentralArmarCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCentralArmarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelCentralArmarCrono.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 440));

        panelOpcionesArmarCron.setBackground(new java.awt.Color(153, 153, 255));
        panelOpcionesArmarCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContainerCrearCron.setBackground(new java.awt.Color(153, 153, 255));
        panelContainerCrearCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerCrearCronMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerCrearCronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerCrearCronMouseExited(evt);
            }
        });
        panelContainerCrearCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/add.png"))); // NOI18N
        panelContainerCrearCron.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 40, 40));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setText("Crear");
        panelContainerCrearCron.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesArmarCron.add(panelContainerCrearCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 50));

        panelContainerUpdateCron.setBackground(new java.awt.Color(153, 153, 255));
        panelContainerUpdateCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCronMouseExited(evt);
            }
        });
        panelContainerUpdateCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/update2.png"))); // NOI18N
        panelContainerUpdateCron.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setText("Modificar");
        panelContainerUpdateCron.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesArmarCron.add(panelContainerUpdateCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 50));

        panelContainerDeleteCron.setBackground(new java.awt.Color(153, 153, 255));
        panelContainerDeleteCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCronMouseExited(evt);
            }
        });
        panelContainerDeleteCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/delete.png"))); // NOI18N
        panelContainerDeleteCron.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar");
        panelContainerDeleteCron.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        panelOpcionesArmarCron.add(panelContainerDeleteCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 50));

        panelCentralArmarCrono.add(panelOpcionesArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 370));

        panelSupCentArmarCron.setBackground(new java.awt.Color(102, 102, 255));
        panelSupCentArmarCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelSupCentArmarCron.add(IDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 210, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
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
        panelSupCentArmarCron.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Orden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "Menor a mayor", "Mayor a menor" }));
        Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenActionPerformed(evt);
            }
        });
        panelSupCentArmarCron.add(Orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 150, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
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
        panelSupCentArmarCron.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 70));

        panelCentralArmarCrono.add(panelSupCentArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 110));

        panelCrearCrono.setBackground(new java.awt.Color(255, 118, 118));
        panelCrearCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCrearCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodOrden.setText("N° Orden");
        panelCrearCrono.add(lblCodOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        lblNameClienteCronCrea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameClienteCronCrea.setText("Nombre Cliente");
        panelCrearCrono.add(lblNameClienteCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        lblNameProdcCronCrea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameProdcCronCrea.setText("Nombre Producto");
        panelCrearCrono.add(lblNameProdcCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));

        lblFechaInicioCronCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInicioCronCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInicioCronCrear.setText("Fecha Inicio");
        panelCrearCrono.add(lblFechaInicioCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        lblFechaFinCronCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaFinCronCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFinCronCrear.setText("Fecha Final");
        panelCrearCrono.add(lblFechaFinCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

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

        panelCrearCrono.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 820, 250));

        txtFieldNumOrdenCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNumOrdenCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 130, 50));

        txtFieldNomClientCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNomClientCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 200, -1));

        txtFieldNomProdcCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNomProdcCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

        txtFieldFICrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldFICrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 200, -1));

        txtFieldFFCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldFFCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, -1));

        btnGuardarCrear.setText("Guardar");
        btnGuardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCrearActionPerformed(evt);
            }
        });
        panelCrearCrono.add(btnGuardarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 120, 40));

        btnAgregarEmpleCron.setText("Agregar");
        btnAgregarEmpleCron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleCronActionPerformed(evt);
            }
        });
        panelCrearCrono.add(btnAgregarEmpleCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 120, 40));

        lblCodCronograma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodCronograma.setText("N° Cronograma");
        panelCrearCrono.add(lblCodCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelCrearCrono.add(txtFieldCronogramaIdCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 50));

        jLabel7.setBackground(new java.awt.Color(255, 64, 64));
        jLabel7.setOpaque(true);
        panelCrearCrono.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 170, 560));

        jLabel11.setBackground(new java.awt.Color(255, 64, 64));
        jLabel11.setOpaque(true);
        panelCrearCrono.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 200, 40));

        jLabel12.setBackground(new java.awt.Color(255, 64, 64));
        jLabel12.setOpaque(true);
        panelCrearCrono.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 560));

        jLabel14.setBackground(new java.awt.Color(255, 64, 64));
        jLabel14.setOpaque(true);
        panelCrearCrono.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 200, 40));

        panelCrearCronAddEmple.setBackground(new java.awt.Color(255, 204, 153));
        panelCrearCronAddEmple.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCrearCronAddEmple.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodEmplCronAdddEmpl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodEmplCronAdddEmpl.setText("Código");
        panelCrearCronAddEmple.add(lblCodEmplCronAdddEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 70, -1));

        lblNamEmplCronAdddEmpl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNamEmplCronAdddEmpl.setText("Nombre Completo");
        panelCrearCronAddEmple.add(lblNamEmplCronAdddEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        lblTurCronAdddEmpl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTurCronAdddEmpl.setText("Turno");
        panelCrearCronAddEmple.add(lblTurCronAdddEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        lblAreaCronAdddEmpl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaCronAdddEmpl.setText("Área");
        panelCrearCronAddEmple.add(lblAreaCronAdddEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        lblNamMaquCronAdddEmpl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNamMaquCronAdddEmpl.setText("Maquina");
        panelCrearCronAddEmple.add(lblNamMaquCronAdddEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        lblDateAsigCronAdddEmpl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDateAsigCronAdddEmpl.setText("Fecha Asignación");
        panelCrearCronAddEmple.add(lblDateAsigCronAdddEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));
        panelCrearCronAddEmple.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 180, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCrearCronAddEmple.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 180, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCrearCronAddEmple.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 180, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCrearCronAddEmple.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 153));
        jLabel8.setOpaque(true);
        panelCrearCronAddEmple.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 560));

        jButton3.setBackground(new java.awt.Color(255, 204, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 160, 60));

        jLabel9.setBackground(new java.awt.Color(255, 255, 153));
        jLabel9.setOpaque(true);
        panelCrearCronAddEmple.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 130, 560));

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setOpaque(true);
        panelCrearCronAddEmple.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 580, 30));

        jButton4.setBackground(new java.awt.Color(255, 204, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/search.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        panelCrearCronAddEmple.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));
        panelCrearCronAddEmple.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, 30));
        panelCrearCronAddEmple.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 180, 30));

        panelUpdateCrono.setBackground(new java.awt.Color(247, 191, 216));
        panelUpdateCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDeleteCrono.setPreferredSize(new java.awt.Dimension(840, 560));

        javax.swing.GroupLayout panelDeleteCronoLayout = new javax.swing.GroupLayout(panelDeleteCrono);
        panelDeleteCrono.setLayout(panelDeleteCronoLayout);
        panelDeleteCronoLayout.setHorizontalGroup(
            panelDeleteCronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        panelDeleteCronoLayout.setVerticalGroup(
            panelDeleteCronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelContenedorArmarCronLayout = new javax.swing.GroupLayout(panelContenedorArmarCron);
        panelContenedorArmarCron.setLayout(panelContenedorArmarCronLayout);
        panelContenedorArmarCronLayout.setHorizontalGroup(
            panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCentralArmarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCrearCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCrearCronAddEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelUpdateCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDeleteCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelContenedorArmarCronLayout.setVerticalGroup(
            panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCentralArmarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCrearCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCrearCronAddEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelUpdateCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenedorArmarCronLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDeleteCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(panelContenedorArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void panelContainerCrearCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearCronMouseEntered
        panelContainerCrearCron.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerCrearCronMouseEntered

    private void panelContainerCrearCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearCronMouseExited
        panelContainerCrearCron.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerCrearCronMouseExited

    private void panelContainerUpdateCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCronMouseEntered
        panelContainerUpdateCron.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerUpdateCronMouseEntered
    
    private void panelContainerUpdateCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCronMouseExited
        panelContainerUpdateCron.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerUpdateCronMouseExited

    private void panelContainerDeleteCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCronMouseEntered
        panelContainerDeleteCron.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerDeleteCronMouseEntered

    private void panelContainerDeleteCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCronMouseExited
        panelContainerDeleteCron.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerDeleteCronMouseExited

    private void IDTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTextMouseClicked
        // TODO add your handling code here:
        IDText.setText(null);
    }//GEN-LAST:event_IDTextMouseClicked

    private void IDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextActionPerformed

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

    private void panelContainerCrearCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearCronMouseClicked
        panelCentralArmarCrono.setVisible(false);
        panelCrearCrono.setVisible(true);
    }//GEN-LAST:event_panelContainerCrearCronMouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed

    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void btnAgregarEmpleCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCronActionPerformed
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleCronActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JButton btnAgregarEmpleCron;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAreaCronAdddEmpl;
    private javax.swing.JLabel lblCodCronograma;
    private javax.swing.JLabel lblCodEmplCronAdddEmpl;
    private javax.swing.JLabel lblCodOrden;
    private javax.swing.JLabel lblDateAsigCronAdddEmpl;
    private javax.swing.JLabel lblFechaFinCronCrear;
    private javax.swing.JLabel lblFechaInicioCronCrear;
    private javax.swing.JLabel lblNamEmplCronAdddEmpl;
    private javax.swing.JLabel lblNamMaquCronAdddEmpl;
    private javax.swing.JLabel lblNameClienteCronCrea;
    private javax.swing.JLabel lblNameProdcCronCrea;
    private javax.swing.JLabel lblTurCronAdddEmpl;
    private javax.swing.JPanel panelCentralArmarCrono;
    private javax.swing.JPanel panelContainerCrearCron;
    private javax.swing.JPanel panelContainerDeleteCron;
    private javax.swing.JPanel panelContainerUpdateCron;
    private javax.swing.JPanel panelContenedorArmarCron;
    private javax.swing.JPanel panelCrearCronAddEmple;
    private javax.swing.JPanel panelCrearCrono;
    private javax.swing.JPanel panelDeleteCrono;
    private javax.swing.JPanel panelOpcionesArmarCron;
    private javax.swing.JPanel panelSupCentArmarCron;
    private javax.swing.JPanel panelUpdateCrono;
    private javax.swing.JTextField txtFieldCronogramaIdCrea;
    private javax.swing.JTextField txtFieldFFCrea;
    private javax.swing.JTextField txtFieldFICrea;
    private javax.swing.JTextField txtFieldNomClientCrea;
    private javax.swing.JTextField txtFieldNomProdcCrea;
    private javax.swing.JTextField txtFieldNumOrdenCrea;
    // End of variables declaration//GEN-END:variables
}
