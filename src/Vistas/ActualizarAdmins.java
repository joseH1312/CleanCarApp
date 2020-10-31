/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author acer
 */
public class ActualizarAdmins extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarAdmins
     */
    public ActualizarAdmins() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/logo1S.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Cedula = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        txtNombre1 = new javax.swing.JLabel();
        txtDocumento1 = new javax.swing.JLabel();
        txtapeliidos = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtCerrar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 246, 251));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 246, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cedula.setBackground(new java.awt.Color(246, 246, 251));
        Cedula.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Cedula.setBorder(null);
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 190, 30));

        Nombre.setBackground(new java.awt.Color(246, 246, 251));
        Nombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Nombre.setBorder(null);
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 30));

        Apellidos.setBackground(new java.awt.Color(246, 246, 251));
        Apellidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Apellidos.setBorder(null);
        jPanel1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, 30));

        password.setBackground(new java.awt.Color(246, 246, 251));
        password.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 190, 30));

        txtNombre1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtNombre1.setText("Nombre");
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        txtDocumento1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtDocumento1.setText("Cedula");
        jPanel1.add(txtDocumento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txtapeliidos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtapeliidos.setText("Apellidos");
        jPanel1.add(txtapeliidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPassword.setText("Password");
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 153, 204));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, 40));

        txtCerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCerrar.setForeground(new java.awt.Color(0, 153, 204));
        txtCerrar.setText("X");
        txtCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(txtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 20, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(ActualizarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarAdmins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Apellidos;
    public javax.swing.JTextField Cedula;
    public javax.swing.JTextField Nombre;
    public javax.swing.JButton btnActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JPasswordField password;
    public javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtDocumento1;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtapeliidos;
    // End of variables declaration//GEN-END:variables
}
