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

    private void vaciarContenedores(){
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
        scrollPanelOrdenesCrono = new javax.swing.JScrollPane();
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
        scrollPaneEmpleadosCrearCron = new javax.swing.JScrollPane();
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
        btnEliminarEmpleCronUpdate1 = new javax.swing.JButton();
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
        btnGuardarEmpleado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBuscarEmpleado = new javax.swing.JButton();
        txtFieldNomEmpleAdd = new javax.swing.JTextField();
        jDateChooserFechaAsignacionCrearCrono = new com.toedter.calendar.JDateChooser();
        panelUpdateCrono = new javax.swing.JPanel();
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
        panelListarCrono = new javax.swing.JPanel();
        scrollPanelCrono = new javax.swing.JScrollPane();
        tableCronogramas = new javax.swing.JTable();
        panelOpcionesListarCrono = new javax.swing.JPanel();
        panelContainerUpdateCron = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        panelContainerDeleteCron = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        panelSupCentListarCrono = new javax.swing.JPanel();
        IDText3 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        Orden3 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();

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
        scrollPanelOrdenesCrono.setViewportView(tableOrdenes);

        panelCentralArmarCrono.add(scrollPanelOrdenesCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 440));

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
        scrollPaneEmpleadosCrearCron.setViewportView(jTable2);

        panelCrearCrono.add(scrollPaneEmpleadosCrearCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 790, 240));

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
        panelCrearCrono.add(btnGuardarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 120, 40));

        btnAgregarEmpleCron.setText("Agregar");
        btnAgregarEmpleCron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleCronActionPerformed(evt);
            }
        });
        panelCrearCrono.add(btnAgregarEmpleCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 120, 40));

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

        btnEliminarEmpleCronUpdate1.setText("Eliminar");
        btnEliminarEmpleCronUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleCronUpdate1ActionPerformed(evt);
            }
        });
        panelCrearCrono.add(btnEliminarEmpleCronUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 120, 40));

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

        btnGuardarEmpleado.setBackground(new java.awt.Color(255, 204, 153));
        btnGuardarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.setBorder(null);
        btnGuardarEmpleado.setBorderPainted(false);
        btnGuardarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarEmpleadoMouseExited(evt);
            }
        });
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(btnGuardarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 160, 60));

        jLabel9.setBackground(new java.awt.Color(255, 255, 153));
        jLabel9.setOpaque(true);
        panelCrearCronAddEmple.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 130, 560));

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setOpaque(true);
        panelCrearCronAddEmple.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 580, 30));

        btnBuscarEmpleado.setBackground(new java.awt.Color(255, 204, 153));
        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/search.png"))); // NOI18N
        btnBuscarEmpleado.setBorder(null);
        btnBuscarEmpleado.setBorderPainted(false);
        btnBuscarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseExited(evt);
            }
        });
        panelCrearCronAddEmple.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));
        panelCrearCronAddEmple.add(txtFieldNomEmpleAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, 30));
        panelCrearCronAddEmple.add(jDateChooserFechaAsignacionCrearCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 180, 30));

        panelUpdateCrono.setBackground(new java.awt.Color(247, 191, 216));
        panelUpdateCrono.setMinimumSize(new java.awt.Dimension(0, 0));
        panelUpdateCrono.setPreferredSize(new java.awt.Dimension(840, 560));
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
        scrollPaneUpdateCron.setViewportView(jTable3);

        panelUpdateCrono.add(scrollPaneUpdateCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 790, 240));

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

        btnEliminarEmpleCronUpdate.setText("Eliminar");
        btnEliminarEmpleCronUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleCronUpdateActionPerformed(evt);
            }
        });
        panelUpdateCrono.add(btnEliminarEmpleCronUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 120, 40));

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

        btnAgregarEmpleCronUpdate.setText("Agregar");
        btnAgregarEmpleCronUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleCronUpdateActionPerformed(evt);
            }
        });
        panelUpdateCrono.add(btnAgregarEmpleCronUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 120, 40));

        panelListarCrono.setBackground(new java.awt.Color(204, 255, 204));
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
        scrollPanelCrono.setViewportView(tableCronogramas);

        panelListarCrono.add(scrollPanelCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 440));

        panelOpcionesListarCrono.setBackground(new java.awt.Color(153, 255, 153));
        panelOpcionesListarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContainerUpdateCron.setBackground(new java.awt.Color(153, 255, 153));
        panelContainerUpdateCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCronMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerUpdateCronMouseExited(evt);
            }
        });
        panelContainerUpdateCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/update2.png"))); // NOI18N
        panelContainerUpdateCron.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel34.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel34.setText("Modificar");
        panelContainerUpdateCron.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        panelOpcionesListarCrono.add(panelContainerUpdateCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 50));

        panelContainerDeleteCron.setBackground(new java.awt.Color(153, 255, 153));
        panelContainerDeleteCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCronMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelContainerDeleteCronMouseExited(evt);
            }
        });
        panelContainerDeleteCron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/delete.png"))); // NOI18N
        panelContainerDeleteCron.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 40, -1));

        jLabel36.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel36.setText("Eliminar");
        panelContainerDeleteCron.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        panelOpcionesListarCrono.add(panelContainerDeleteCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 50));

        panelListarCrono.add(panelOpcionesListarCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 370));

        panelSupCentListarCrono.setBackground(new java.awt.Color(0, 204, 153));
        panelSupCentListarCrono.setMinimumSize(new java.awt.Dimension(0, 0));
        panelSupCentListarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDText3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDText3.setText("Ingrese el código a buscar...");
        IDText3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDText3MouseClicked(evt);
            }
        });
        IDText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDText3ActionPerformed(evt);
            }
        });
        panelSupCentListarCrono.add(IDText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 210, -1));

        jButton11.setBackground(new java.awt.Color(0, 204, 153));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/search.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        panelSupCentListarCrono.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Orden3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orden3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar", "Menor a mayor", "Mayor a menor" }));
        Orden3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orden3ActionPerformed(evt);
            }
        });
        panelSupCentListarCrono.add(Orden3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 150, -1));

        jButton12.setBackground(new java.awt.Color(0, 204, 153));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/sort.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        panelSupCentListarCrono.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 70));

        panelListarCrono.add(panelSupCentListarCrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 110));

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
                    .addComponent(panelListarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(panelListarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnGuardarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoMouseEntered
        btnGuardarEmpleado.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_btnGuardarEmpleadoMouseEntered

    private void btnGuardarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoMouseExited
        btnGuardarEmpleado.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_btnGuardarEmpleadoMouseExited

    private void btnBuscarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseEntered
        btnBuscarEmpleado.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_btnBuscarEmpleadoMouseEntered

    private void btnBuscarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseExited
        btnBuscarEmpleado.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_btnBuscarEmpleadoMouseExited

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        if (indicadorZ == true) {
            //Si busca con lupa, se activa el boton de guardar
        }else {
            
        }
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed

    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void btnAgregarEmpleCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCronActionPerformed
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleCronActionPerformed

    private void btnGuardarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarUpdateActionPerformed

    private void btnEliminarEmpleCronUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleCronUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEmpleCronUpdateActionPerformed

    private void btnAgregarEmpleCronUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCronUpdateActionPerformed
        panelUpdateCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleCronUpdateActionPerformed

    private void panelContainerListarCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerListarCronMouseClicked
        panelCentralArmarCrono.setVisible(false);
        panelListarCrono.setVisible(true);
    }//GEN-LAST:event_panelContainerListarCronMouseClicked

    private void panelContainerUpdateCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCronMouseClicked
        if(tableCronogramas.getSelectedRow() ==  -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cronograma a modificar", "Error al crear cronograma. No ha seleccionado una orden a programar", ERROR);
        }else{
            panelListarCrono.setVisible(false);
            panelUpdateCrono.setVisible(true);
            indicadorZ = true;
        }
    }//GEN-LAST:event_panelContainerUpdateCronMouseClicked

    private void panelContainerUpdateCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCronMouseEntered
        panelContainerUpdateCron.setBackground(new Color(204,255,204));
    }//GEN-LAST:event_panelContainerUpdateCronMouseEntered

    private void panelContainerUpdateCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerUpdateCronMouseExited
        panelContainerUpdateCron.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_panelContainerUpdateCronMouseExited

    private void panelContainerDeleteCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCronMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelContainerDeleteCronMouseClicked

    private void panelContainerDeleteCronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCronMouseEntered
        panelContainerDeleteCron.setBackground(new Color(204,255,204));
    }//GEN-LAST:event_panelContainerDeleteCronMouseEntered

    private void panelContainerDeleteCronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContainerDeleteCronMouseExited
        panelContainerDeleteCron.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_panelContainerDeleteCronMouseExited

    private void IDText3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDText3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IDText3MouseClicked

    private void IDText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDText3ActionPerformed

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseExited

    private void Orden3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orden3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Orden3ActionPerformed

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseExited

    private void btnEliminarEmpleCronUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleCronUpdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEmpleCronUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JTextField IDText3;
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JComboBox<String> Orden3;
    private javax.swing.JButton btnAgregarEmpleCron;
    private javax.swing.JButton btnAgregarEmpleCronUpdate;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEliminarEmpleCronUpdate;
    private javax.swing.JButton btnEliminarEmpleCronUpdate1;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnGuardarUpdate;
    private javax.swing.JComboBox<String> comboBoxAreaCrono;
    private javax.swing.JComboBox<String> comboBoxMaquinaCrono;
    private javax.swing.JComboBox<String> comboBoxTurnoCrono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel panelContainerDeleteCron;
    private javax.swing.JPanel panelContainerListarCron;
    private javax.swing.JPanel panelContainerUpdateCron;
    private javax.swing.JPanel panelContenedorArmarCron;
    private javax.swing.JPanel panelCrearCronAddEmple;
    private javax.swing.JPanel panelCrearCrono;
    private javax.swing.JPanel panelListarCrono;
    private javax.swing.JPanel panelOpcionesArmarCron;
    private javax.swing.JPanel panelOpcionesListarCrono;
    private javax.swing.JPanel panelSupCentArmarCron;
    private javax.swing.JPanel panelSupCentListarCrono;
    private javax.swing.JPanel panelUpdateCrono;
    private javax.swing.JScrollPane scrollPaneEmpleadosCrearCron;
    private javax.swing.JScrollPane scrollPaneUpdateCron;
    private javax.swing.JScrollPane scrollPanelCrono;
    private javax.swing.JScrollPane scrollPanelOrdenesCrono;
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
