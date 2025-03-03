/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Beans.Area;
import Beans.Empleado;
import Beans.Maquina;
import Beans.Turno;
import DAO.ConexionBD;
import DAO.TurnoDAO;
import DAO.AreaDAO;
import DAO.MaquinaDAO;
import DAO.EmpleadoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
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
        cargaTurnos();
        cargarAreas();
        cargarDatosEnJTable();
    }
    
    public void vaciarContenedores(){
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(false);
    }
    
    public void cargaTurnos(){
        TurnoDAO turno = new TurnoDAO();
        for (Turno t : turno.ObtenerListaTurnos()){
            jComboxTurnos.addItem(t);
        }
    }
    
    public void cargarAreas(){
        AreaDAO area = new AreaDAO();
        for (Area a : area.obtenerListaAreas()){
            Area areaObj = new Area(a.getIdArea(),a.getNombreArea());
            jComboxAreas.addItem(areaObj);
        }
    }
    
    public void cargarMaquinas(){
        jComboxMaquinas.removeAllItems();
        Area areaSeleccionada = (Area) jComboxAreas.getSelectedItem();
        MaquinaDAO maquina = new MaquinaDAO();
        for (Maquina m : maquina.obtenerListaMaquinas()){
            if(m.getIdArea()== areaSeleccionada.getIdArea()){
                jComboxMaquinas.addItem(m);
            }
        }
    }
    
    public void autocompletarNombreEmpleado(int codigoEmpleado) {
        EmpleadoDAO emp = new EmpleadoDAO();
        try {
            Empleado e = emp.obtenerNombreEmpleado(codigoEmpleado);

            if (e != null) {
                String nombreCompleto = e.getNombreEmpleado() + " " + e.getApellidoEmpleado();
                jTextFieldNombre.setText(nombreCompleto);
                jTextFieldNombre.setEditable(false);
            } else {
                jTextFieldNombre.setText("");  // Limpiar el campo de nombre
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
            }
        } catch (NumberFormatException ex) {
            jTextFieldNombre.setText("");
            JOptionPane.showMessageDialog(null, "Por favor ingresa un código válido");
        }
    }
    
    public void cargarDatosEnJTable() {
        Connection conn = ConexionBD.obtenerConexion();
        String consultaSQL = "SELECT o.idOrden AS 'N° Orden', " +
                             "c.nombre AS 'Cliente', " +
                             "p.nombre AS 'Producto', " +
                             "o.fechaInicio AS 'Fecha inicio', " +
                             "o.fechaAcabado AS 'Fecha Final' " +
                             "FROM orden o " +
                             "JOIN producto p ON o.idProducto = p.idProducto " +
                             "JOIN cliente c ON p.idCliente = c.idCliente";

        DefaultTableModel modelo = (DefaultTableModel) jTableCronogromas.getModel();
        modelo.setRowCount(0);

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consultaSQL)) {

            // Recorrer los resultados de la consulta
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getInt("N° Orden");  // Número de orden
                fila[1] = rs.getString("Cliente");  // Nombre del cliente
                fila[2] = rs.getString("Producto");  // Nombre del producto
                fila[3] = rs.getDate("Fecha inicio");  // Fecha de inicio
                fila[4] = rs.getDate("Fecha Final");  // Fecha final

                modelo.addRow(fila); // Agregamos la fila al modelo
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Para depuración, imprimir error en consola
        }
    }
    
    public void autoCompletarCampos() {
        Connection conn = ConexionBD.obtenerConexion();

        try {
            // Consultar el último idCronograma y su idOrden asociado
            String consulta = "SELECT idCronograma, idOrden FROM cronograma ORDER BY idCronograma DESC LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int ultimoIdCronograma = rs.getInt("idCronograma");
                int idOrden = rs.getInt("idOrden");

                txtFieldCronogramaIdCrea.setText(String.valueOf(ultimoIdCronograma));

                String queryOrden = "SELECT o.idOrden, c.nombre AS Cliente, p.nombre AS Producto, " +
                                    "o.fechaInicio, o.fechaAcabado " +
                                    "FROM orden o " +
                                    "JOIN producto p ON o.idProducto = p.idProducto " +
                                    "JOIN cliente c ON p.idCliente = c.idCliente " +
                                    "WHERE o.idOrden = ?";

                PreparedStatement stmtOrden = conn.prepareStatement(queryOrden);
                stmtOrden.setInt(1, idOrden);
                ResultSet rsOrden = stmtOrden.executeQuery();

                if (rsOrden.next()) {
                    txtFieldNumOrdenCrea.setText(String.valueOf(rsOrden.getInt("idOrden")));
                    txtFieldNomClientCrea.setText(rsOrden.getString("Cliente"));
                    txtFieldNomProdcCrea.setText(rsOrden.getString("Producto"));
                    txtFieldFICrea.setText(rsOrden.getString("fechaInicio"));
                    txtFieldFFCrea.setText(rsOrden.getString("fechaAcabado"));
                }

                stmtOrden.close();
                rsOrden.close();
            }

            stmt.close();
            rs.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cargarEmpleadosCronograma() {
        Connection conn = ConexionBD.obtenerConexion();
        DefaultTableModel modelo = (DefaultTableModel) jTableEmpleadosCronograma.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de llenarla

        try {
            // Obtener el último idCronograma
            String sqlCronograma = "SELECT idCronograma FROM cronograma ORDER BY idCronograma DESC LIMIT 1";
            PreparedStatement stmtCrono = conn.prepareStatement(sqlCronograma);
            ResultSet rsCrono = stmtCrono.executeQuery();

            if (rsCrono.next()) {
                int ultimoIdCronograma = rsCrono.getInt("idCronograma");

                // Consulta para obtener los empleados asignados al último cronograma
                String sql = "SELECT e.nombre, e.apellido, a.nombre AS area, t.nombre AS turno, " +
                             "m.modelo AS maquina, at.fechaAsignacion " +
                             "FROM asignacionturno at " +
                             "JOIN empleado e ON at.idEmpleado = e.idEmpleado " +
                             "JOIN area a ON at.idArea = a.idArea " +
                             "JOIN turno t ON at.idTurno = t.idTurno " +
                             "JOIN maquina m ON at.idMaquina = m.idMaquina " +
                             "WHERE at.idCronograma = ?";

                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, ultimoIdCronograma);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Object[] fila = new Object[5];
                    fila[0] = rs.getString("nombre") + " " + rs.getString("apellido"); // Nombre completo
                    fila[1] = rs.getString("area"); // Área
                    fila[2] = rs.getString("turno"); // Turno
                    fila[3] = rs.getString("maquina"); // Máquina
                    fila[4] = rs.getDate("fechaAsignacion"); // Fecha de Asignación

                    modelo.addRow(fila); // Agregar fila a la tabla
                }

                stmt.close();
                rs.close();
            }

            stmtCrono.close();
            rsCrono.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarAsignacionTurno(){
        Area a = (Area) jComboxAreas.getSelectedItem();
        Maquina m = (Maquina) jComboxMaquinas.getSelectedItem();
        Turno t = (Turno) jComboxTurnos.getSelectedItem();
        int empleadoCodigo = Integer.parseInt(jTextFieldCodigo.getText());
        int numeroCronograma = Integer.parseInt(txtFieldCronogramaIdCrea.getText());

        // Validación para verificar si se ha seleccionado una fecha
        Date fechaAsignacion = jDateChooser1.getDate();
        if (fechaAsignacion == null) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fecha.");
            return;  // Salir de la función si la fecha es nula
        }

        // Convertir de java.util.Date a java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(fechaAsignacion.getTime());

        String insertSQL = "INSERT INTO AsignacionTurno (idEmpleado, idArea, idTurno, fechaAsignacion, idMaquina, idCronograma) "
                         + "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(insertSQL)) {

            // Establecer los parámetros de la consulta
            stmt.setInt(1, empleadoCodigo); // idEmpleado
            stmt.setInt(2, a.getIdArea()); // idArea
            stmt.setInt(3, t.getIdTurno()); // idTurno
            stmt.setDate(4, sqlDate); // fechaAsignacion
            stmt.setInt(5, m.getIdMaquina()); // idMaquina
            stmt.setInt(6, numeroCronograma); // idCronograma

            // Ejecutar la consulta
            int rowsInserted = stmt.executeUpdate();

            // Confirmar si los datos fueron insertados
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Asignación de turno guardada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar la asignación de turno.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al realizar la inserción: " + e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorArmarCron = new javax.swing.JPanel();
        panelCentralArmarCrono = new javax.swing.JPanel();
        jScrollPanelCronogramas = new javax.swing.JScrollPane();
        jTableCronogromas = new javax.swing.JTable();
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
        jTableEmpleadosCronograma = new javax.swing.JTable();
        txtFieldNumOrdenCrea = new javax.swing.JTextField();
        txtFieldNomClientCrea = new javax.swing.JTextField();
        txtFieldNomProdcCrea = new javax.swing.JTextField();
        txtFieldFICrea = new javax.swing.JTextField();
        txtFieldFFCrea = new javax.swing.JTextField();
        btnGuardarCrear = new javax.swing.JButton();
        btnAgregarEmpleCron = new javax.swing.JButton();
        lblCodCronograma = new javax.swing.JLabel();
        txtFieldCronogramaIdCrea = new javax.swing.JTextField();
        panelCrearCronAddEmple = new javax.swing.JPanel();
        lblCodEmplCronAdddEmpl = new javax.swing.JLabel();
        lblNamEmplCronAdddEmpl = new javax.swing.JLabel();
        lblTurCronAdddEmpl = new javax.swing.JLabel();
        lblAreaCronAdddEmpl = new javax.swing.JLabel();
        lblNamMaquCronAdddEmpl = new javax.swing.JLabel();
        lblDateAsigCronAdddEmpl = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jComboxTurnos = new javax.swing.JComboBox<>();
        jComboxAreas = new javax.swing.JComboBox<>();
        jComboxMaquinas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButtonAsignacionEmpleado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenedorArmarCron.setPreferredSize(new java.awt.Dimension(840, 560));

        panelCentralArmarCrono.setBackground(new java.awt.Color(204, 204, 255));
        panelCentralArmarCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCentralArmarCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCronogromas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nº Orden","Cliente","Producto", "Fecha inicio", "Fecha Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanelCronogramas.setViewportView(jTableCronogromas);

        panelCentralArmarCrono.add(jScrollPanelCronogramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 440));

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

        panelCrearCrono.setBackground(new java.awt.Color(255, 204, 204));
        panelCrearCrono.setPreferredSize(new java.awt.Dimension(840, 560));
        panelCrearCrono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodOrden.setText("N° Orden");
        panelCrearCrono.add(lblCodOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        lblNameClienteCronCrea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameClienteCronCrea.setText("Nombre Cliente");
        panelCrearCrono.add(lblNameClienteCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblNameProdcCronCrea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameProdcCronCrea.setText("Nombre Producto");
        panelCrearCrono.add(lblNameProdcCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));

        lblFechaInicioCronCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInicioCronCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInicioCronCrear.setText("Fecha Inicio");
        panelCrearCrono.add(lblFechaInicioCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblFechaFinCronCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaFinCronCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFinCronCrear.setText("Fecha Final");
        panelCrearCrono.add(lblFechaFinCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, -1));

        jTableEmpleadosCronograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nombre ", "Area", "Turno", "Maquina", "Fecha Asignacion"
            }
        ));
        jScrollPane2.setViewportView(jTableEmpleadosCronograma);

        panelCrearCrono.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 820, 250));

        txtFieldNumOrdenCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNumOrdenCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 130, 50));

        txtFieldNomClientCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNomClientCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, -1));

        txtFieldNomProdcCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldNomProdcCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, -1));

        txtFieldFICrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldFICrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, -1));

        txtFieldFFCrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCrearCrono.add(txtFieldFFCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, -1));

        btnGuardarCrear.setText("Guardar");
        btnGuardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCrearActionPerformed(evt);
            }
        });
        panelCrearCrono.add(btnGuardarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 180, 40));

        btnAgregarEmpleCron.setText("Agregar");
        btnAgregarEmpleCron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleCronActionPerformed(evt);
            }
        });
        panelCrearCrono.add(btnAgregarEmpleCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 180, 40));

        lblCodCronograma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodCronograma.setText("N° Cronograma");
        panelCrearCrono.add(lblCodCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelCrearCrono.add(txtFieldCronogramaIdCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 50));

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

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 180, 30));

        jComboxTurnos.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboxTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboxTurnosActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jComboxTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 180, 30));

        jComboxAreas.setModel(new javax.swing.DefaultComboBoxModel<Area>());
        jComboxAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboxAreasActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jComboxAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 180, 30));

        jComboxMaquinas.setModel(new javax.swing.DefaultComboBoxModel<>());
        panelCrearCronAddEmple.add(jComboxMaquinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 153));
        jLabel8.setOpaque(true);
        panelCrearCronAddEmple.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 560));

        jButtonAsignacionEmpleado.setBackground(new java.awt.Color(255, 204, 153));
        jButtonAsignacionEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAsignacionEmpleado.setText("Guardar");
        jButtonAsignacionEmpleado.setBorder(null);
        jButtonAsignacionEmpleado.setBorderPainted(false);
        jButtonAsignacionEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAsignacionEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAsignacionEmpleadoMouseExited(evt);
            }
        });
        jButtonAsignacionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignacionEmpleadoActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jButtonAsignacionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 160, 60));

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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        panelCrearCronAddEmple.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, 30));
        panelCrearCronAddEmple.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 180, 30));

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
        );

        add(panelContenedorArmarCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearActionPerformed
        
    }//GEN-LAST:event_btnGuardarCrearActionPerformed

    private void btnAgregarEmpleCronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleCronActionPerformed
        panelCrearCrono.setVisible(false);
        panelCrearCronAddEmple.setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleCronActionPerformed

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
        autoCompletarCampos();
        cargarEmpleadosCronograma();
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

    private void jButtonAsignacionEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsignacionEmpleadoMouseEntered
        jButtonAsignacionEmpleado.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jButtonAsignacionEmpleadoMouseEntered

    private void jButtonAsignacionEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsignacionEmpleadoMouseExited
        jButtonAsignacionEmpleado.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jButtonAsignacionEmpleadoMouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButtonAsignacionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignacionEmpleadoActionPerformed
        guardarAsignacionTurno();
    }//GEN-LAST:event_jButtonAsignacionEmpleadoActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        int codigoEmpleado = Integer.parseInt(jTextFieldCodigo.getText());
        autocompletarNombreEmpleado(codigoEmpleado);
        
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jComboxTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboxTurnosActionPerformed
        
    }//GEN-LAST:event_jComboxTurnosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboxAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboxAreasActionPerformed
        cargarMaquinas();
    }//GEN-LAST:event_jComboxAreasActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        EmpleadoDAO emp = new EmpleadoDAO();
        try {
            int codigoEmpleado = Integer.parseInt(jTextFieldCodigo.getText());
            Empleado e = emp.obtenerNombreEmpleado(codigoEmpleado);
            String nombreCompleto = e.getNombreEmpleado() + " " + e.getApellidoEmpleado();
            jTextFieldNombre.setText(nombreCompleto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa un código válido");
        }
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JComboBox<String> Orden;
    private javax.swing.JButton btnAgregarEmpleCron;
    private javax.swing.JButton btnGuardarCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAsignacionEmpleado;
    private javax.swing.JComboBox<Area> jComboxAreas;
    private javax.swing.JComboBox<Maquina> jComboxMaquinas;
    private javax.swing.JComboBox<Turno> jComboxTurnos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPanelCronogramas;
    private javax.swing.JTable jTableCronogromas;
    private javax.swing.JTable jTableEmpleadosCronograma;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
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
    private javax.swing.JPanel panelOpcionesArmarCron;
    private javax.swing.JPanel panelSupCentArmarCron;
    private javax.swing.JTextField txtFieldCronogramaIdCrea;
    private javax.swing.JTextField txtFieldFFCrea;
    private javax.swing.JTextField txtFieldFICrea;
    private javax.swing.JTextField txtFieldNomClientCrea;
    private javax.swing.JTextField txtFieldNomProdcCrea;
    private javax.swing.JTextField txtFieldNumOrdenCrea;
    // End of variables declaration//GEN-END:variables
}
