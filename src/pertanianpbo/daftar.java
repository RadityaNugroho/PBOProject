/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertanianpbo;

/**
 *
 * @author RadityaMN
 */
public class daftar extends javax.swing.JFrame {

    /**
     * Creates new form daftar
     */
    public daftar() {
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

        email = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        daftar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 380, 40));

        nama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 380, 40));

        password.setText("jPasswordField1");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 380, -1));

        daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMouseClicked(evt);
            }
        });
        getContentPane().add(daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 406, 180, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/11.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseClicked
      new produk().setVisible(true);
      this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_daftarMouseClicked

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
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel daftar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
