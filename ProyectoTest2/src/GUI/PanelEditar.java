/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Beans.Cliente;
import Beans.Orden;
import Beans.Producto;
import DAO.ClienteDAO;
import DAO.OrdenDAO;
import DAO.ProductoDAO;
import com.toedter.calendar.JDateChooser;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author minos
 */
public class PanelEditar extends javax.swing.JPanel {
   private List<Integer> listaIdsClientes = new ArrayList<>();
    private List<Integer> listaIdsProductos = new ArrayList<>();
    /**
     * Creates new form PanelEditar
     */
    public PanelEditar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setBackground(new Color(255, 204, 204));
        setPreferredSize(new Dimension(840, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        int panelWidth = 840;
        int panelHeight = 560;
        int compWidth = 200;
        int centerX = (panelWidth - compWidth) / 2; // Calcula el centro
        int startY = 30;  // Margen superior inicial
        int stepY = 40;

        Orden orden = new Orden();
        actualizarBtn = new JButton();
        numeroOrdenField = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jComboBoxCliente = new JComboBox<>();
        jLabel3 = new JLabel();
        jComboBoProd = new JComboBox<>();
        jDateChooserFI = new JDateChooser();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jDateChooserFF = new JDateChooser();


        setBackground(new Color(255, 153, 153));
        setLayout(new AbsoluteLayout());

        actualizarBtn.setText("Actualizar");
        add(actualizarBtn, new AbsoluteConstraints(centerX, startY + 11 * stepY, compWidth, 30));

        numeroOrdenField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numeroOrdenFieldActionPerformed(evt);
            }
        });
        numeroOrdenField.setEnabled(false);
        numeroOrdenField.setEditable(false);
        add(numeroOrdenField, new AbsoluteConstraints(centerX, startY + stepY, compWidth, 30));

        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("N Orden");
        add(jLabel1, new AbsoluteConstraints(centerX, startY, -1, -1));

        jLabel2.setText("Nombre del Cliente");
        add(jLabel2, new AbsoluteConstraints(centerX, startY + 2 * stepY, -1, -1));

        jComboBoxCliente.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCliente.setFont(new Font("Segoe UI",0,14));
        ClienteDAO clienteDAO = new ClienteDAO();
        ProductoDAO productoDAO=new ProductoDAO();
        List<Integer> listaIdsClientes = new ArrayList();
        List<Integer> listaIdsProd = new ArrayList<>();
        for(var cliente:clienteDAO.listarClientes()){
            var nombre = cliente.getNombre();
            var idCliente = cliente.getIdCliente();
            jComboBoxCliente.addItem(nombre);
            listaIdsClientes.add(idCliente);
        }
        add(jComboBoxCliente, new AbsoluteConstraints(centerX, startY + 3 * stepY, compWidth, 30));


        jLabel3.setText("Nombre del Producto");
        add(jLabel3, new AbsoluteConstraints(centerX, startY + 2 * stepY, -1, -1));

        jComboBoProd.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoProd.setFont(new Font("Segoe UI", 0, 14));

        // ActionListener para detectar cambios en la selección de cliente y agrega productos de acuerdo a la seleccion
        jComboBoxCliente.addActionListener(e -> {
            int selectedIndex = jComboBoxCliente.getSelectedIndex();
            if (selectedIndex >= 0) {
                int idClienteSeleccionado = listaIdsClientes.get(selectedIndex);
                List<Producto> productos = productoDAO.encontrarProductosPorIdCliente(idClienteSeleccionado);

                //  Deshabilitar temporalmente el ActionListener para evitar eventos no deseados
                ActionListener[] listeners = jComboBoProd.getActionListeners();
                for (ActionListener al : listeners) {
                    jComboBoProd.removeActionListener(al);
                }

                // Limpiar lista y ComboBox
                listaIdsProd.clear();
                jComboBoProd.removeAllItems();

                // Llenar con nuevos productos
                for (Producto producto : productos) {
                    jComboBoProd.addItem(producto.getNombre());
                    listaIdsProd.add(producto.getIdProducto());
                }

                // Solo seleccionar el primer elemento si hay productos
                if (!listaIdsProd.isEmpty()) {
                    jComboBoProd.setSelectedIndex(0);
                } else {
                    System.out.println("El cliente seleccionado no tiene productos.");
                }

                // Volver a agregar los listeners después de la actualización
                for (ActionListener al : listeners) {
                    jComboBoProd.addActionListener(al);
                }
            }
        });

        jComboBoProd.addActionListener(e -> {
            int selectIndex = jComboBoProd.getSelectedIndex();

            // Verificar que la lista no esté vacía y el índice sea válido
            if (!listaIdsProd.isEmpty() && selectIndex >= 0 && selectIndex < listaIdsProd.size()) {
                int idProducto = listaIdsProd.get(selectIndex);
                orden.setIdProducto(idProducto);
                System.out.println("Producto seleccionado: " + idProducto);
            }
        });
        add(jComboBoProd, new AbsoluteConstraints(centerX, startY + 5 * stepY, compWidth, 30));

        jDateChooserFI.setDateFormatString("yyyy-MM-dd");
        add(jDateChooserFI, new AbsoluteConstraints(centerX, startY + 7 * stepY, compWidth, 30));

        jLabel4.setText("Fecha Inicio");
        add(jLabel4, new AbsoluteConstraints(centerX, startY + 6 * stepY, -1, -1));

        jLabel5.setText("Fecha Final");
        add(jLabel5, new AbsoluteConstraints(centerX, startY + 8 * stepY, -1, -1));
        jDateChooserFF.setDateFormatString("yyyy-MM-dd");
        add(jDateChooserFF, new AbsoluteConstraints(centerX, startY + 9 * stepY, compWidth, 30));

        actualizarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarOrden();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarOrden() {
        try {
            // Obtener el valor del campo de texto
            String idOrden = numeroOrdenField.getText().trim();
            System.out.println("DEBUG: ID de Orden ingresado -> '" + idOrden + "'");

            // Validar que el ID no sea nulo o vacío
            if (idOrden.isEmpty()) {
                JOptionPane.showMessageDialog(this, "❌ Error: El ID de la orden es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convertir ID a entero
            int idOrdenInt;
            try {
                idOrdenInt = Integer.parseInt(idOrden);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "❌ Error: El ID de la orden debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtener los valores de los demás campos
            String producto = (String) jComboBoProd.getSelectedItem();
            String cliente = (String) jComboBoxCliente.getSelectedItem();
            Date fechaInicio = jDateChooserFI.getDate();
            Date fechaFin = jDateChooserFF.getDate();

            // Validaciones básicas
            if (producto == null || producto.isEmpty() || cliente == null || cliente.isEmpty() || fechaInicio == null || fechaFin == null) {
                JOptionPane.showMessageDialog(this, "❌ Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convertir fechas a formato SQL
            java.sql.Date fechaInicioSQL = new java.sql.Date(fechaInicio.getTime());
            java.sql.Date fechaFinSQL = new java.sql.Date(fechaFin.getTime());

            // Obtener IDs correspondientes
            ProductoDAO productoDAO = new ProductoDAO();
            ClienteDAO clienteDAO = new ClienteDAO();
            OrdenDAO ordenDAO = new OrdenDAO();

            int idProducto = productoDAO.obtenerIdProductoPorNombre(producto);
            int idCliente = clienteDAO.obtenerIdPorNombre(cliente);

            // Verificar que los IDs sean válidos
            if (idProducto == -1 || idCliente == -1) {
                JOptionPane.showMessageDialog(this, "⚠ No se encontraron los datos del producto o cliente.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LocalDate fechaInicioLocal = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinLocal = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Crear objeto Orden con los datos actualizados
            Orden orden = new Orden(idOrdenInt, fechaInicioLocal,fechaFinLocal,idProducto);
            System.out.println("DEBUG: Orden creada -> " + orden);

            // Llamar al método de actualización en el DAO
            boolean exito = ordenDAO.editarOrden(orden);

            // Mostrar mensaje según el resultado
            if (exito) {
                JOptionPane.showMessageDialog(this, "✅ Orden actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "❌ Error al actualizar la orden.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void setDatosOrden(String idOrden, String producto, String fechaInicio, String fechaFin) {
        try {
            // Establecer el número de orden en el JTextField y deshabilitar edición
            numeroOrdenField.setText(idOrden);
            numeroOrdenField.setEnabled(false); // Mostrarlo deshabilitado

            // --- Cargar lista de productos en el JComboBox ---
            ProductoDAO productoDAO = new ProductoDAO();
            List<Producto> productos = productoDAO.listarProductos();

            jComboBoProd.removeAllItems(); // Limpiar antes de llenar
            listaIdsProductos.clear();

            // Agregar un espacio vacío como primer elemento
            jComboBoProd.addItem("");

            for (Producto p : productos) {
                listaIdsProductos.add(p.getIdProducto()); // Guardamos los IDs en lista
                jComboBoProd.addItem(p.getNombre());
            }

            // No seleccionamos ningún producto al inicio
            jComboBoProd.setSelectedIndex(0);

            // --- Configurar las fechas en los DateChooser ---
            jDateChooserFI.setDate(java.sql.Date.valueOf(fechaInicio));
            jDateChooserFF.setDate(java.sql.Date.valueOf(fechaFin));

            // --- Manejo del JComboBox de Cliente ---
            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> clientes = clienteDAO.listarClientes();

            listaIdsClientes.clear();
            jComboBoxCliente.removeAllItems();

            for (Cliente c : clientes) {
                listaIdsClientes.add(c.getIdCliente());
                jComboBoxCliente.addItem(c.getNombre());
            }

            // Obtener el ID del producto asociado al nombre del producto
            int idProducto = productoDAO.obtenerIdProductoPorNombre(producto);

            // Obtener el ID del cliente a partir del ID del producto
            int idCliente = productoDAO.obtenerIdClientePorIdProducto(idProducto);
            System.out.println("ID Cliente obtenido: " + idCliente);

            // Buscar el índice del cliente en la lista
            int indexCliente = listaIdsClientes.indexOf(idCliente);

            if (indexCliente >= 0) {
                jComboBoxCliente.setSelectedIndex(indexCliente);
                System.out.println("Cliente seleccionado en JComboBox con índice: " + indexCliente);
            } else {
                System.out.println("⚠ Cliente no encontrado en JComboBox.");
            }

        } catch (Exception e) {
            System.err.println("❌ Error al establecer datos de la orden: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void numeroOrdenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroOrdenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroOrdenFieldActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBtn;
    private javax.swing.JComboBox<String> jComboBoProd;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private com.toedter.calendar.JDateChooser jDateChooserFF;
    private com.toedter.calendar.JDateChooser jDateChooserFI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField numeroOrdenField;
    // End of variables declaration//GEN-END:variables
}
