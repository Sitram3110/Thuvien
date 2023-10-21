/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.KetNoiSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nguye
 */
public class TrangChuThuThu_TimKiem extends javax.swing.JFrame {
    
    /**
     * Creates new form TimKiem
     */
    public TrangChuThuThu_TimKiem() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPK_tieuDe = new javax.swing.JPanel();
        lbK_tieuDe = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTPK_timKiem = new javax.swing.JTabbedPane();
        jPK_timKiemSach = new javax.swing.JPanel();
        lbK_timKiemSach = new javax.swing.JLabel();
        txtK_timKiemSach = new javax.swing.JTextField();
        btnK_timSach = new javax.swing.JButton();
        btnK_refreshSach = new javax.swing.JButton();
        jSPK_timKiemSach = new javax.swing.JScrollPane();
        tblK_Sach = new javax.swing.JTable();
        jPK_timKiemBanDoc = new javax.swing.JPanel();
        lbK_timKiemBanDoc = new javax.swing.JLabel();
        txtK_timKiemBanDoc = new javax.swing.JTextField();
        btnK_timBanDoc = new javax.swing.JButton();
        btnK_refreshBanDoc = new javax.swing.JButton();
        jSPK_timKiemBanDoc = new javax.swing.JScrollPane();
        tblK_banDoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jPK_tieuDe.setBackground(new java.awt.Color(255, 255, 204));

        lbK_tieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbK_tieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searching.png"))); // NOI18N
        lbK_tieuDe.setText("  HỖ TRỢ TÌM KIẾM");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_previous.png"))); // NOI18N
        jButton1.setText("Trở về");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPK_tieuDeLayout = new javax.swing.GroupLayout(jPK_tieuDe);
        jPK_tieuDe.setLayout(jPK_tieuDeLayout);
        jPK_tieuDeLayout.setHorizontalGroup(
            jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_tieuDeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(313, 313, 313)
                .addComponent(lbK_tieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPK_tieuDeLayout.setVerticalGroup(
            jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_tieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbK_tieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPK_tieuDeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTPK_timKiem.setBackground(new java.awt.Color(255, 255, 204));
        jTPK_timKiem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jPK_timKiemSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbK_timKiemSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_timKiemSach.setText("Tìm kiếm");

        txtK_timKiemSach.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnK_timSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_timSach.setText("Tìm");
        btnK_timSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_timSachActionPerformed(evt);
            }
        });

        btnK_refreshSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_refreshSach.setText("Làm mới");
        btnK_refreshSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_refreshSachActionPerformed(evt);
            }
        });

        jSPK_timKiemSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tblK_Sach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPK_timKiemSach.setViewportView(tblK_Sach);

        javax.swing.GroupLayout jPK_timKiemSachLayout = new javax.swing.GroupLayout(jPK_timKiemSach);
        jPK_timKiemSach.setLayout(jPK_timKiemSachLayout);
        jPK_timKiemSachLayout.setHorizontalGroup(
            jPK_timKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_timKiemSachLayout.createSequentialGroup()
                .addGroup(jPK_timKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPK_timKiemSachLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbK_timKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtK_timKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnK_timSach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnK_refreshSach, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPK_timKiemSachLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSPK_timKiemSach)))
                .addContainerGap())
        );
        jPK_timKiemSachLayout.setVerticalGroup(
            jPK_timKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_timKiemSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_timKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnK_timSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtK_timKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbK_timKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK_refreshSach, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSPK_timKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTPK_timKiem.addTab("Sách", new javax.swing.ImageIcon(getClass().getResource("/Images/book.png")), jPK_timKiemSach); // NOI18N

        jPK_timKiemBanDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbK_timKiemBanDoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbK_timKiemBanDoc.setText("Tìm kiếm");

        txtK_timKiemBanDoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnK_timBanDoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_timBanDoc.setText("Tìm");
        btnK_timBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_timBanDocActionPerformed(evt);
            }
        });

        btnK_refreshBanDoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_refreshBanDoc.setText("Làm mới");
        btnK_refreshBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_refreshBanDocActionPerformed(evt);
            }
        });

        jSPK_timKiemBanDoc.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        tblK_banDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPK_timKiemBanDoc.setViewportView(tblK_banDoc);

        javax.swing.GroupLayout jPK_timKiemBanDocLayout = new javax.swing.GroupLayout(jPK_timKiemBanDoc);
        jPK_timKiemBanDoc.setLayout(jPK_timKiemBanDocLayout);
        jPK_timKiemBanDocLayout.setHorizontalGroup(
            jPK_timKiemBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_timKiemBanDocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbK_timKiemBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtK_timKiemBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnK_timBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnK_refreshBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPK_timKiemBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPK_timKiemBanDocLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSPK_timKiemBanDoc)
                    .addContainerGap()))
        );
        jPK_timKiemBanDocLayout.setVerticalGroup(
            jPK_timKiemBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_timKiemBanDocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_timKiemBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbK_timKiemBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtK_timKiemBanDoc)
                    .addComponent(btnK_refreshBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK_timBanDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(426, Short.MAX_VALUE))
            .addGroup(jPK_timKiemBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPK_timKiemBanDocLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jSPK_timKiemBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTPK_timKiem.addTab("Bạn đọc", new javax.swing.ImageIcon(getClass().getResource("/Images/searching.png")), jPK_timKiemBanDoc); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPK_timKiem)
            .addComponent(jPK_tieuDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPK_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPK_timKiem))
        );

        jTPK_timKiem.getAccessibleContext().setAccessibleName("Sách");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnK_timSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_timSachActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnK_timSachActionPerformed

    private void btnK_timBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_timBanDocActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnK_timBanDocActionPerformed

    private void btnK_refreshSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_refreshSachActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnK_refreshSachActionPerformed

    private void btnK_refreshBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_refreshBanDocActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnK_refreshBanDocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        
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
            java.util.logging.Logger.getLogger(TrangChuThuThu_TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuThuThu_TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuThuThu_TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuThuThu_TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuThuThu_TimKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnK_refreshBanDoc;
    private javax.swing.JButton btnK_refreshSach;
    private javax.swing.JButton btnK_timBanDoc;
    private javax.swing.JButton btnK_timSach;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPK_tieuDe;
    private javax.swing.JPanel jPK_timKiemBanDoc;
    private javax.swing.JPanel jPK_timKiemSach;
    private javax.swing.JScrollPane jSPK_timKiemBanDoc;
    private javax.swing.JScrollPane jSPK_timKiemSach;
    private javax.swing.JTabbedPane jTPK_timKiem;
    private javax.swing.JLabel lbK_tieuDe;
    private javax.swing.JLabel lbK_timKiemBanDoc;
    private javax.swing.JLabel lbK_timKiemSach;
    private javax.swing.JTable tblK_Sach;
    private javax.swing.JTable tblK_banDoc;
    private javax.swing.JTextField txtK_timKiemBanDoc;
    private javax.swing.JTextField txtK_timKiemSach;
    // End of variables declaration//GEN-END:variables
}
