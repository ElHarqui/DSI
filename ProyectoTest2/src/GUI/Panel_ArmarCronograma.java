/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel_ArmarCronograma extends javax.swing.JPanel {
    
    public boolean indicadorZ = false;
    private  DefaultTableModel dtm;
    private Object[] o  = new Object[3];
    
    public Panel_ArmarCronograma() {
        initComponents();
        vaciarContenedores();
        noEnabled();
        txtFieldNomProdcCrea.setText("pene");
        dtm = (DefaultTableModel) tableOrdenes.getModel();
    }

    public void vaciarContenedores(){
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(false);
        panelListarCrono.setVisible(false);
        panelUpdateCrono.setVisible(false);
    }
    
    
    
    public void noEnabled(){
        
        txtFieldNomProdcCrea.setEnabled(false);
        txtFieldNomProdcUpdate.setEnabled(false);
        txtFieldNomClientCrea.setEnabled(false);
        txtFieldNomClientUpdate.setEnabled(false);
        txtFieldNumOrdenCrea.setEnabled(false);
        txtFieldNumOrdenCUpdate.setEnabled(false);
        txtFieldCronogramaIdCrea.setEnabled(false);
        txtFieldCronogramaIdUpdate.setEnabled(false);
        txtFieldNomEmpleAdd.setEnabled(false);
        comboBoxAreaCrono.setEnabled(false);
        comboBoxMaquinaCrono.setEnabled(false);
        comboBoxTurnoCrono.setEnabled(false);
        jDateChooserFechaAsignacionCrearCrono.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorArmarCron = new javax.swing.JPanel();
        panelCentralArmarCrono = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrdenes = new javax.swing.JTable();
        panelOpcionesArmarCron = new javax.swing.JPanel();
        panelContainerCrearCron = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelContainerListarCron = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        btnGuardarCrear = new javax.swing.JButton();
        btnAgregarEmpleCron = new javax.swing.JButton();
        lblCodCronograma = new javax.swing.JLabel();
        txtFieldCronogramaIdCrea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooserFinalCrea = new com.toedter.calendar.JDateChooser();
        jDateChooserInicialCrea = new com.toedter.calendar.JDateChooser();
        panelCrearCronAddEmple = new javax.swing.JPanel();
        lblCodEmplCronAdddEmpl = new javax.swing.JLabel();
        lblNamEmplCronAdddEmpl = new javax.swing.JLabel();
        lblTurCronAdddEmpl = new javax.swing.JLabel();
        lblAreaCronAdddEmpl = new javax.swing.JLabel();
        lblNamMaquCronAdddEmpl = new javax.swing.JLabel();
        lblDateAsigCronAdddEmpl = new javax.swing.JLabel();
        txtFieldCodigoEmplAdd = new javax.swing.JTextField();
        comboBoxTurnoCrono = new javax.swing.JComboBox<>();
        comboBoxAreaCrono = new javax.swing.JComboBox<>();
        comboBoxMaquinaCrono = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtFieldNomEmpleAdd = new javax.swing.JTextField();
        jDateChooserFechaAsignacionCrearCrono = new com.toedter.calendar.JDateChooser();
        panelUpdateCrono = new javax.swing.JPanel();
        lblCodOrden1 = new javax.swing.JLabel();
        lblNameClienteCronCrea1 = new javax.swing.JLabel();
        lblNameProdcCronCrea1 = new javax.swing.JLabel();
        lblFechaInicioCronCrear1 = new javax.swing.JLabel();
        lblFechaFinCronCrear1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtFieldNumOrdenCUpdate = new javax.swing.JTextField();
        txtFieldNomClientUpdate = new javax.swing.JTextField();
        txtFieldNomProdcUpdate = new javax.swing.JTextField();
        btnGuardarUpdate = new javax.swing.JButton();
        btnEliminarEmpleCron = new javax.swing.JButton();
        lblCodCronograma1 = new javax.swing.JLabel();
        txtFieldCronogramaIdUpdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserFinalUpdate = new com.toedter.calendar.JDateChooser();
        jDateChooserInicioUpdate = new com.toedter.calendar.JDateChooser();
        btnAgregarEmpleCron2 = new javax.swing.JButton();
        panelListarCrono = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCronogramas = new javax.swing.JTable();
        panelOpcionesArmarCron2 = new javax.swing.JPanel();
        panelContainerUpdateCron2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panelContainerDeleteCron2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        panelSupCentArmarCron2 = new javax.swing.JPanel();
        IDText2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        Orden2 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenedorArmarCron.setPreferredSize(new java.awt.Dimension(840, 560));

        panelCentralArmarCrono.setBackground(new java.awt.Color(204, 204, 255));
        panelCentralArmarCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCentralArmarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableOrdenes);

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

        panelContainerListarCron.setBackground(new java.awt.Color(153, 153, 255));
        panelContainerListarCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerListarCronMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerListarCronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerListarCronMouseExited(evt);
            }
        });
        panelContainerListarCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/listar.png"))); // NOI18N
        panelContainerListarCron.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setText("Listar");
        panelContainerListarCron.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesArmarCron.add(panelContainerListarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 50));

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

        panelCrearCrono.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 790, 240));

        txtFieldNumOrdenCrea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFieldNumOrdenCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNumOrdenCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 130, 50));

        txtFieldNomClientCrea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFieldNomClientCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNomClientCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 200, -1));

        txtFieldNomProdcCrea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFieldNomProdcCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNomProdcCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

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

        txtFieldCronogramaIdCrea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelCrearCrono.add(txtFieldCronogramaIdCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 50));

        jLabel7.setBackground(new java.awt.Color(255, 64, 64));
        jLabel7.setOpaque(true);
        panelCrearCrono.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 170, 120));

        jLabel12.setBackground(new java.awt.Color(255, 64, 64));
        jLabel12.setOpaque(true);
        panelCrearCrono.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 120));
        panelCrearCrono.add(jDateChooserFinalCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, -1));
        panelCrearCrono.add(jDateChooserInicialCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, -1));

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
        panelCrearCronAddEmple.add(txtFieldCodigoEmplAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 180, 30));

        panelCrearCronAddEmple.add(comboBoxTurnoCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 180, 30));

        panelCrearCronAddEmple.add(comboBoxAreaCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 180, 30));

        panelCrearCronAddEmple.add(comboBoxMaquinaCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

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
        panelCrearCronAddEmple.add(txtFieldNomEmpleAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, 30));
        panelCrearCronAddEmple.add(jDateChooserFechaAsignacionCrearCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 180, 30));

        panelUpdateCrono.setBackground(new java.awt.Color(247, 191, 216));
        panelUpdateCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodOrden1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodOrden1.setText("N° Orden");
        panelUpdateCrono.add(lblCodOrden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        lblNameClienteCronCrea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameClienteCronCrea1.setText("Nombre Cliente");
        panelUpdateCrono.add(lblNameClienteCronCrea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        lblNameProdcCronCrea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameProdcCronCrea1.setText("Nombre Producto");
        panelUpdateCrono.add(lblNameProdcCronCrea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));

        lblFechaInicioCronCrear1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInicioCronCrear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInicioCronCrear1.setText("Fecha Inicio");
        panelUpdateCrono.add(lblFechaInicioCronCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        lblFechaFinCronCrear1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaFinCronCrear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFinCronCrear1.setText("Fecha Final");
        panelUpdateCrono.add(lblFechaFinCronCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, -1));

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
        jScrollPane3.setViewportView(jTable3);

        panelUpdateCrono.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 790, 240));

        txtFieldNumOrdenCUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUpdateCrono.add(txtFieldNumOrdenCUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 130, 50));

        txtFieldNomClientUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUpdateCrono.add(txtFieldNomClientUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 200, -1));

        txtFieldNomProdcUpdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUpdateCrono.add(txtFieldNomProdcUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

        btnGuardarUpdate.setText("Guardar");
        btnGuardarUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUpdateActionPerformed(evt);
            }
        });
        panelUpdateCrono.add(btnGuardarUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 120, 40));

        btnEliminarEmpleCron.setText("Eliminar");
        btnEliminarEmpleCron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleCronActionPerformed(evt);
            }
        });
        panelUpdateCrono.add(btnEliminarEmpleCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 120, 40));

        lblCodCronograma1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodCronograma1.setText("N° Cronograma");
        panelUpdateCrono.add(lblCodCronograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelUpdateCrono.add(txtFieldCronogramaIdUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 50));

        jLabel11.setBackground(new java.awt.Color(247, 71, 128));
        jLabel11.setOpaque(true);
        panelUpdateCrono.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 170, 120));

        jLabel13.setBackground(new java.awt.Color(247, 71, 128));
        jLabel13.setOpaque(true);
        panelUpdateCrono.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 120));
        panelUpdateCrono.add(jDateChooserFinalUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, -1));
        panelUpdateCrono.add(jDateChooserInicioUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, -1));

        btnAgregarEmpleCron2.setText("Agregar");
        btnAgregarEmpleCron2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleCron2ActionPerformed(evt);
            }
        });
        panelUpdateCrono.add(btnAgregarEmpleCron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 120, 40));

        panelListarCrono.setBackground(new java.awt.Color(204, 255, 204));
        panelListarCrono.setAlignmentX(0.5F);
        panelListarCrono.setAlignmentY(0.5F);
        panelListarCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelListarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCronogramas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Cronograma", "Producto", "Fecha inicio", "Fecha Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tableCronogramas);

        panelListarCrono.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 440));

        panelOpcionesArmarCron2.setBackground(new java.awt.Color(153, 255, 153));
        panelOpcionesArmarCron2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContainerUpdateCron2.setBackground(new java.awt.Color(153, 255, 153));
        panelContainerUpdateCron2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCron2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCron2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCron2MouseExited(evt);
            }
        });
        panelContainerUpdateCron2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/update2.png"))); // NOI18N
        panelContainerUpdateCron2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel30.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel30.setText("Modificar");
        panelContainerUpdateCron2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesArmarCron2.add(panelContainerUpdateCron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 50));

        panelContainerDeleteCron2.setBackground(new java.awt.Color(153, 255, 153));
        panelContainerDeleteCron2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCron2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCron2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCron2MouseExited(evt);
            }
        });
        panelContainerDeleteCron2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/delete.png"))); // NOI18N
        panelContainerDeleteCron2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel32.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel32.setText("Eliminar");
        panelContainerDeleteCron2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        panelOpcionesArmarCron2.add(panelContainerDeleteCron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 50));

        panelListarCrono.add(panelOpcionesArmarCron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 370));

        panelSupCentArmarCron2.setBackground(new java.awt.Color(0, 204, 153));
        panelSupCentArmarCron2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDText2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDText2.setText("Ingrese el código a buscar...");
        IDText2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDText2MouseClicked(evt);
            }
        });
        IDText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDText2ActionPerformed(evt);
            }
        });
        panelSupCentArmarCron2.add(IDText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 210, -1));

        jButton9.setBackground(new java.awt.Color(102, 102, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/search.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        panelSupCentArmarCron2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Orden2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orden2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "Menor a mayor", "Mayor a menor" }));
        Orden2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orden2ActionPerformed(evt);
            }
        });
        panelSupCentArmarCron2.add(Orden2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 150, -1));

        jButton10.setBackground(new java.awt.Color(102, 102, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/sort.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        panelSupCentArmarCron2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 70));

        panelListarCrono.add(panelSupCentArmarCron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 110));

        javax.swing.GroupLayout panelContenedorArmarCronLayout = new javax.swing.GroupLayout(panelContenedorArmarCron);
        panelContenedorArmarCron.setLayout(panelContenedorArmarCronLayout);
        panelContenedorArmarCronLayout.setHorizontalGroup(
            panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
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
                    .addComponent(panelUpdateCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorArmarCronLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panelContenedorArmarCronLayout.setVerticalGroup(
            panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
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
                    .addComponent(panelUpdateCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelContenedorArmarCronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorArmarCronLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        add(panelContenedorArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void panelContainerCrearCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearCronMouseEntered
        panelContainerCrearCron.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerCrearCronMouseEntered

    private void panelContainerCrearCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerCrearCronMouseExited
        panelContainerCrearCron.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerCrearCronMouseExited

    private void panelContainerListarCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerListarCronMouseEntered
        panelContainerListarCron.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_panelContainerListarCronMouseEntered
    
    private void panelContainerListarCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerListarCronMouseExited
        panelContainerListarCron.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_panelContainerListarCronMouseExited

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
        if(tableOrdenes.getSelectedRow() ==  -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna orden", "Error al crear cronograma. No ha seleccionado una orden a programar", ERROR);
        }else{
            panelCentralArmarCrono.setVisible(false);
            panelCrearCrono.setVisible(true);
            indicadorZ = true;
        }
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
        if (indicadorZ == true) {
            //Si busca con lupa, se activa el boton de guardar
        }else {
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed

    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void btnAgregarEmpleCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCronActionPerformed
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleCronActionPerformed

    private void btnGuardarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarUpdateActionPerformed

    private void btnEliminarEmpleCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleCronActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEmpleCronActionPerformed

    private void btnAgregarEmpleCron2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCron2ActionPerformed
        panelUpdateCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(false);
    }//GEN-LAST:event_btnAgregarEmpleCron2ActionPerformed

    private void panelContainerUpdateCron2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCron2MouseEntered
        panelContainerUpdateCron2.setBackground(new Color(204,255,204));
    }//GEN-LAST:event_panelContainerUpdateCron2MouseEntered

    private void panelContainerUpdateCron2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCron2MouseExited
        panelContainerUpdateCron2.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_panelContainerUpdateCron2MouseExited

    private void panelContainerDeleteCron2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCron2MouseEntered
        panelContainerDeleteCron2.setBackground(new Color(204,255,204));
    }//GEN-LAST:event_panelContainerDeleteCron2MouseEntered

    private void panelContainerDeleteCron2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCron2MouseExited
        panelContainerDeleteCron2.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_panelContainerDeleteCron2MouseExited

    private void IDText2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDText2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IDText2MouseClicked

    private void IDText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDText2ActionPerformed

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseExited

    private void Orden2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orden2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Orden2ActionPerformed

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseExited

    private void panelContainerListarCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerListarCronMouseClicked
        panelCentralArmarCrono.setVisible(false);
        panelListarCrono.setVisible(true);
    }//GEN-LAST:event_panelContainerListarCronMouseClicked

    private void panelContainerUpdateCron2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCron2MouseClicked
        if(tableCronogramas.getSelectedRow() ==  -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cronograma a modificar", "Error al crear cronograma. No ha seleccionado una orden a programar", ERROR);
        }else{
            panelListarCrono.setVisible(false);
            panelUpdateCrono.setVisible(true);
            indicadorZ = true;
        }
    }//GEN-LAST:event_panelContainerUpdateCron2MouseClicked

    private void panelContainerDeleteCron2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCron2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelContainerDeleteCron2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JTextField IDText2;
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JComboBox<String> Orden2;
    private javax.swing.JButton btnAgregarEmpleCron;
    private javax.swing.JButton btnAgregarEmpleCron2;
    private javax.swing.JButton btnEliminarEmpleCron;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton btnGuardarUpdate;
    private javax.swing.JComboBox<String> comboBoxAreaCrono;
    private javax.swing.JComboBox<String> comboBoxMaquinaCrono;
    private javax.swing.JComboBox<String> comboBoxTurnoCrono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooserFechaAsignacionCrearCrono;
    private com.toedter.calendar.JDateChooser jDateChooserFinalCrea;
    private com.toedter.calendar.JDateChooser jDateChooserFinalUpdate;
    private com.toedter.calendar.JDateChooser jDateChooserInicialCrea;
    private com.toedter.calendar.JDateChooser jDateChooserInicioUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblAreaCronAdddEmpl;
    private javax.swing.JLabel lblCodCronograma;
    private javax.swing.JLabel lblCodCronograma1;
    private javax.swing.JLabel lblCodEmplCronAdddEmpl;
    private javax.swing.JLabel lblCodOrden;
    private javax.swing.JLabel lblCodOrden1;
    private javax.swing.JLabel lblDateAsigCronAdddEmpl;
    private javax.swing.JLabel lblFechaFinCronCrear;
    private javax.swing.JLabel lblFechaFinCronCrear1;
    private javax.swing.JLabel lblFechaInicioCronCrear;
    private javax.swing.JLabel lblFechaInicioCronCrear1;
    private javax.swing.JLabel lblNamEmplCronAdddEmpl;
    private javax.swing.JLabel lblNamMaquCronAdddEmpl;
    private javax.swing.JLabel lblNameClienteCronCrea;
    private javax.swing.JLabel lblNameClienteCronCrea1;
    private javax.swing.JLabel lblNameProdcCronCrea;
    private javax.swing.JLabel lblNameProdcCronCrea1;
    private javax.swing.JLabel lblTurCronAdddEmpl;
    private javax.swing.JPanel panelCentralArmarCrono;
    private javax.swing.JPanel panelContainerCrearCron;
    private javax.swing.JPanel panelContainerDeleteCron2;
    private javax.swing.JPanel panelContainerListarCron;
    private javax.swing.JPanel panelContainerUpdateCron2;
    private javax.swing.JPanel panelContenedorArmarCron;
    private javax.swing.JPanel panelCrearCronAddEmple;
    private javax.swing.JPanel panelCrearCrono;
    private javax.swing.JPanel panelListarCrono;
    private javax.swing.JPanel panelOpcionesArmarCron;
    private javax.swing.JPanel panelOpcionesArmarCron2;
    private javax.swing.JPanel panelSupCentArmarCron;
    private javax.swing.JPanel panelSupCentArmarCron2;
    private javax.swing.JPanel panelUpdateCrono;
    private javax.swing.JTable tableCronogramas;
    private javax.swing.JTable tableOrdenes;
    private javax.swing.JTextField txtFieldCodigoEmplAdd;
    private javax.swing.JTextField txtFieldCronogramaIdCrea;
    private javax.swing.JTextField txtFieldCronogramaIdUpdate;
    private javax.swing.JTextField txtFieldNomClientCrea;
    private javax.swing.JTextField txtFieldNomClientUpdate;
    private javax.swing.JTextField txtFieldNomEmpleAdd;
    private javax.swing.JTextField txtFieldNomProdcCrea;
    private javax.swing.JTextField txtFieldNomProdcUpdate;
    private javax.swing.JTextField txtFieldNumOrdenCUpdate;
    private javax.swing.JTextField txtFieldNumOrdenCrea;
    // End of variables declaration//GEN-END:variables
}
