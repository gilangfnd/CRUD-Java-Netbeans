/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.KeyEvent;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author Gilang
 */
public class detailPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form detailPengembalian
     */
    public detailPengembalian() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTKEMBALI = new javax.swing.JTable();
        label5 = new java.awt.Label();
        kdpinjam = new javax.swing.JFormattedTextField();
        nama = new javax.swing.JFormattedTextField();
        kdbuku = new javax.swing.JFormattedTextField();
        nmbuku = new javax.swing.JFormattedTextField();
        nim = new javax.swing.JFormattedTextField();
        label6 = new java.awt.Label();
        denda = new javax.swing.JFormattedTextField();
        label2 = new java.awt.Label();
        kembalikan = new javax.swing.JButton();
        label3 = new java.awt.Label();
        perpanjang = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        JTKEMBALI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTKEMBALI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTKEMBALIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTKEMBALI);

        label5.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label5.setText("Nama Buku :");

        nim.setToolTipText("");
        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });
        nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nimKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nimKeyReleased(evt);
            }
        });

        label6.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        label6.setText("DENDA");

        label2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label2.setText("Kode Pinjam :");

        kembalikan.setBackground(java.awt.SystemColor.activeCaption);
        kembalikan.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        kembalikan.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        kembalikan.setText("KEMBALIKAN");
        kembalikan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembalikanMouseClicked(evt);
            }
        });
        kembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalikanActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label3.setText("Nama :");

        perpanjang.setBackground(java.awt.SystemColor.activeCaption);
        perpanjang.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        perpanjang.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        perpanjang.setText("PERPANJANG");
        perpanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perpanjangActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label4.setText("Kode  Buku :");

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setText("DATA PEMINJAMAN BUKU");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conection/Gambar/BtnSearch1.png"))); // NOI18N

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.inactiveForeground"));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conection/Gambar/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("*Tulisakan NIM anda disini");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nmbuku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kdbuku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kdpinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 728, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kembalikan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(perpanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kdpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kdbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nmbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalikan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perpanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nimKeyReleased

    private void perpanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perpanjangActionPerformed
        // TODO add your handling code here:
        try {
            String query = "UPDATE detailPeminjaman SET Tanggal_Kembali = GETDATE() + 7 WHERE Kode_Peminjaman = ?";
            java.sql.Connection conn = Conection.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, kdpinjam.getText());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil Diperpanjang...");

            // Mengosongkan field
            DefaultTableModel tabModel = (DefaultTableModel) JTKEMBALI.getModel();
            tabModel.setRowCount(0);

            // Mengupdate tabel
            java.sql.Statement cmd = conn.createStatement();
            java.sql.ResultSet sqlRes = cmd.executeQuery("SELECT A.Kode_Peminjaman,B.NIM,B.Nama,C.Kode_Buku,C.Nama_Buku,DBO.COBA(A.Kode_Peminjaman) AS Denda FROM tblBuku C JOIN detailPeminjaman A ON C.Kode_Buku = A.Kode_Buku JOIN tbl_Mahasiswa B ON A.NIM = B.NIM");
            while (sqlRes.next()) {
                tabModel.addRow(new Object[]{sqlRes.getString("Kode_Peminjaman"), sqlRes.getString("NIM"), sqlRes.getString("Nama"), sqlRes.getString("Kode_Buku"), sqlRes.getString("Nama_Buku"), sqlRes.getString("Denda")});
            }
            JTKEMBALI.setModel(tabModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_perpanjangActionPerformed

    private void kembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalikanActionPerformed
        // TODO add your handling code here:      
        try {
            String query = "DELETE FROM detailPeminjaman WHERE Kode_Peminjaman = ?";

            java.sql.Connection conn = Conection.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, kdpinjam.getText());

            int rowsAffected = pstm.executeUpdate();

            if (rowsAffected > 0) {
                // Mendapatkan informasi pengguna
                java.time.LocalDate tanggalKembali = java.time.LocalDate.now();
                double denda = 0.0;

                // Memasukkan data kedalam table transaksi
                String transaksiQuery = "INSERT INTO detailPengembalian (Kode_Peminjaman, Nama, Kode_Buku, Nama_Buku, Tanggal_Kembali, Denda) VALUES (?, ?, ?, ?, ?, ?)";
                java.sql.PreparedStatement transaksiPstm = conn.prepareStatement(transaksiQuery);
                transaksiPstm.setInt(1, Integer.parseInt(kdpinjam.getText()));
                transaksiPstm.setString(2, nama.getText());
                transaksiPstm.setString(3, kdbuku.getText());
                transaksiPstm.setString(4, nmbuku.getText());
                transaksiPstm.setDate(5, java.sql.Date.valueOf(tanggalKembali));
                transaksiPstm.setDouble(6, denda);
                transaksiPstm.executeUpdate();

                JOptionPane.showMessageDialog(null, "Berhasil Mengembalikan Buku");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Mengembalikan Buku");
            }

            //Mengosongkan field
            DefaultTableModel tabModel = (DefaultTableModel) JTKEMBALI.getModel();
            tabModel.setRowCount(0);

            // Mengupdate tabel
            java.sql.Statement cmd = conn.createStatement();
            java.sql.ResultSet sqlRes = cmd.executeQuery("SELECT A.Kode_Peminjaman,B.NIM,B.Nama,C.Kode_Buku,C.Nama_Buku,DBO.COBA(A.Kode_Peminjaman) AS Denda FROM tblBuku C JOIN detailPeminjaman A ON C.Kode_Buku = A.Kode_Buku JOIN tbl_Mahasiswa B ON A.NIM = B.NIM");
            while (sqlRes.next()) {
                tabModel.addRow(new Object[]{sqlRes.getString("Kode_Peminjaman"), sqlRes.getString("NIM"), sqlRes.getString("Nama"), sqlRes.getString("Kode_Buku"), sqlRes.getString("Nama_Buku"), sqlRes.getString("Denda")});
            }
            JTKEMBALI.setModel(tabModel);

            // Menutup Statement dan PreparedStatement
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_kembalikanActionPerformed

    private void JTKEMBALIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTKEMBALIMouseClicked
        // TODO add your handling code here:
        int i = JTKEMBALI.getSelectedRow();
        TableModel model = JTKEMBALI.getModel();
        nim.setText(model.getValueAt(i, 1).toString());
        kdpinjam.setText(model.getValueAt(i, 0).toString());
        nama.setText(model.getValueAt(i, 2).toString());
        kdbuku.setText(model.getValueAt(i, 3).toString());
        nmbuku.setText(model.getValueAt(i, 4).toString());
        denda.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_JTKEMBALIMouseClicked

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    private void nimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel tabModel = new DefaultTableModel(new Object[]{"Kode Pinjam", "NIM", "Nama", "Kode Buku", "Nama Buku", "Denda"}, 0);
            try {
                String query = "SELECT A.Kode_Peminjaman,B.NIM,B.Nama,C.Kode_Buku,C.Nama_Buku,DBO.COBA(A.Kode_Peminjaman) AS DENDA  FROM tblBuku C JOIN detailPeminjaman A ON C.Kode_Buku = A.Kode_Buku JOIN tbl_Mahasiswa B ON A.NIM = B.NIM WHERE A.NIM like '%" + nim.getText() + "%'";
                java.sql.Connection conn = (Connection) Conection.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(query);
                java.sql.ResultSet sqlRes = pstm.executeQuery();
                while (sqlRes.next()) {
                    tabModel.addRow(new Object[]{sqlRes.getString("Kode_Peminjaman"), sqlRes.getString("NIM"), sqlRes.getString("Nama"), sqlRes.getString("Kode_Buku"), sqlRes.getString("Nama_Buku"), sqlRes.getString("Denda")});
                }
                JTKEMBALI.setModel(tabModel);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_nimKeyPressed

    private void kembalikanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanMouseClicked
        // TODO add your handling code here:   
        try {
            String query = "DELETE FROM detailPeminjaman WHERE Kode_Peminjaman = ?";
            java.sql.Connection conn = Conection.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, kdpinjam.getText()); // Set the actual Kode_Peminjaman value
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Buku Berhasil Dikembalikan");

            // Mengupdate tabel
            DefaultTableModel tabModel = new DefaultTableModel(new Object[]{"Kode_Peminjaman", "NIM", "Nama", "Kode_Buku", "Nama_Buku", "Denda"}, 0);
            java.sql.Statement cmd = conn.createStatement();
            java.sql.ResultSet sqlRes = cmd.executeQuery("SELECT A.Kode_Peminjaman,B.NIM,B.Nama,C.Kode_Buku,C.Nama_Buku,DBO.COBA(A.Kode_Peminjaman) AS Denda FROM tblBuku C JOIN detailPeminjaman A ON C.Kode_Buku = A.Kode_Buku JOIN tbl_Mahasiswa B ON A.NIM = B.NIM");
            while (sqlRes.next()) {
                tabModel.addRow(new Object[]{sqlRes.getString("Kode_Peminjaman"), sqlRes.getString("NIM"), sqlRes.getString("Nama"), sqlRes.getString("Kode_Buku"), sqlRes.getString("Nama_Buku"), sqlRes.getString("Denda")});
            }
            JTKEMBALI.setModel(tabModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_kembalikanMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Beranda().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(detailPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTKEMBALI;
    private javax.swing.JFormattedTextField denda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField kdbuku;
    private javax.swing.JFormattedTextField kdpinjam;
    private javax.swing.JButton kembalikan;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JFormattedTextField nama;
    private javax.swing.JFormattedTextField nim;
    private javax.swing.JFormattedTextField nmbuku;
    private javax.swing.JButton perpanjang;
    // End of variables declaration//GEN-END:variables
}
