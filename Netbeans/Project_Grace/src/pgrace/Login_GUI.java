package pgrace;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Login_GUI extends javax.swing.JFrame {

    private String id;
    private String pw;

    private Socket socket;
    private PrintWriter printWriter;
    

    public Login_GUI() {
        initComponents();
        
        try {
            socket = new Socket("localhost", 9999);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginpwv = new javax.swing.JPasswordField();
        loginidv = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HannaRoh\\Desktop\\grace.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("PW:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText(" ID :");

        loginpwv.setText("jPasswordField1");
        loginpwv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginpwvMouseClicked(evt);
            }
        });
        loginpwv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpwvActionPerformed(evt);
            }
        });
        loginpwv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginpwvKeyPressed(evt);
            }
        });

        loginidv.setFont(new java.awt.Font("나눔고딕", 0, 15)); // NOI18N
        loginidv.setText("아이디를 입력해주세요.");
        loginidv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginidvMouseClicked(evt);
            }
        });
        loginidv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginidvActionPerformed(evt);
            }
        });
        loginidv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginidvKeyPressed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(153, 0, 153));
        loginBtn.setText("LOG IN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signupBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(153, 0, 153));
        signupBtn.setText("JOIN");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(loginpwv, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(loginidv, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginBtn)
                        .addGap(52, 52, 52)
                        .addComponent(signupBtn)))
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(loginidv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(loginpwv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginBtn)
                            .addComponent(signupBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String id = loginidv.getText().trim();
        String password = loginpwv.getText().trim();

        String testid = "12345";
        String testpwd = "00000";

        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "아이디를 입력해주세요");
            loginidv.requestFocus();
        } else {
            if (password.equals("")) {
                JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요");
                loginpwv.requestFocus();
            } else {
                BufferedReader br = null;

                try {
                    String login = "login/" + id + "/" + password + "/";
                    printWriter.println(login);
                    printWriter.flush();

                    br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String receive = br.readLine();

                    if (receive.equals("login/true/")) {
                        JOptionPane.showMessageDialog(this, "로그인 되었습니다.");;

                    } else if (receive.equals("login/false/")) {
                        JOptionPane.showMessageDialog(this, "비밀번호를 다시 입력해주세요.");
                        loginpwv.setText("");

                    } else if (receive.equals("id/none/")) {
                        JOptionPane.showMessageDialog(this, "아이디가 없습니다.");
                        loginpwv.setText("");
                        loginidv.setText("");
                    }
                } catch (IOException ex) {
                }

            }
        }

        System.out.println("memberInfo");

        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginpwvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpwvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginpwvActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupBtnActionPerformed

    private void loginidvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginidvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginidvActionPerformed

    private void loginpwvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpwvMouseClicked
        loginpwv.setText("");
    }//GEN-LAST:event_loginpwvMouseClicked

    private void loginidvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginidvMouseClicked
        loginidv.setText("");
        loginpwv.setText("");
    }//GEN-LAST:event_loginidvMouseClicked

    private void loginpwvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginpwvKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String id = loginidv.getText().trim();
            String password = loginpwv.getText().trim();

            String testid = "12345";
            String testpwd = "00000";

            if (id.equals("")) {
                JOptionPane.showMessageDialog(this, "아이디를 입력해주세요");
                loginidv.requestFocus();
            } else {
                if (password.equals("")) {
                    JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요");
                    loginpwv.requestFocus();
                } else {
                    BufferedReader br = null;

                    try {
                        String login = "login/" + id + "/" + password + "/";
                        printWriter.println(login);
                        printWriter.flush();

                        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String receive = br.readLine();

                        if (receive.equals("login/true/")) {
                            JOptionPane.showMessageDialog(this, "로그인 되었습니다.");;

                        } else if (receive.equals("login/false/")) {
                            JOptionPane.showMessageDialog(this, "비밀번호를 다시 입력해주세요.");
                            loginpwv.setText("");

                        } else if (receive.equals("id/none/")) {
                            JOptionPane.showMessageDialog(this, "아이디가 없습니다.");
                            loginpwv.setText("");
                            loginidv.setText("");
                        }
                    } catch (IOException ex) {
                    }

                }
            }

            System.out.println("memberInfo");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_loginpwvKeyPressed

    private void loginidvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginidvKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            loginpwv.setText("");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_loginidvKeyPressed

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
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginidv;
    private javax.swing.JPasswordField loginpwv;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables

}
