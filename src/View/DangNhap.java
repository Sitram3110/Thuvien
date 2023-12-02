/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.TaiKhoan;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import Model.Login_BLL;
import java.awt.event.KeyEvent;

public class DangNhap extends javax.swing.JFrame {

    Login_BLL loginBLL = new Login_BLL();

    public DangNhap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tenDangNhap = new javax.swing.JTextField();
        btn_DangNhap = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_chucVu = new javax.swing.JComboBox<>();
        txt_matKhau = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng nhập vào hệ thống");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mật khẩu:");

        txt_tenDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_tenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenDangNhapActionPerformed(evt);
            }
        });
        txt_tenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tenDangNhapKeyPressed(evt);
            }
        });

        btn_DangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_DangNhap.setText("Đăng nhập");
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });

        btn_Thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Chức vụ:");

        txt_chucVu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_chucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Độc giả", "Thủ thư", "Admin" }));
        txt_chucVu.setSelectedIndex(1);

        txt_matKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matKhauActionPerformed(evt);
            }
        });
        txt_matKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_matKhauKeyPressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/learning.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_chucVu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tenDangNhap)
                            .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_DangNhap)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Thoat)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(352, 352, 352))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DangNhap)
                    .addComponent(btn_Thoat))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void txt_tenDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tenDangNhapKeyPressed
        int key = evt.getKeyCode();
    
        // Kiểm tra nếu phím Enter được nhấn
        if (key == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txt_tenDangNhapKeyPressed

    private void txt_matKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_matKhauKeyPressed
        int key = evt.getKeyCode();
    
        // Kiểm tra nếu phím Enter được nhấn
        if (key == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txt_matKhauKeyPressed

    private void login(){
        if (txt_tenDangNhap.getText().equals("") || txt_matKhau.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!");
        } else {
            String idQLy = txt_tenDangNhap.getText();
            String user = txt_tenDangNhap.getText();
            if (user.length() < 10) {
                StringBuilder stringBuilder = new StringBuilder(user);

                while (stringBuilder.length() < 10) {
                    stringBuilder.append(' '); // Thêm khoảng trắng
                }

                user = stringBuilder.toString();

            }
            String pass = new String(txt_matKhau.getPassword()).trim();
            String pos = (String) txt_chucVu.getSelectedItem();

            System.err.println(user);
            System.err.println(pass);
            System.err.println(pos);
            System.err.println(loginBLL.checkUser(user, pass, pos));
            if (loginBLL.checkUser(user, pass, pos)) {
                JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng nhập thành công!");
                if ("Admin".equals(pos)) {
                    TrangChuThuThu_QLPXuat.setidQuanLy(idQLy);
                    ThuThuQuanLyPhieuXuat.setidQuanLy(idQLy);
                    ThuThuChiTietPhieuTra.setcheckadmin(true);

                    TrangChuAdmin frameAdmin = new TrangChuAdmin();
                    frameAdmin.setVisible(true);

                    dispose();
                } else if ("Thủ thư".equals(pos)) {
                    TrangChuThuThu_QLPXuat.setidQuanLy(idQLy);
                    ThuThuQuanLyPhieuXuat.setidQuanLy(idQLy);
                    ThuThuChiTietPhieuTra.setcheckadmin(false);

                    TrangChuThuThu frameThuthu = new TrangChuThuThu();
                    frameThuthu.setVisible(true);
                    dispose();
                } else {

                    TrangChuDocGia frameDocgia = new TrangChuDocGia(user);
                    frameDocgia.setVisible(true);
                    dispose();
                }
            } else {
                if(loginBLL.checkTaiKhoanbikhoa(user, pass)){
                    JOptionPane.showMessageDialog(null, "Tài khoản đã bị khóa!", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Thông tin đăng nhập hoặc mật khẩu không hợp lệ!", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }
    
    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_DangNhapActionPerformed
        login();
    }// GEN-LAST:event_btn_DangNhapActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated

    }// GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        TrangChuChinh trangChuAdmin = new TrangChuChinh(); // Tạo mới JFrame TrangChuAdmin (nếu chưa được tạo)
        trangChuAdmin.setVisible(true); // Hiển thị lại JFrame TrangChuAdmin
        this.dispose();
    }// GEN-LAST:event_formWindowClosing

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_ThoatActionPerformed
        new TrangChuChinh().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_btn_ThoatActionPerformed

    private void txt_tenDangNhapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_tenDangNhapActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_tenDangNhapActionPerformed

    private void txt_matKhauActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_matKhauActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_matKhauActionPerformed


    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangNhap;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txt_chucVu;
    private javax.swing.JPasswordField txt_matKhau;
    private javax.swing.JTextField txt_tenDangNhap;
    // End of variables declaration//GEN-END:variables
}
