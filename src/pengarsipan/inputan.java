/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarsipan;

import java.sql.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author RIjhal-PC
 */
public class inputan extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    int tahun1;
    DateFormat dt = new SimpleDateFormat ("yyyy-MM-dd");   
    
    public inputan(String data){
    initComponents();
    jLabel4.setText(data);
    jButton4.setEnabled(false);
    jButton7.setEnabled(true);
    btn_tampil.setEnabled(true);
    koneksi();
    negara();
    setLocationRelativeTo(this);
    } 
    public inputan() {
        initComponents();
        koneksi();
        setLocationRelativeTo(this);
        negara();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt_nama3 = new javax.swing.JTextField();
        tahun = new com.toedter.calendar.JYearChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_tempat3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_lahir3 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        noarsip = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JTextField();
        btn_tampil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM PENGARSIPAN DOKUMEN KEIMIGRASIAN");

        tahun.setEndYear(5000);
        tahun.setStartYear(1000);
        tahun.setValue(1950);

        jLabel15.setText("TAHUN MASUK DOKUMEN");

        jLabel16.setText("KEWARGANEGARAAN");

        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH NEGARA-" }));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan/gambar/simpan.png"))); // NOI18N
        jButton4.setText(" SIMPAN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setText("TEMPAT LAHIR");

        txt_tempat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tempat3ActionPerformed(evt);
            }
        });

        jLabel18.setText("TANGGAL LAHIR");

        txt_lahir3.setDateFormatString("yyyy-MM-dd");

        jLabel19.setText("NAMA");

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan/gambar/reset.png"))); // NOI18N
        jButton5.setText("RESET");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan/gambar/kembali.png"))); // NOI18N
        jButton6.setText("KEMBALI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("NO.ARSIP");

        noarsip.setEnabled(false);

        jButton7.setBackground(new java.awt.Color(102, 255, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan/gambar/update.png"))); // NOI18N
        jButton7.setText("UPDATE");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setText("ID  :");

        jLabel4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLabel4.setText("id");
        jLabel4.setEnabled(false);
        jLabel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel4ActionPerformed(evt);
            }
        });

        btn_tampil.setText("Tampilkan");
        btn_tampil.setEnabled(false);
        btn_tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel2))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_tampil))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(noarsip, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_lahir3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tempat3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_nama3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tahun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 219, Short.MAX_VALUE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tampil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_tempat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(txt_lahir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_nama3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(noarsip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void koneksi(){
    koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
    }
    private void tampil(){
    try{    
    rs=stat.executeQuery("select * from berkas where id = '"+jLabel4.getText()+"'");
    while (rs.next())
    {
    Object[] ob = new Object[4];
    txt_tempat3.setText(rs.getString("tempat_lahir"));
    txt_lahir3.setDate(rs.getDate("tanggal_lahir"));
    txt_nama3.setText(rs.getString("nama")); 
    tahun.setValue(rs.getInt("tahun_masuk"));
    cmb.setSelectedItem(rs.getString("negara"));
    noarsip.setText(rs.getString("no_arsip"));
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(this, e.getMessage());    
    JOptionPane.showMessageDialog(null, "Data Tidak Ada !!" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    private void negara(){
    cmb.addItem("Indonesia");
    cmb.addItem("Japan");
    cmb.addItem("China");
    cmb.addItem("United States(US)");
    cmb.addItem("United Kingdom(UK)");
    cmb.addItem("Saudi Arabia");
    
    }
    private void reset(){
    txt_tempat3.setText("");
       txt_nama3.setText("");
       cmb.setSelectedItem("-PILIH NEGARA-");
       noarsip.setText("");
       tahun.setValue(1950);
    }
    private void simpan(){
    String tanggal = dt.format(txt_lahir3.getDate());
        if(txt_tempat3.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Tempat belum di isi!");
            txt_tempat3.requestFocus();
        }
        else if(tanggal.equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Tanggal Lahir belum di isi!");
            txt_tempat3.requestFocus();
        }
        else if(txt_nama3.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum di isi!");
            txt_tempat3.requestFocus();
        }
        else if(cmb.getSelectedItem().equals("-PILIH NEGARA-")){
            JOptionPane.showMessageDialog(null,"Maaf, Kewarganegaraan belum di isi!");
            txt_tempat3.requestFocus();
        }       
        else{
            try {
                DateFormat df = new SimpleDateFormat ("yyMMdd");
                tahun1 = tahun.getYear();
                noarsip.setText(df.format(txt_lahir3.getDate())+"/"+tahun1);
                String sql = "insert into berkas (tempat_lahir,tanggal_lahir,nama,tahun_masuk,negara,no_arsip)values('"+txt_tempat3.getText()+"','"+tanggal+"',"
                        + "'"+txt_nama3.getText()+"','"+tahun.getYear()+"','"+cmb.getSelectedItem()+"','"+noarsip.getText()+"')";
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data BERHASIL tersimpan" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                JOptionPane.showMessageDialog(null, "Data GAGAL tersimpan" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    private void edit(){
    String tanggal = dt.format(txt_lahir3.getDate());
        if(txt_tempat3.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Tempat belum di isi!");
            txt_tempat3.requestFocus();
        }
        else if(tanggal.equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Tanggal Lahir belum di isi!");
            txt_tempat3.requestFocus();
        }
        else if(txt_nama3.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum di isi!");
            txt_tempat3.requestFocus();
        }
        else if(cmb.getSelectedItem().equals("-PILIH NEGARA-")){
            JOptionPane.showMessageDialog(null,"Maaf, Kewarganegaraan belum di isi!");
            txt_tempat3.requestFocus();
        }       
        else{
            try {
                DateFormat df = new SimpleDateFormat ("yyMMdd");
                tahun1 = tahun.getYear();
                noarsip.setText(df.format(txt_lahir3.getDate())+"/"+tahun1);
                String sql = "update berkas set tempat_lahir = '"+txt_tempat3.getText()+"',tanggal_lahir = '"+tanggal+"',nama = '"+txt_nama3.getText()+"',tahun_masuk = '"+tahun.getYear()+"'"
                        + ",negara = '"+cmb.getSelectedItem()+"',no_arsip = '"+noarsip.getText()+"' "
                        + "where id = '"+jLabel4.getText()+"'";
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data BERHASIL Update" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                JOptionPane.showMessageDialog(null, "Data GAGAL Update" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       // TODO add your handling code here:
       reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        simpan();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        edit();
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_tempat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tempat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tempat3ActionPerformed

    private void jLabel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel4ActionPerformed

    private void btn_tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tampilActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_btn_tampilActionPerformed

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
            java.util.logging.Logger.getLogger(inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tampil;
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField noarsip;
    private com.toedter.calendar.JYearChooser tahun;
    private com.toedter.calendar.JDateChooser txt_lahir3;
    private javax.swing.JTextField txt_nama3;
    private javax.swing.JTextField txt_tempat3;
    // End of variables declaration//GEN-END:variables
}
