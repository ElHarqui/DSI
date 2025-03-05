/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Usuario
 */
public class Pantalla_Inicio extends javax.swing.JFrame {

    
    public Pantalla_Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        BIniciar.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        BIniciar = new javax.swing.JButton();
        lbllogoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 580));
        setSize(new java.awt.Dimension(786, 541));

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setBackground(new java.awt.Color(0, 0, 0));
        T1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        T1.setForeground(new java.awt.Color(255, 255, 255));
        T1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 370, 30));

        L2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 70, 20));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        barra.setForeground(new java.awt.Color(255, 204, 0));
        barra.setToolTipText("");
        barra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 370, 40));

        BIniciar.setBackground(new java.awt.Color(70, 79, 150));
        BIniciar.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        BIniciar.setForeground(new java.awt.Color(255, 255, 255));
        BIniciar.setText("INICIAR");
        BIniciar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 170, -1));

        lbllogoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/IMG/logoEmpresa3.png"))); // NOI18N
        lbllogoInicio.setAlignmentY(0.0F);
        lbllogoInicio.setIconTextGap(0);
        lbllogoInicio.setMaximumSize(new java.awt.Dimension(800, 789));
        jPanel1.add(lbllogoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 790, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarActionPerformed
        // TODO add your handling code here:
        dispose();
        Panel_Login log = new Panel_Login();
        log.setVisible(true);
//        Menu_PrincipalJP log1 = new Menu_PrincipalJP(1);
        log.setVisible(true);
    }//GEN-LAST:event_BIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Pantalla_Inicio splash = new Pantalla_Inicio();
        String frase = "SISTEMA DE CUENTAS POR PAGAR";
        splash.setVisible(true);
        try {
            for (int i = 0; i <= 115; i++) {
                Thread.sleep(10);// Velocidad de Carga
                splash.barra.setValue(i);
                if(i<=100)
                splash.L2.setText((Integer.toString(i)+("%")));
                switch (i) {
                    case 3:
                        splash.T1.setText("Ejecutando...");
                        break;
                    case 25:
                        splash.T1.setText("Cargando programa...");
                        break;
                    case 50:
                        splash.T1.setText("Leyendo preferencias...");
                        break;
                    case 75:
                        splash.T1.setText("Cargando archivos...");
                        break;
                    case 100:
                        splash.T1.setText("Carga finalizada");
                        break;
                    case 115:
                        splash.BIniciar.setVisible(true);
                        break;    
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Inicio().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciar;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel T1;
    private javax.swing.JProgressBar barra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbllogoInicio;
    // End of variables declaration//GEN-END:variables
}
