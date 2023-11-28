/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DTO.Sach;
import DTO.ThanhLySach;
import Model.ThanhLyBLL;
import java.awt.Font;
import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiena
 */
public class ThuThuQuanLyPhieuXuat extends javax.swing.JFrame {

    /**
     * Creates new form ThuThuQuanLyPhieuXuat
     */
    ThanhLyBLL thanhLyBLL = new ThanhLyBLL();
    private JFileChooser fileChooser;
    private static String idQuanLy;
    public static void setidQuanLy(String tenDangNhapMoi) {
        idQuanLy = tenDangNhapMoi;
    }
    private List<String> thanhlysachs;
    public ThuThuQuanLyPhieuXuat(List<String> thanhlysach) {
        initComponents();
        
        thanhlysachs = thanhlysach;
        txt_Id.setText(thanhlysach.get(0));
        txt_idqly.setText(thanhlysach.get(1));
        txt_IdBook.setText(thanhlysach.get(2));
        txtNameBook.setText(thanhlysach.get(3));
        txt_SLg.setText(thanhlysach.get(4));
//        txt_Lydo.setText(thanhlysach.get(5));
        String lydo = thanhlysach.get(5);
        cb_lydo.setSelectedItem(lydo);    
        txt_ghichu.setText(thanhlysach.get(7));
        txtDate.setText(thanhlysach.get(6));
        txt_Total.setText(thanhlysach.get(8));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPK_tieuDe = new javax.swing.JPanel();
        lbK_tieuDe = new javax.swing.JLabel();
        btnK_veTrangTruoc = new javax.swing.JButton();
        jPK_qlPM = new javax.swing.JPanel();
        jPK_themMaSach = new javax.swing.JPanel();
        txt_IdBook = new javax.swing.JTextField();
        labelTensach = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        labelMasach = new javax.swing.JLabel();
        labelSoluong = new javax.swing.JLabel();
        labelGia = new javax.swing.JLabel();
        txt_SLg = new javax.swing.JTextField();
        labelMaphieuxuat = new javax.swing.JLabel();
        txt_ghichu = new javax.swing.JTextField();
        LabelTongtien = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        labelGhichu = new javax.swing.JLabel();
        txtNameBook = new javax.swing.JTextField();
        labelGhichu1 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        cb_lydo = new javax.swing.JComboBox<>();
        labelGia1 = new javax.swing.JLabel();
        txt_idqly = new javax.swing.JTextField();
        jPK_button = new javax.swing.JPanel();
        jPK_btnQLS = new javax.swing.JPanel();
        btnK_themMaSach = new javax.swing.JButton();
        btnK_luuMaSach = new javax.swing.JButton();
        btnK_suaPX1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPK_tieuDe.setBackground(new java.awt.Color(255, 204, 204));

        lbK_tieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbK_tieuDe.setForeground(java.awt.Color.darkGray);
        lbK_tieuDe.setText("QUẢN LÝ PHIẾU XUẤT");

        btnK_veTrangTruoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnK_veTrangTruoc.setText("Về trang trước");
        btnK_veTrangTruoc.setToolTipText("");
        btnK_veTrangTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_veTrangTruocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPK_tieuDeLayout = new javax.swing.GroupLayout(jPK_tieuDe);
        jPK_tieuDe.setLayout(jPK_tieuDeLayout);
        jPK_tieuDeLayout.setHorizontalGroup(
            jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_tieuDeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnK_veTrangTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lbK_tieuDe)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPK_tieuDeLayout.setVerticalGroup(
            jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_tieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_tieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbK_tieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnK_veTrangTruoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPK_qlPM.setBackground(new java.awt.Color(255, 255, 204));

        jPK_themMaSach.setBackground(new java.awt.Color(204, 204, 255));
        jPK_themMaSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_IdBook.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_IdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdBookActionPerformed(evt);
            }
        });

        labelTensach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTensach.setText("Mã sách:");

        txt_Id.setEditable(false);
        txt_Id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        labelMasach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMasach.setText("Mã phiếu xuất:");

        labelSoluong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelSoluong.setText("Ngày xuất:");

        labelGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelGia.setText("Số lượng:");

        txt_SLg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        labelMaphieuxuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaphieuxuat.setText("Lý do:");

        txt_ghichu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        LabelTongtien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTongtien.setText("Tên sách:");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        labelGhichu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelGhichu.setText("Ghi chú:");

        txtNameBook.setEditable(false);
        txtNameBook.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNameBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameBookActionPerformed(evt);
            }
        });

        labelGhichu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelGhichu1.setText("Tổng tiền:");

        txt_Total.setEditable(false);
        txt_Total.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TotalActionPerformed(evt);
            }
        });

        cb_lydo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hư hỏng mức ít", "Hư hỏng mức vừa", "Hư hỏng mức nhiều", "Hư hỏng mức nghiêm trọng" }));
        cb_lydo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lydoActionPerformed(evt);
            }
        });

        labelGia1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelGia1.setText("Mã quản lý:");

        txt_idqly.setEditable(false);
        txt_idqly.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPK_themMaSachLayout = new javax.swing.GroupLayout(jPK_themMaSach);
        jPK_themMaSach.setLayout(jPK_themMaSachLayout);
        jPK_themMaSachLayout.setHorizontalGroup(
            jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(labelGia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_idqly))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(labelMasach)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Id))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(labelTensach)
                        .addGap(26, 26, 26)
                        .addComponent(txt_IdBook, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(labelGia)
                        .addGap(21, 21, 21)
                        .addComponent(txt_SLg))
                    .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                        .addComponent(labelSoluong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDate)))
                .addGap(28, 28, 28)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMaphieuxuat)
                    .addComponent(labelGhichu1)
                    .addComponent(LabelTongtien)
                    .addComponent(labelGhichu))
                .addGap(23, 23, 23)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Total, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(txtNameBook)
                    .addComponent(txt_ghichu)
                    .addComponent(cb_lydo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPK_themMaSachLayout.setVerticalGroup(
            jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_themMaSachLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMaphieuxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_IdBook)
                        .addComponent(txtNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoluong)
                    .addComponent(txt_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGia)
                    .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_SLg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGhichu1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPK_themMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGia1)
                    .addComponent(txt_idqly, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPK_button.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPK_buttonLayout = new javax.swing.GroupLayout(jPK_button);
        jPK_button.setLayout(jPK_buttonLayout);
        jPK_buttonLayout.setHorizontalGroup(
            jPK_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPK_buttonLayout.setVerticalGroup(
            jPK_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        jPK_btnQLS.setBackground(new java.awt.Color(204, 204, 255));
        jPK_btnQLS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPK_btnQLS.setPreferredSize(new java.awt.Dimension(540, 84));

        btnK_themMaSach.setBackground(new java.awt.Color(255, 204, 204));
        btnK_themMaSach.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_themMaSach.setText("Thêm");
        btnK_themMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_themMaSachActionPerformed(evt);
            }
        });

        btnK_luuMaSach.setBackground(new java.awt.Color(255, 204, 204));
        btnK_luuMaSach.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_luuMaSach.setText("Lưu");
        btnK_luuMaSach.setEnabled(false);
        btnK_luuMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_luuMaSachActionPerformed(evt);
            }
        });

        btnK_suaPX1.setBackground(new java.awt.Color(255, 204, 204));
        btnK_suaPX1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_suaPX1.setText("Sửa");
        btnK_suaPX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_suaPX1ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(255, 204, 204));
        btn_back.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btn_back.setText("Quay lại");
        btn_back.setEnabled(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPK_btnQLSLayout = new javax.swing.GroupLayout(jPK_btnQLS);
        jPK_btnQLS.setLayout(jPK_btnQLSLayout);
        jPK_btnQLSLayout.setHorizontalGroup(
            jPK_btnQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_btnQLSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnK_themMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnK_luuMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnK_suaPX1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPK_btnQLSLayout.setVerticalGroup(
            jPK_btnQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_btnQLSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_btnQLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnK_luuMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnK_themMaSach)
                    .addComponent(btnK_suaPX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPK_qlPMLayout = new javax.swing.GroupLayout(jPK_qlPM);
        jPK_qlPM.setLayout(jPK_qlPMLayout);
        jPK_qlPMLayout.setHorizontalGroup(
            jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPK_qlPMLayout.createSequentialGroup()
                .addComponent(jPK_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1293, 1293, 1293))
            .addGroup(jPK_qlPMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPK_btnQLS, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                    .addComponent(jPK_themMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPK_qlPMLayout.setVerticalGroup(
            jPK_qlPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPK_qlPMLayout.createSequentialGroup()
                .addComponent(jPK_themMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPK_btnQLS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPK_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPK_tieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPK_qlPM, javax.swing.GroupLayout.PREFERRED_SIZE, 884, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPK_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPK_qlPM, javax.swing.GroupLayout.PREFERRED_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnK_veTrangTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_veTrangTruocActionPerformed
        TrangChuThuThu trangChuThuThu = new TrangChuThuThu();
        trangChuThuThu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnK_veTrangTruocActionPerformed

    private void txt_IdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdBookActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtNameBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameBookActionPerformed

    private void txt_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TotalActionPerformed

    private void cb_lydoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lydoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_lydoActionPerformed

    private void btnK_themMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_themMaSachActionPerformed
        txt_Id.setText("");
        txt_IdBook.setText("");
        txtNameBook.setText("");
        txt_SLg.setText("");
        txt_ghichu.setText("");
        txtDate.setText("");
        txt_Total.setText("");
        txt_idqly.setText(idQuanLy);
        btnK_luuMaSach.setEnabled(true);
        btnK_themMaSach.setEnabled(false);
        btnK_suaPX1.setEnabled(false);
        btnDelete.setEnabled(false);
        btn_back.setEnabled(true);

    }//GEN-LAST:event_btnK_themMaSachActionPerformed

    private void btnK_luuMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_luuMaSachActionPerformed
        ThanhLySach thanhLySach = new ThanhLySach();
        thanhLySach.setMaThanhLySach(txt_Id.getText());
        thanhLySach.setMaQuanLy(idQuanLy);
        thanhLySach.setMaSach(txt_IdBook.getText());
        thanhLySach.setGhiChu(txt_ghichu.getText());
        thanhLySach.setLyDoThanhLy((String)cb_lydo.getSelectedItem());
        thanhLySach.setSoLuongSachHong(Integer.parseInt(txt_SLg.getText()));
        thanhLySach.setNgayThanhLy(LocalDate.now());
        double price = thanhLyBLL.tinhtienthanhly(thanhLySach);
        thanhLySach.setTongTienThanhLy(price);

        if(thanhLyBLL.Add(thanhLySach)){
            JOptionPane.showMessageDialog(null, "Thênm mới thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            btnK_luuMaSach.setEnabled(false);
            btnK_themMaSach.setEnabled(true);
            btnK_suaPX1.setEnabled(true);
            btnDelete.setEnabled(true);
            btn_back.setEnabled(false);
            TrangChuThuThu trangChuThuThu = new TrangChuThuThu();
            trangChuThuThu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Thênm mới thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnK_luuMaSachActionPerformed

    private void btnK_suaPX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_suaPX1ActionPerformed
        ThanhLySach thanhLySach = new ThanhLySach();
        thanhLySach.setMaThanhLySach(txt_Id.getText());
        thanhLySach.setMaQuanLy(idQuanLy);
        thanhLySach.setMaSach(txt_IdBook.getText());
        thanhLySach.setGhiChu(txt_ghichu.getText());
        thanhLySach.setLyDoThanhLy((String)cb_lydo.getSelectedItem());
        thanhLySach.setSoLuongSachHong(Integer.parseInt(txt_SLg.getText()));
        thanhLySach.setNgayThanhLy(LocalDate.now());
        double price = thanhLyBLL.tinhtienthanhly(thanhLySach);
        thanhLySach.setTongTienThanhLy(price);
        if(thanhLyBLL.Update(thanhLySach)){
            JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            TrangChuThuThu trangChuThuThu = new TrangChuThuThu();
            trangChuThuThu.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnK_suaPX1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String id = txt_Id.getText();
        if(thanhLyBLL.delete(id)){
            JOptionPane.showMessageDialog(null, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            TrangChuThuThu trangChuThuThu = new TrangChuThuThu();
            trangChuThuThu.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        btnK_luuMaSach.setEnabled(false);
        btnK_themMaSach.setEnabled(true);
        btnK_suaPX1.setEnabled(true);
        btnDelete.setEnabled(true);
        btn_back.setEnabled(false);
        txt_Id.setText(thanhlysachs.get(0));
        txt_idqly.setText(thanhlysachs.get(1));
        txt_IdBook.setText(thanhlysachs.get(2));
        txtNameBook.setText(thanhlysachs.get(3));
        txt_SLg.setText(thanhlysachs.get(4));
//        txt_Lydo.setText(thanhlysach.get(5));
        String lydo = thanhlysachs.get(5);
        cb_lydo.setSelectedItem(lydo);    
        txt_ghichu.setText(thanhlysachs.get(7));
        txtDate.setText(thanhlysachs.get(6));
        txt_Total.setText(thanhlysachs.get(8));
    }//GEN-LAST:event_btn_backActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        TrangChuThuThu trangChuThuThu = new TrangChuThuThu();
        trangChuThuThu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ThuThuQuanLyPhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuThuQuanLyPhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuThuQuanLyPhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuThuQuanLyPhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTongtien;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnK_luuMaSach;
    private javax.swing.JButton btnK_suaPX1;
    private javax.swing.JButton btnK_themMaSach;
    private javax.swing.JButton btnK_veTrangTruoc;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> cb_lydo;
    private javax.swing.JPanel jPK_btnQLS;
    private javax.swing.JPanel jPK_button;
    private javax.swing.JPanel jPK_qlPM;
    private javax.swing.JPanel jPK_themMaSach;
    private javax.swing.JPanel jPK_tieuDe;
    private javax.swing.JLabel labelGhichu;
    private javax.swing.JLabel labelGhichu1;
    private javax.swing.JLabel labelGia;
    private javax.swing.JLabel labelGia1;
    private javax.swing.JLabel labelMaphieuxuat;
    private javax.swing.JLabel labelMasach;
    private javax.swing.JLabel labelSoluong;
    private javax.swing.JLabel labelTensach;
    private javax.swing.JLabel lbK_tieuDe;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtNameBook;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_IdBook;
    private javax.swing.JTextField txt_SLg;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_ghichu;
    private javax.swing.JTextField txt_idqly;
    // End of variables declaration//GEN-END:variables
}
