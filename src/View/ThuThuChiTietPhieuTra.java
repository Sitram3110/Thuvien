/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DTO.ChiTietPhieuMuon;
import DTO.Sach;
import Model.PhieuTra_BLL;
import java.util.AbstractMap;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1
 */
public class ThuThuChiTietPhieuTra extends javax.swing.JFrame {

    /**
     * Creates new form ThuThuChiTietPhieuTra
     */
    PhieuTra_BLL phieuTra_BLL = new PhieuTra_BLL();
    DefaultTableModel defaultTableModelPTr;
    private String id; 
    private JFileChooser fileChooser;
    public ThuThuChiTietPhieuTra(String id) {
        initComponents();
        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn đường dẫn lưu tệp Excel");
        this.id = id;
        loaddata(phieuTra_BLL.loaddataCT(id));
        
//        btnK_luuChiTiet.setEnabled(tinhtrang);
        
          
        
    }
    
    
    
    private void loaddata(AbstractMap.SimpleEntry<List<Sach>, List<ChiTietPhieuMuon>> data) {
        List<Sach> processedBooks = data.getKey();
        List<ChiTietPhieuMuon> processedExports = data.getValue();
        
        defaultTableModelPTr = new DefaultTableModel();
        tblK_ChiTiet.setModel(defaultTableModelPTr);
        defaultTableModelPTr.addColumn("Mã sách");
        defaultTableModelPTr.addColumn("Tên sách");
        defaultTableModelPTr.addColumn("Ngày thực trả");
	defaultTableModelPTr.addColumn("Tiền phạt");
        defaultTableModelPTr.addColumn("Tình trạng sách");

        // Duyệt qua danh sách sách và thanh lý sách đã xử lý
        for (ChiTietPhieuMuon chiTietPhieuMuon : processedExports) {
            // Tìm sách tương ứng trong danh sách đã xử lý
            Sach book = findBookByMaSach(processedBooks, chiTietPhieuMuon.getMaSach());

            // Kiểm tra nếu sách không null
            if (book != null) {
                // Thêm thông tin vào bảng
                defaultTableModelPTr.addRow(new Object[] {chiTietPhieuMuon.getMaSach(), book.getTenSach() ,chiTietPhieuMuon.getNgayThuctra(), chiTietPhieuMuon.getTienPhat(), chiTietPhieuMuon.getTinhTrangSach()});

            }
        }
    }

    private Sach findBookByMaSach(List<Sach> books, String maSach) {
        for (Sach book : books) {
            if (book.getMaSach().equals(maSach)) {
                return book;
            }
        }
        return null;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_ChiTietPM = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        K_tieuDe = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtTienPhat = new javax.swing.JTextField();
        cb_tinhtrang = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        btnK_suaChiTiet = new javax.swing.JButton();
        btnK_luuChiTiet = new javax.swing.JButton();
        BTN_EXCEL = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblK_ChiTiet = new javax.swing.JTable();
        btnK_veTrangTruoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1430, 645));

        Panel_ChiTietPM.setBackground(new java.awt.Color(255, 255, 204));
        Panel_ChiTietPM.setPreferredSize(new java.awt.Dimension(1080, 740));

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Tên sách:");

        K_tieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        K_tieuDe.setForeground(new java.awt.Color(0, 0, 0));
        K_tieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
        K_tieuDe.setText("Chi Tiết Phiếu Trả");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Mã sách:");

        txtMaSach.setEditable(false);
        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });
        txtMaSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaSachKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaSachKeyTyped(evt);
            }
        });

        txtname.setEditable(false);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Tình trạng:");

        txtDate.setEditable(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Ngày trả:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Tiền phạt:");

        txtTienPhat.setEditable(false);
        txtTienPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienPhatActionPerformed(evt);
            }
        });
        txtTienPhat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienPhatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTienPhatKeyTyped(evt);
            }
        });

        cb_tinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không hỏng", "Mất sách", "Bị hỏng" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(K_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtname)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_tinhtrang, 0, 270, Short.MAX_VALUE)))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(K_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel32)
                    .addComponent(txtTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        btnK_suaChiTiet.setBackground(new java.awt.Color(255, 204, 204));
        btnK_suaChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_suaChiTiet.setForeground(new java.awt.Color(0, 0, 0));
        btnK_suaChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exchange1.png"))); // NOI18N
        btnK_suaChiTiet.setText("Sửa thông tin");
        btnK_suaChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_suaChiTietActionPerformed(evt);
            }
        });

        btnK_luuChiTiet.setBackground(new java.awt.Color(255, 204, 204));
        btnK_luuChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_luuChiTiet.setForeground(new java.awt.Color(0, 0, 0));
        btnK_luuChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luu.png"))); // NOI18N
        btnK_luuChiTiet.setText("Cập nhật trả sách");
        btnK_luuChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_luuChiTietActionPerformed(evt);
            }
        });

        BTN_EXCEL.setBackground(new java.awt.Color(255, 204, 204));
        BTN_EXCEL.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        BTN_EXCEL.setForeground(new java.awt.Color(0, 0, 0));
        BTN_EXCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer.png"))); // NOI18N
        BTN_EXCEL.setText("Xuất Excel");
        BTN_EXCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EXCELActionPerformed(evt);
            }
        });

        tblK_ChiTiet.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tblK_ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK_ChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblK_ChiTietMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblK_ChiTiet);

        btnK_veTrangTruoc.setBackground(new java.awt.Color(255, 204, 204));
        btnK_veTrangTruoc.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnK_veTrangTruoc.setForeground(new java.awt.Color(0, 0, 0));
        btnK_veTrangTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_previous.png"))); // NOI18N
        btnK_veTrangTruoc.setText("Về trang trước");
        btnK_veTrangTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK_veTrangTruocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ChiTietPMLayout = new javax.swing.GroupLayout(Panel_ChiTietPM);
        Panel_ChiTietPM.setLayout(Panel_ChiTietPMLayout);
        Panel_ChiTietPMLayout.setHorizontalGroup(
            Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_ChiTietPMLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ChiTietPMLayout.createSequentialGroup()
                        .addGroup(Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnK_veTrangTruoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_ChiTietPMLayout.createSequentialGroup()
                        .addComponent(btnK_luuChiTiet)
                        .addGap(18, 18, 18)
                        .addComponent(btnK_suaChiTiet)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_EXCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(440, Short.MAX_VALUE))))
        );
        Panel_ChiTietPMLayout.setVerticalGroup(
            Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ChiTietPMLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnK_luuChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK_suaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_EXCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_ChiTietPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_ChiTietPMLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnK_veTrangTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_ChiTietPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_ChiTietPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblK_ChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblK_ChiTietMouseClicked
        int row = tblK_ChiTiet.getSelectedRow();
        txtMaSach.setText(tblK_ChiTiet.getValueAt(row, 0).toString());
        txtname.setText(tblK_ChiTiet.getValueAt(row, 1).toString());
        Object dateValue = tblK_ChiTiet.getValueAt(row, 2);
        if (dateValue != null) {
            txtDate.setText(dateValue.toString());
        } 
        else {
            txtDate.setText("");
        }
        
        
        txtTienPhat.setText(tblK_ChiTiet.getValueAt(row, 3).toString());
        cb_tinhtrang.setSelectedItem(tblK_ChiTiet.getValueAt(row, 4).toString());
        
        if(tblK_ChiTiet.getValueAt(row, 2) == null){
            btnK_luuChiTiet.setEnabled(true);
            btnK_suaChiTiet.setEnabled(false);
        }else{
            btnK_luuChiTiet.setEnabled(false);
            btnK_suaChiTiet.setEnabled(true);

        }
        
    }//GEN-LAST:event_tblK_ChiTietMouseClicked

    private void btnK_veTrangTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_veTrangTruocActionPerformed
        TrangChuAdmin trangChuAdmin = new TrangChuAdmin(); // Tạo mới JFrame TrangChuAdmin (nếu chưa được tạo)
        trangChuAdmin.setVisible(true); // Hiển thị lại JFrame TrangChuAdmin
        this.dispose();
    }//GEN-LAST:event_btnK_veTrangTruocActionPerformed

    private void btnK_suaChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_suaChiTietActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn cập nhật?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    
        if (confirm == JOptionPane.YES_OPTION) {
            String idsach = txtMaSach.getText();
            String tinhtrang = (String) cb_tinhtrang.getSelectedItem();
            // Thực hiện các công việc cập nhật khác nếu cầnh(id);
            if(!phieuTra_BLL.updateChiTietPhieuMuon(id, idsach, tinhtrang)){
                JOptionPane.showMessageDialog(null, "Hãy thay đổi tình trạng sách khác so với ban đầu!", "Cập nhật thất bại!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "", "Cập nhật thành công!", JOptionPane.INFORMATION_MESSAGE);
            }
            loaddata(phieuTra_BLL.loaddataCT(id));
        }
    }//GEN-LAST:event_btnK_suaChiTietActionPerformed

    private void btnK_luuChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK_luuChiTietActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Cập nhật trả sach!", "Xác nhận", JOptionPane.YES_NO_OPTION);
    
        if (confirm == JOptionPane.YES_OPTION) {
            String idsach = txtMaSach.getText();
            String tinhtrang = (String) cb_tinhtrang.getSelectedItem();
            // Thực hiện các công việc cập nhật khác nếu cầnh(id);
            phieuTra_BLL.updateTraSach(id, idsach, tinhtrang);
            loaddata(phieuTra_BLL.loaddataCT(id));
        }
    }//GEN-LAST:event_btnK_luuChiTietActionPerformed

    private void BTN_EXCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EXCELActionPerformed
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            String duongDanTep = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx";
            AbstractMap.SimpleEntry<List<Sach>, List<ChiTietPhieuMuon>> danhsachCTphieutra = phieuTra_BLL.loaddataCT(id);

            if (phieuTra_BLL.exportToExcel(danhsachCTphieutra, duongDanTep, id)) {
                // Hiển thị hộp thoại thông báo giống như khi tải xuống
                JOptionPane.showMessageDialog(this, "Tệp đã được lưu tại:\n" + duongDanTep, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Xuất Excel thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTN_EXCELActionPerformed

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void txtMaSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaSachKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachKeyReleased

    private void txtMaSachKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaSachKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachKeyTyped

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateKeyReleased

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateKeyTyped

    private void txtTienPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhatActionPerformed

    private void txtTienPhatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienPhatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhatKeyReleased

    private void txtTienPhatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienPhatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhatKeyTyped

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_EXCEL;
    private javax.swing.JLabel K_tieuDe;
    private javax.swing.JPanel Panel_ChiTietPM;
    private javax.swing.JButton btnK_luuChiTiet;
    private javax.swing.JButton btnK_suaChiTiet;
    private javax.swing.JButton btnK_veTrangTruoc;
    private javax.swing.JComboBox<String> cb_tinhtrang;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblK_ChiTiet;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtTienPhat;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
