
package GUI;

import Beans.Usuario;
import DAO.ConexionBD;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.sql.Date;

public class Panel_Login extends javax.swing.JFrame {

    int cambio = 1;
    
    public Panel_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static void quickSort(ArrayList<String> lista, int bajo, int alto, boolean ascendente) {
        if (bajo < alto) {
            int pi = particion(lista, bajo, alto, ascendente);
            quickSort(lista, bajo, pi - 1, ascendente);
            quickSort(lista, pi + 1, alto, ascendente);
        }
    }
    
    private static int particion(ArrayList<String> lista, int bajo, int alto, boolean ascendente) {
        Date pivote = lista.get(alto).getFechaAsignacion();
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            boolean condicion = ascendente ? 
                lista.get(j).getFechaAsignacion().before(pivote) : 
                lista.get(j).getFechaAsignacion().after(pivote);

            if (condicion) {
                i++;
                intercambiar(lista, i, j);
            }
        }

        intercambiar(lista, i + 1, alto);
        return i + 1;
    }

    private static void intercambiar(ArrayList<String> lista, int i, int j) {
        String temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        visible = new javax.swing.JButton();
        Contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Ingresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        sesion.setBackground(new java.awt.Color(0, 204, 204));
        sesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 79, 150), 5, true));
        sesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESIÓN");
        sesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 210, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        sesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        Username.setBackground(new java.awt.Color(0, 204, 204));
        Username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("1234");
        Username.setBorder(null);
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        sesion.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 240, -1));
        sesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 303, 240, 10));

        jLabel4.setBackground(new java.awt.Color(0, 51, 204));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        sesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/visible (2).jpg"))); // NOI18N
        visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibleMouseClicked(evt);
            }
        });
        visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visibleActionPerformed(evt);
            }
        });
        sesion.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 40, 30));

        Contraseña.setBackground(new java.awt.Color(0, 204, 204));
        Contraseña.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("1234");
        Contraseña.setBorder(null);
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaMouseClicked(evt);
            }
        });
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        sesion.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 240, -1));
        sesion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 240, 10));

        Ingresar.setBackground(new java.awt.Color(255, 204, 0));
        Ingresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Ingresar.setText("INGRESAR");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        sesion.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 240, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/icono-removebg-preview (1).png"))); // NOI18N
        sesion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleMouseClicked
        // TODO add your handling code here:
        switch (cambio){
            case 0:
            visible.setIcon(new ImageIcon(getClass().getResource("/GUI/IMG/visible (2).jpg")));
            Contraseña.setEchoChar('●');
            cambio = 1;
            break;
            case 1:
            visible.setIcon(new ImageIcon(getClass().getResource("/GUI/IMG/visible (3).jpg")));
            Contraseña.setEchoChar((char) 0);
            cambio = 0;
            break;
        }
    }//GEN-LAST:event_visibleMouseClicked

    private void visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleActionPerformed
        // TODO add your handling code here: //"src\\Imagenes\\visible (3).jpg"
    }//GEN-LAST:event_visibleActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        int idEmpleadoGlobal;
        String user = Username.getText();//Digite su ID de usuario
        String pass = Contraseña.getText();//Digite su contraseña
        
        String sql = "SELECT nombreUsuario, contraseña, rol, idEmpleado FROM Usuario WHERE activo = 1 AND nombreUsuario = ?";
        
        try {
            Connection conn = ConexionBD.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user); // Evita inyección SQL
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String usuarioDB = rs.getString("nombreUsuario");
                String passwordDB = rs.getString("contraseña");
                String rol = rs.getString("rol");
                int idEmpleado = rs.getInt("idEmpleado");
                
                if (pass.equals(passwordDB)) { // Comparación de contraseñas
                    idEmpleadoGlobal = idEmpleado; // Guarda el idEmpleado en la variable global
                    
                    switch (rol) {
                        case "empleado":
                            new Menu_PrincipalE(idEmpleadoGlobal).setVisible(true);
                            this.dispose();
                            break;
                        case "jefeventas":
                            new Menu_PrincipalJV(idEmpleadoGlobal).setVisible(true);
                            this.dispose();
                            break;
                        case "jefeproduccion":
                            new Menu_PrincipalJP(idEmpleadoGlobal).setVisible(true);
                            this.dispose();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Rol desconocido", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado o inactivo", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
    }//GEN-LAST:event_UsernameActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        // TODO add your handling code here:
        Username.setText(null);
    }//GEN-LAST:event_UsernameMouseClicked

    private void ContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseClicked
        // TODO add your handling code here:
        Contraseña.setText(null);
    }//GEN-LAST:event_ContraseñaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JButton Ingresar;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel sesion;
    private javax.swing.JButton visible;
    // End of variables declaration//GEN-END:variables
}
