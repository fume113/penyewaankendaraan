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
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rijal
 */
public class ManajemenCustomer extends javax.swing.JFrame {

    /**
     * Creates new form ManajemenCustomer
     */
    public ManajemenCustomer() {
        initComponents();
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();


            int x = posisi.width / 2  - this.getSize().width / 2;
            int y = posisi.height / 2 - this.getSize().height / 2;

            this.setLocation(x, y);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCustomer = new javax.swing.JTable();
        kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        noHP = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        tampilData = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        hapusData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Nama", "No Hp", "Email", "Alamat"
            }
        ));
        tabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 809, -1));

        kembali.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 738, -1, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("No HP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        idUser.setEditable(false);
        idUser.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        getContentPane().add(idUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 317, -1));

        username.setEditable(false);
        username.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 317, -1));

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 317, -1));

        noHP.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        getContentPane().add(noHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 317, -1));

        email.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 317, -1));

        alamat.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 317, -1));

        tampilData.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        tampilData.setText("Tampilkan Data");
        tampilData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilDataActionPerformed(evt);
            }
        });
        getContentPane().add(tampilData, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));

        updateData.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        updateData.setText("Update Data");
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });
        getContentPane().add(updateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 686, -1, -1));

        hapusData.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        hapusData.setText("Hapus Data");
        hapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDataActionPerformed(evt);
            }
        });
        getContentPane().add(hapusData, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 686, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\1. Kuliah\\1.Unikom\\4. Semester 4\\4. Program Visual\\2. Tugas\\Tugas 5 Tugas Besar\\Background 850x800.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        TampilanAdmin tampilanadmin = new TampilanAdmin();
        tampilanadmin.show();
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void tabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCustomerMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)tabelCustomer.getModel();
        
        String tblIdUser    = tblModel.getValueAt(tabelCustomer.getSelectedRow(), 0).toString();
        String tblUsername  = tblModel.getValueAt(tabelCustomer.getSelectedRow(), 1).toString();
        String tblNama      = tblModel.getValueAt(tabelCustomer.getSelectedRow(), 2).toString();
        String tblNoHP      = tblModel.getValueAt(tabelCustomer.getSelectedRow(), 3).toString();
        String tblEmail     = tblModel.getValueAt(tabelCustomer.getSelectedRow(), 4).toString();
        String tblAlamat    = tblModel.getValueAt(tabelCustomer.getSelectedRow(), 5).toString();
        
        idUser.setText(tblIdUser);
        username.setText(tblUsername);
        nama.setText(tblNama);
        noHP.setText(tblNoHP);
        email.setText(tblEmail);
        alamat.setText(tblAlamat);
    }//GEN-LAST:event_tabelCustomerMouseClicked

    private void hapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDataActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tabelCustomer.getModel();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db10120709penyewaankendaraan_travel","root","");
            String sql = "DELETE FROM `akun` WHERE `user_id` = '"+idUser.getText()+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
        if(tabelCustomer.getSelectedRowCount()==1){
            tblModel.removeRow(tabelCustomer.getSelectedRow());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data telah dihapus");
        }else{
              if(tabelCustomer.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Tabel Kosong");
             }else{
                JOptionPane.showMessageDialog(this, "Harap Pilih Salah Satu Baris Dari Tabel!");
              }
        }
        }catch (Exception e){
                System.out.print(e.getMessage());
            }
    }//GEN-LAST:event_hapusDataActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tabelCustomer.getModel();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db10120709penyewaankendaraan_travel","root","");
            String sql = "UPDATE `akun` SET `nama`='"+nama.getText()+"',`no_hp`='"+noHP.getText()+"',`email`='"+email.getText()+"', `alamat` = '"+alamat.getText()+"'WHERE `user_id` = '"+idUser.getText()+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
        if(tabelCustomer.getSelectedRowCount()==1){
            String IdUser   = idUser.getText();
            String Username = username.getText();
            String Nama     = nama.getText();
            String NoHP     = noHP.getText();
            String Email    = email.getText();
            String Alamat   = alamat.getText();
            
            tblModel.setValueAt(IdUser, tabelCustomer.getSelectedRow(), 0);
            tblModel.setValueAt(Username, tabelCustomer.getSelectedRow(), 1);
            tblModel.setValueAt(Nama, tabelCustomer.getSelectedRow(), 2);
            tblModel.setValueAt(NoHP, tabelCustomer.getSelectedRow(), 3);
            tblModel.setValueAt(Email, tabelCustomer.getSelectedRow(), 4);
            tblModel.setValueAt(Alamat, tabelCustomer.getSelectedRow(), 5);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Update Data Berhasil!");
        }else{
            if(tabelCustomer.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Tabel Kosong");
            }else{
                JOptionPane.showMessageDialog(this, "Harap Pilih Salah Satu Baris Dari Tabel!");
              }
        }
        }catch (Exception e){
                System.out.print(e.getMessage());
            }
    }//GEN-LAST:event_updateDataActionPerformed

    private void tampilDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilDataActionPerformed
        tabelCustomer.setModel(new DefaultTableModel(null,new String []{
        "Id","Username","Nama","No Hp","Email","Alamat"}));
        
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db10120709penyewaankendaraan_travel","root","");
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM `akun` WHERE role = 'customer'";
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next()){
                    String IdUser  = rs.getString("user_id");
                    String Username = rs.getString("username");
                    String Nama = rs.getString("nama");
                    String NoHP = rs.getString("no_hp");
                    String Email = String.valueOf(rs.getString("email"));
                    String Alamat = rs.getString("Alamat");
                    
                    String tbData[] = {IdUser,Username,Nama,NoHP,Email,Alamat};
                    DefaultTableModel tblModel = (DefaultTableModel)tabelCustomer.getModel();
                    
                    tblModel.addRow(tbData);
                }
                
                con.close();
            }catch (Exception e){
                System.out.print(e.getMessage());
            }
    }//GEN-LAST:event_tampilDataActionPerformed

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
            java.util.logging.Logger.getLogger(ManajemenCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ManajemenCustomer fitur = new ManajemenCustomer();
        fitur.tema();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajemenCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField email;
    private javax.swing.JButton hapusData;
    private javax.swing.JTextField idUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noHP;
    private javax.swing.JTable tabelCustomer;
    private javax.swing.JButton tampilData;
    private javax.swing.JButton updateData;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
