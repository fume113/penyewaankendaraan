import javax.swing.UIManager;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rijal
 */


public class TampilanAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TampilanAdmin
     */
    public TampilanAdmin() {
        initComponents();
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();


            int x = posisi.width / 2  - this.getSize().width / 2;
            int y = posisi.height / 2 - this.getSize().height / 2;

            this.setLocation(x, y);
            
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db10120709penyewaankendaraan_travel","root","");
            
            Statement pst = con.createStatement();         
            String sqc = "SELECT * FROM akun, sesi WHERE akun.username = sesi.username";
            ResultSet rc = pst.executeQuery(sqc);                 
            
            if(rc.next()){
                String Username  = rc.getString("username");
                String Nama      = rc.getString("nama");                
                username.setText(Username);
                nama.setText(Nama);
            }
        }catch (Exception e){
                System.out.print(e.getMessage());
            }
    }
    protected void tema(){
                try{
                    UIManager.setLookAndFeel(new GraphiteLookAndFeel());
                }catch(UnsupportedLookAndFeelException ex){
                    ex.printStackTrace();
                }
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        manajemenKendaraan = new javax.swing.JButton();
        manajemenCustomer = new javax.swing.JButton();
        buatVoucher = new javax.swing.JButton();
        manajemenVoucher = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 128, -1, -1));

        username.setEditable(false);
        username.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 47, 352, -1));

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 91, 351, -1));

        manajemenKendaraan.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        manajemenKendaraan.setText("Manajemen Kendaraan");
        manajemenKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manajemenKendaraanActionPerformed(evt);
            }
        });
        getContentPane().add(manajemenKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 179, 190, -1));

        manajemenCustomer.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        manajemenCustomer.setText("Manajemen Customer");
        manajemenCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manajemenCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(manajemenCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 214, 191, -1));

        buatVoucher.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        buatVoucher.setText("Buat Voucher Top Up");
        buatVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatVoucherActionPerformed(evt);
            }
        });
        getContentPane().add(buatVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 191, -1));

        manajemenVoucher.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        manajemenVoucher.setText("Manajemen Voucher");
        manajemenVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manajemenVoucherActionPerformed(evt);
            }
        });
        getContentPane().add(manajemenVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 191, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Username Admin ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Nama Admin       ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\1. Kuliah\\1.Unikom\\4. Semester 4\\4. Program Visual\\2. Tugas\\Tugas 5 Tugas Besar\\Background 500x270.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buatVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatVoucherActionPerformed
        BuatVoucher buatvoucher = new BuatVoucher();
        buatvoucher.show();
        dispose();
    }//GEN-LAST:event_buatVoucherActionPerformed

    private void manajemenKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manajemenKendaraanActionPerformed
        ManajemenKendaraan manajemenkendaraan = new ManajemenKendaraan();
        manajemenkendaraan.show();
        dispose();
    }//GEN-LAST:event_manajemenKendaraanActionPerformed

    private void manajemenCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manajemenCustomerActionPerformed
        ManajemenCustomer manajemencustomer = new ManajemenCustomer();
        manajemencustomer.show();
        dispose();
    }//GEN-LAST:event_manajemenCustomerActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db10120709penyewaankendaraan_travel","root","");
            String sql = "DELETE FROM sesi LIMIT 1;";
            PreparedStatement pst = con.prepareStatement(sql);
                        
                    pst.execute();
        }catch (Exception e){
                System.out.print(e.getMessage());
            }
        
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void manajemenVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manajemenVoucherActionPerformed
        ManajemenVoucher mv = new ManajemenVoucher();
        mv.show();
        dispose();
    }//GEN-LAST:event_manajemenVoucherActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        TampilanAdmin fitur = new TampilanAdmin();
        fitur.tema();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buatVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton manajemenCustomer;
    private javax.swing.JButton manajemenKendaraan;
    private javax.swing.JButton manajemenVoucher;
    public javax.swing.JTextField nama;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}