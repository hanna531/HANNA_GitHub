package exam;

/**
 *
 * @author KOSTA
 */
public class OrderFood_GUI extends javax.swing.JFrame {
    // 변수 선언
    private ServiceInter servicecook;
    private String name;

    /**
     * Creates new form OrderFood_GUI
     */
    public OrderFood_GUI() {
        // 생성자를 통해 한번만 객체 생성
        servicecook = new ServiceCook();
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
        jLabel1 = new javax.swing.JLabel();
        namev = new javax.swing.JTextField();
        btn_kor = new javax.swing.JButton();
        btn_chi = new javax.swing.JButton();
        btn_indo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resv = new javax.swing.JTextArea();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("이름 : ");

        namev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namevActionPerformed(evt);
            }
        });

        btn_kor.setText("한국요리");
        btn_kor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_korActionPerformed(evt);
            }
        });

        btn_chi.setText("중국요리");
        btn_chi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chiActionPerformed(evt);
            }
        });

        btn_indo.setText("인도요리");
        btn_indo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_indoActionPerformed(evt);
            }
        });

        resv.setColumns(20);
        resv.setRows(5);
        jScrollPane1.setViewportView(resv);

        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_kor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_chi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_indo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namev)
                        .addGap(42, 42, 42)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_chi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_indo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namevActionPerformed

    private void btn_chiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chiActionPerformed
        // 이름이 비어있는지 확인하는 메서드를 호출
        int check = check_text();
        // 이름이 비어있지 않으면
        if (check == 1) {
            // service메서드 호출
            String msg = servicecook.service(name, "2");
            // 받환받은 msg를 append로 출력
            resv.append(msg);
        }

    }//GEN-LAST:event_btn_chiActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        resv.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_korActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_korActionPerformed
        // 이름이 비어있는지 확인하는 메서드를 호출
        int check = check_text();
        // 이름이 비어있지 않으면
        if (check == 1) {
            // service메서드 호출
            String msg = servicecook.service(name, "1");
            // 받환받은 msg를 append로 출력
            resv.append(msg);
        }

    }//GEN-LAST:event_btn_korActionPerformed

    private void btn_indoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_indoActionPerformed
        // 이름이 비어있는지 확인하는 메서드를 호출
        int check = check_text();
        // 이름이 비어있지 않으면
        if (check == 1) {
            // service메서드 호출
            String msg = servicecook.service(name, "3");
            // 받환받은 msg를 append로 출력
            resv.append(msg);
        }

    }//GEN-LAST:event_btn_indoActionPerformed

    // 이름이 비어있는지 확인하는 메서드
    private int check_text() {
        // 이름을 얻어온다.
        name = namev.getText().trim();
        // 비어있으면 다음을 출력 후 0반환
        if (name.equals("")) {
            resv.append("이름을 입력해주세요.\n");
            return 0;
        // 값이 있으면 1을 반환
        } else {
            return 1;
        }
    }

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
            java.util.logging.Logger.getLogger(OrderFood_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFood_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFood_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFood_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFood_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chi;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_indo;
    private javax.swing.JButton btn_kor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namev;
    private javax.swing.JTextArea resv;
    // End of variables declaration//GEN-END:variables
}
