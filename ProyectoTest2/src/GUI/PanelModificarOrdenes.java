package GUI;

import javax.swing.*;

import Beans.Cliente;
import Beans.Orden;
import Beans.Producto;
import DAO.ClienteDAO;
import DAO.OrdenDAO;
import DAO.ProductoDAO;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PanelModificarOrdenes extends JPanel {
    private JLabel lblCodOrden, lblNameClienteCronCrea, lblNameProdcCronCrea, lblFechaInicioCronCrear, lblFechaFinCronCrear;
    private JTextField txtFieldNumOrdenCrea;
    private JComboBox<String> comboNomClientCrea, comboNomProdcCrea;
    private JDateChooser dateChooserFICrea, dateChooserFFCrea;
    private JButton btnActualizar;
    // Agrega esta línea en la clase PanelModificarOrdenes (fuera de los métodos)
    private List<Integer> listaIdsClientes = new ArrayList<>();
    private List<Integer> listaIdsProductos = new ArrayList<>();


    public PanelModificarOrdenes(Orden orden) {


        setBackground(new Color(255, 204, 204));
        setPreferredSize(new Dimension(840, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        int panelWidth = 840;
        int panelHeight = 560;
        int compWidth = 200;
        int centerX = (panelWidth - compWidth) / 2; // Calcula el centro
        int startY = 30;  // Margen superior inicial
        int stepY = 40;

        lblCodOrden = new JLabel("N Orden:");
        txtFieldNumOrdenCrea = new JTextField(15);
        txtFieldNumOrdenCrea.setEditable(false);
        txtFieldNumOrdenCrea.setEnabled(false);

        lblNameClienteCronCrea = new JLabel("Nombre Cliente:");
        comboNomClientCrea = new javax.swing.JComboBox<>();
        comboNomClientCrea.setFont(new java.awt.Font("Segoe UI", 0, 14));
        ClienteDAO clienteDAO = new ClienteDAO();
        ProductoDAO productoDAO=new ProductoDAO();
        java.util.List<Integer> listaIdsClientes = new ArrayList();
        List<Integer> listaIdsProd = new ArrayList<>();
        for(var cliente:clienteDAO.listarClientes()){
            var nombre = cliente.getNombre();
            var idCliente = cliente.getIdCliente();
            comboNomClientCrea.addItem(nombre);
            listaIdsClientes.add(idCliente);
        }

        lblNameProdcCronCrea = new JLabel("Nombre Producto:");
        comboNomProdcCrea = new JComboBox<>();
        comboNomProdcCrea.setFont(new java.awt.Font("Segoe UI", 0, 14));

        // ActionListener para detectar cambios en la selección de cliente y agrega productos de acuerdo a la seleccion
        comboNomClientCrea.addActionListener(e -> {
            int selectedIndex = comboNomClientCrea.getSelectedIndex();
            if (selectedIndex >= 0) {
                int idClienteSeleccionado = listaIdsClientes.get(selectedIndex);
                List<Producto> productos = productoDAO.encontrarProductosPorIdCliente(idClienteSeleccionado);

                //  Deshabilitar temporalmente el ActionListener para evitar eventos no deseados
                ActionListener[] listeners = comboNomProdcCrea.getActionListeners();
                for (ActionListener al : listeners) {
                    comboNomProdcCrea.removeActionListener(al);
                }

                // Limpiar lista y ComboBox
                listaIdsProd.clear();
                comboNomProdcCrea.removeAllItems();

                // Llenar con nuevos productos
                for (Producto producto : productos) {
                    comboNomProdcCrea.addItem(producto.getNombre());
                    listaIdsProd.add(producto.getIdProducto());
                }

                // Solo seleccionar el primer elemento si hay productos
                if (!listaIdsProd.isEmpty()) {
                    comboNomProdcCrea.setSelectedIndex(0);
                } else {
                    System.out.println("El cliente seleccionado no tiene productos.");
                }

                // Volver a agregar los listeners después de la actualización
                for (ActionListener al : listeners) {
                    comboNomProdcCrea.addActionListener(al);
                }
            }
        });

        comboNomProdcCrea.addActionListener(e -> {
            int selectIndex = comboNomProdcCrea.getSelectedIndex();

            // Verificar que la lista no esté vacía y el índice sea válido
            if (!listaIdsProd.isEmpty() && selectIndex >= 0 && selectIndex < listaIdsProd.size()) {
                int idProducto = listaIdsProd.get(selectIndex);
                orden.setIdProducto(idProducto);
                System.out.println("Producto seleccionado: " + idProducto);
            }
        });

        lblFechaInicioCronCrear = new JLabel("Fecha Inicio:");
        dateChooserFICrea = new JDateChooser();
        dateChooserFICrea.setDateFormatString("yyyy-MM-dd");


        lblFechaFinCronCrear = new JLabel("Fecha Final:");
        dateChooserFFCrea = new JDateChooser();
        dateChooserFFCrea.setDateFormatString("yyyy-MM-dd");

        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                actualizarOrden();
            }
        });

        add(lblCodOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY, -1, -1));
        add(txtFieldNumOrdenCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + stepY, compWidth, 30));

        add(lblNameClienteCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 2 * stepY, -1, -1));
        add(comboNomClientCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 3 * stepY, compWidth, 30));

        add(lblNameProdcCronCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 4 * stepY, -1, -1));
        add(comboNomProdcCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 5 * stepY, compWidth, 30));

        add(lblFechaInicioCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 6 * stepY, -1, -1));
        add(dateChooserFICrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 7 * stepY, compWidth, 30));

        add(lblFechaFinCronCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 8 * stepY, -1, -1));
        add(dateChooserFFCrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 9 * stepY, compWidth, 30));

        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(centerX, startY + 11 * stepY, compWidth, 30));
    }

    public void setDatosOrden(String idOrden, String producto, String fechaInicio, String fechaFin) {
        try {
            // Establecer el número de orden en el JTextField y deshabilitar edición
            txtFieldNumOrdenCrea.setText(idOrden);
            txtFieldNumOrdenCrea.setEnabled(false); // Mostrarlo deshabilitado

            // --- Cargar lista de productos en el JComboBox ---
            ProductoDAO productoDAO = new ProductoDAO();
            List<Producto> productos = productoDAO.listarProductos();

            comboNomProdcCrea.removeAllItems(); // Limpiar antes de llenar
            listaIdsProductos.clear();

            // Agregar un espacio vacío como primer elemento
            comboNomProdcCrea.addItem("");

            for (Producto p : productos) {
                listaIdsProductos.add(p.getIdProducto()); // Guardamos los IDs en lista
                comboNomProdcCrea.addItem(p.getNombre());
            }

            // No seleccionamos ningún producto al inicio
            comboNomProdcCrea.setSelectedIndex(0);

            // --- Configurar las fechas en los DateChooser ---
            dateChooserFICrea.setDate(java.sql.Date.valueOf(fechaInicio));
            dateChooserFFCrea.setDate(java.sql.Date.valueOf(fechaFin));

            // --- Manejo del JComboBox de Cliente ---
            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> clientes = clienteDAO.listarClientes();

            listaIdsClientes.clear();
            comboNomClientCrea.removeAllItems();

            for (Cliente c : clientes) {
                listaIdsClientes.add(c.getIdCliente());
                comboNomClientCrea.addItem(c.getNombre());
            }

            // Obtener el ID del producto asociado al nombre del producto
            int idProducto = productoDAO.obtenerIdProductoPorNombre(producto);

            // Obtener el ID del cliente a partir del ID del producto
            int idCliente = productoDAO.obtenerIdClientePorIdProducto(idProducto);
            System.out.println("ID Cliente obtenido: " + idCliente);

            // Buscar el índice del cliente en la lista
            int indexCliente = listaIdsClientes.indexOf(idCliente);

            if (indexCliente >= 0) {
                comboNomClientCrea.setSelectedIndex(indexCliente);
                System.out.println("Cliente seleccionado en JComboBox con índice: " + indexCliente);
            } else {
                System.out.println("⚠ Cliente no encontrado en JComboBox.");
            }

        } catch (Exception e) {
            System.err.println("❌ Error al establecer datos de la orden: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void actualizarOrden() {
        try {
            // Obtener el valor del campo de texto
            String idOrden = txtFieldNumOrdenCrea.getText().trim();
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
            String producto = (String) comboNomProdcCrea.getSelectedItem();
            String cliente = (String) comboNomClientCrea.getSelectedItem();
            Date fechaInicio = dateChooserFICrea.getDate();
            Date fechaFin = dateChooserFFCrea.getDate();

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
}