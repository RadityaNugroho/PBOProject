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
public class invest extends javax.swing.JFrame {

    /**
     * Creates new form invest
     */
    public invest() {
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

        next = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        kota = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        sumberdana = new javax.swing.JComboBox<>();
        provinsi = new javax.swing.JComboBox<>();
        pekerjaan = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 540, 90, 100));

        alamat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 380, 40));

        nama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 380, 40));

        email.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 380, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 330, -1));

        kota.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 380, 40));

        telepon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 380, 40));

        sumberdana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabungan", "Deposito", "Investasi" }));
        getContentPane().add(sumberdana, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 360, -1));

        provinsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "Bali", "Banten", "Bengkulu", "Gorontolo", "Jakarta", "Jambi", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "Kalimantan Barat", "Kalimantan Selatan", "Kalimantan Tengah", "Kalimantan Timur", "Kalimantan Utara", "Kepulauan Bangka Belitung", "Kepulauan Riau", "Lampung", "Maluku", "Maluku Utara", "NTB", "NTT", "Papua", "Papua Barat", "Riau", "Sulawesi Barat", "Sulawesi Selatan", "Sulawesi Tengah", "Sulawesi Tenggara", "Sulwesi Utara", "Sumatera Barat", "Sumatera Selatan", "Sumetera Utara", "Yogyakarta", " ", " " }));
        getContentPane().add(provinsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 360, 30));

        pekerjaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pengusaha", "Pegawai Pemerintah", " " }));
        getContentPane().add(pekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 597, 360, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/14.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
      new invest2().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_nextMouseClicked

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
            java.util.logging.Logger.getLogger(invest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel background;
    private javax.swing.JTextField email;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JTextField kota;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel next;
    private javax.swing.JComboBox<String> pekerjaan;
    private javax.swing.JComboBox<String> provinsi;
    private javax.swing.JComboBox<String> sumberdana;
    private javax.swing.JTextField telepon;
    // End of variables declaration//GEN-END:variables
}
