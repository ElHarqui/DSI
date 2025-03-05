/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Beans.Requerimiento;
import DAO.OrdenDAO;
import DAO.RequerimientoDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Panel_ConsultarRequerimientos extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ConsultarRequerimientos
     */
    public Panel_ConsultarRequerimientos() {
        initComponents();
        cargarDatosEnTabla();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReq = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tablaReq);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 330));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int filaSeleccionada = tablaReq.getSelectedRow(); // Obtener la fila seleccionada

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un registro para exportar.");
            return;
        }

        TableModel modelo = tablaReq.getModel();

        // Obtener los datos de la fila seleccionada desde la JTable
        String idReque = modelo.getValueAt(filaSeleccionada, 0).toString();
        String nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
        String descripcion = modelo.getValueAt(filaSeleccionada, 2).toString();
        int idOrden = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 3).toString());

        // Obtener datos adicionales de la orden
        OrdenDAO ordenDAO = new OrdenDAO();
        Map<String, String> datosExtras = ordenDAO.obtenerDatosOrden(idOrden);

        if (datosExtras.isEmpty()) {
            JOptionPane.showMessageDialog(this, "❌ No se pudieron obtener los datos de la orden.");
            return;
        }

        // Obtener la ruta de la carpeta "ReqTxt" dentro del proyecto
        File carpeta = new File("ReqTxt");
        if (!carpeta.exists() && !carpeta.mkdirs()) {
            JOptionPane.showMessageDialog(this, "❌ No se pudo crear la carpeta 'ReqTxt'.");
            return;
        }

        // Crear el archivo dentro de la carpeta
        File archivo = new File(carpeta, "Requerimiento_" + idReque + ".txt");

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
            escritor.write("===== Registro " + idReque + " =====");
            escritor.newLine();
            escritor.write("ID: " + idReque);
            escritor.newLine();
            escritor.write("Nombre: " + nombre);
            escritor.newLine();
            escritor.write("Descripción: " + descripcion);
            escritor.newLine();
            escritor.write("IdOrden: " + idOrden);
            escritor.newLine();
            escritor.write("Cliente: " + datosExtras.get("nombreCliente"));
            escritor.newLine();
            escritor.write("Producto: " + datosExtras.get("nombreProducto"));
            escritor.newLine();
            escritor.write("Fecha de Inicio: " + datosExtras.get("fechaInicio"));
            escritor.newLine();
            escritor.write("Fecha de Acabado: " + datosExtras.get("fechaAcabado"));
            escritor.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "❌ Error al guardar el archivo: " + e.getMessage());
            return;
        }

        JOptionPane.showMessageDialog(this, "✅ Archivo creado correctamente: " + archivo.getAbsolutePath());

        // Abrir automáticamente el archivo .txt
        try {
            Desktop.getDesktop().open(archivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "❌ No se pudo abrir el archivo: " + e.getMessage());
        }

        cargarDatosEnTabla();
    }


    private void cargarDatosEnTabla(){
        RequerimientoDAO dao = new RequerimientoDAO();
        List<Requerimiento> lista = dao.listarRequerimientos();

        // Definir las columnas de la tabla
        String[] columnas = {"Id", "Nombre"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Convertir objetos Requerimiento en filas para la tabla
        for (Requerimiento req : lista) {
            Object[] fila = { req.getId(), req.getNoombre(), req.getDescription(), req.getIdOrden() };
            modelo.addRow(fila);
        }

        // Asignar el modelo a la tabla
        tablaReq.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReq;
    // End of variables declaration//GEN-END:variables
}
