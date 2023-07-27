/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import custom.NhanVienCustom;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import service.impl.NhanVienServiceImpl;
import util.UserHelper;

public class frmLogin extends javax.swing.JFrame {

    int showHidePass = 1;  
    private void close() {
        this.dispose();
    }
    private void minus() {
        this.setState(1);
    }

    private void showHidePassword() {
        showHidePass++;
        if (showHidePass % 2 == 0) {
            Image img = getToolkit().createImage("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\hidePass.png");
            btnEye.setIcon(new ImageIcon(img));
            txtMatKhau.setEchoChar((char) 0);
        } else {
            Image img = getToolkit().createImage("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\hidePass.png");
            btnEye.setIcon(new ImageIcon(img));
            txtMatKhau.setEchoChar('\u25cf');
        }
    }
    private void changeFore(int so, JButton btn, int so1, int so2, int so3) {
        if (so == 1) {
            btn.setForeground(new Color(so1, so2, so3));
            btn.setCursor(new Cursor(HAND_CURSOR));
        } else {
            btn.setForeground(new Color(so1, so2, so3));
        }
    }
   

    private void loadOpenForm() {
        for (double i = 0.0; i < 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.parseFloat(val);
            this.setOpacity(f);
            try {
                Thread.sleep(70);
            } catch (Exception e) {
            }
        }
    }
    
   
    private NhanVienServiceImpl service;
    public frmLogin() {
        initComponents();
        setLocationRelativeTo(this);
        
        service = new NhanVienServiceImpl();
        txtTaiKhoan.setForeground(Color.black);
      //  txtTaiKhoan.setBackground(new Color(0, 0, 0, 0));
        txtMatKhau.setForeground(Color.black);
        //txtMatKhau.setBackground(new Color(0, 0, 0, 0));
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
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnEye = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnquenMK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(405, 736));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogin.setContentAreaFilled(false);
        btnLogin.setDefaultCapable(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 100, 40));

        btnEye.setIcon(new javax.swing.ImageIcon("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\hidePass.png")); // NOI18N
        btnEye.setBorder(null);
        btnEye.setBorderPainted(false);
        btnEye.setContentAreaFilled(false);
        btnEye.setDefaultCapable(false);
        btnEye.setFocusPainted(false);
        btnEye.setFocusable(false);
        btnEye.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEyeMouseEntered(evt);
            }
        });
        btnEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEyeActionPerformed(evt);
            }
        });
        jPanel2.add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 30, 30));

        btnClose.setIcon(new javax.swing.ImageIcon("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\close.png")); // NOI18N
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setDefaultCapable(false);
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 80));

        btnMinus.setIcon(new javax.swing.ImageIcon("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\minus.png")); // NOI18N
        btnMinus.setBorder(null);
        btnMinus.setBorderPainted(false);
        btnMinus.setContentAreaFilled(false);
        btnMinus.setFocusPainted(false);
        btnMinus.setFocusable(false);
        btnMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinusMouseExited(evt);
            }
        });
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 60));

        btnquenMK.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnquenMK.setText("Quên mật khẩu");
        btnquenMK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnquenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquenMKActionPerformed(evt);
            }
        });
        jPanel2.add(btnquenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên đăng nhập");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTaiKhoan.setText("NV01");
        txtTaiKhoan.setBorder(null);
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        jPanel2.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 300, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMatKhau.setText("hnt123");
        txtMatKhau.setBorder(null);
        jPanel2.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\people.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 100));

        BG.setIcon(new javax.swing.ImageIcon("C:\\Test\\QLNhaHang\\src\\main\\java\\image\\BGLogin.png")); // NOI18N
        jPanel2.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadOpenForm();
    }//GEN-LAST:event_formWindowOpened

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
       changeFore(1, btnLogin, 255, 0, 0);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
       changeFore(2, btnLogin, 255, 255, 255);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       // login();
        String taiKhoan = txtTaiKhoan.getText().trim();
        String matKhau = txtMatKhau.getText().trim();
        if (taiKhoan.isEmpty() || matKhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tai khoan va Mat khau khong duoc bo trong");
            return;
        }
        if (matKhau.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Mat khau khong duoc bo trong !");
            return;
        }
        NhanVienCustom nhanVien = new NhanVienCustom();
       // NhanVienCustom nhanVien = service.checkLogin(taiKhoan, matKhau);
        nhanVien = service.getByUser(taiKhoan);
        if (nhanVien == null) {
            JOptionPane.showMessageDialog(this, "Ten tai khoan khong dung");
            return;
        }
        
        nhanVien = service.getByPass(matKhau);
        if (nhanVien == null) {
            JOptionPane.showMessageDialog(this, "Mat khau khong dung");
            return;
        }
        
        if (nhanVien.getTrangThai() == 2) {
            JOptionPane.showMessageDialog(this, "Tai khoan nhan vien da nghi viec");
            return;
        }
        if (nhanVien != null) {
            UserHelper.getUser = nhanVien;
            JOptionPane.showMessageDialog(this, "Dang nhap thanh cong !");
            new TrangChu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEyeActionPerformed
        showHidePassword();
    }//GEN-LAST:event_btnEyeActionPerformed

    private void btnEyeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMouseEntered
       // btnEye.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnEyeMouseEntered

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        close();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
      
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
      // 
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        minus();
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMinusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinusMouseEntered
    
    }//GEN-LAST:event_btnMinusMouseEntered

    private void btnMinusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinusMouseExited
       
    }//GEN-LAST:event_btnMinusMouseExited

    private void btnquenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquenMKActionPerformed
      
         UserHelper.ma = txtTaiKhoan.getText().trim();
        new FrameQMK().setVisible(true);
    }//GEN-LAST:event_btnquenMKActionPerformed

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEye;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnquenMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
