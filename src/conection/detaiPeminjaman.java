/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Gilang
 */
public class detaiPeminjaman extends javax.swing.JFrame {
    DefaultTableModel tabModel = new DefaultTableModel();

    /**
     * Creates new form detaiPeminjaman
     */
    public detaiPeminjaman() {
        initComponents();

    }

    detaiPeminjaman(String selectedKodeBuku, String selectedNamaBuku) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    detaiPeminjaman(String KDBUKU, String Nama, String NIM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        JTBUKU = new javax.swing.JTable();
        SAVE = new javax.swing.JButton();
        label2 = new java.awt.Label();
        Nimtxt = new javax.swing.JFormattedTextField();
        Nama = new javax.swing.JFormattedTextField();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        KDBUKU = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        JTBUKU.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTBUKU);

        SAVE.setBackground(java.awt.SystemColor.inactiveCaption);
        SAVE.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        SAVE.setText("PINJAM");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        SAVE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SAVEKeyPressed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label2.setText("NIM");

        Nimtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NimtxtActionPerformed(evt);
            }
        });
        Nimtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NimtxtKeyPressed(evt);
            }
        });

        Nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NamaKeyPressed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label3.setText("Nama");

        label1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        label1.setText("Kode Buku");

        KDBUKU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KDBUKUKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setText("DATA PEMINJAMAN BUKU");

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.inactiveForeground"));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conection/Gambar/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conection/Gambar/print (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SAVE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KDBUKU)
                            .addComponent(Nimtxt)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(KDBUKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Nimtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(SAVE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
        try {
            String query = "INSERT INTO detailPeminjaman (Kode_Peminjaman, NIM, Nama, Kode_Buku, Tanggal_Pinjam, Tanggal_Kembali) VALUES (?, ?, ?, ?, GETDATE(), DATEADD(day, 7, GETDATE()))";
            String updateQuery = "UPDATE tblBuku SET Jumlah = Jumlah - 1 WHERE Kode_Buku = ?";

            java.sql.Connection conn = (Connection) Conection.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(query);
            java.sql.PreparedStatement updatePstm = conn.prepareStatement(updateQuery);

            String Kode_Peminjaman = ((String) java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("ddMMyy"))) + ((int) (Math.random() * (999 - 100 + 1) + 100));
            pstm.setString(1, Kode_Peminjaman);
            pstm.setInt(2, Integer.parseInt(Nimtxt.getText()));
            pstm.setString(3, Nama.getText());
            pstm.setString(4, KDBUKU.getText());

            // Menambahkan kondisi untuk memeriksa jumlah buku
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery("SELECT Jumlah FROM tblBuku WHERE Kode_Buku = '" + KDBUKU.getText() + "'");
            if (rs.next()) {
                int jumlahBuku = rs.getInt("Jumlah");
                if (jumlahBuku <= 0) {
                    JOptionPane.showMessageDialog(null, "Stok Buku Habis");
                    return;
                }
            }

            pstm.execute();
            updatePstm.setString(1, KDBUKU.getText());
            updatePstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil Meminjam Buku...");

            // Mengosongkan field
            Nimtxt.setText("");
            Nama.setText("");
            KDBUKU.setText("");

            // Mengupdate tabel
            DefaultTableModel tabModel = new DefaultTableModel(new Object[]{"Nama", "Kode_Buku", "Nama_Buku", "Penerbit", "Tanggal_Pinjam", "Tanggal_Kembali"}, 0);
            java.sql.Statement cmd = conn.createStatement();
            java.sql.ResultSet sqlRes = cmd.executeQuery("SELECT A.Nama, B.Kode_Buku, B.Nama_Buku, B.Penerbit, D.Tanggal_Pinjam, D.Tanggal_Kembali FROM tblBuku B JOIN detailPeminjaman D ON B.Kode_Buku = D.Kode_Buku JOIN tbl_Mahasiswa A ON D.NIM = A.NIM");
            while (sqlRes.next()) {
                tabModel.addRow(new Object[]{sqlRes.getString("Nama"), sqlRes.getString("Kode_Buku"), sqlRes.getString("Nama_Buku"), sqlRes.getString("Penerbit"), sqlRes.getString("Tanggal_Pinjam"), sqlRes.getString("Tanggal_Kembali")});
            }
            JTBUKU.setModel(tabModel);

            // Menutup ResultSet, Statement, dan PreparedStatement
            sqlRes.close();
            cmd.close();
            pstm.close();
            updatePstm.close();
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SAVEActionPerformed

    private void NimtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NimtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NimtxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Beranda().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String file1 = "C:\\Users\\Gilang\\Documents\\NetBeansProjects\\Conection\\src\\conection\\reportdetailPeminjaman.jasper";
            Conection Connect = new Conection();
            Connection con = Conection.configDB();
            HashMap<String, Object> parameter = new HashMap<>();
            parameter.put("NIM", Integer.parseInt(Nimtxt.getText()));
            File file = new File(file1);
            //JasperDesign jasperDesign = JRXmlLoader.load(file);;
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, con);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SAVEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SAVEKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SAVEActionPerformed(null);
        }
    }//GEN-LAST:event_SAVEKeyPressed

    private void KDBUKUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KDBUKUKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SAVEActionPerformed(null);
        }
    }//GEN-LAST:event_KDBUKUKeyPressed

    private void NamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SAVEActionPerformed(null);
        }
    }//GEN-LAST:event_NamaKeyPressed

    private void NimtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NimtxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SAVEActionPerformed(null);
        }
    }//GEN-LAST:event_NimtxtKeyPressed

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
            java.util.logging.Logger.getLogger(detaiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detaiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detaiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detaiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detaiPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTBUKU;
    private javax.swing.JFormattedTextField KDBUKU;
    private javax.swing.JFormattedTextField Nama;
    private javax.swing.JFormattedTextField Nimtxt;
    private javax.swing.JButton SAVE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables

}
