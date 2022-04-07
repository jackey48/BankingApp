/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankingapp;

/**
 *
 * @author msull1
 */
public class Savings extends javax.swing.JFrame {

    /**
     * Creates new form Savings
     */
    public Savings() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        BankLabel1 = new javax.swing.JLabel();
        UsernameText1 = new javax.swing.JTextField();
        UserLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ConfirmText = new javax.swing.JTextField();
        DepositConfirm1 = new javax.swing.JButton();
        DepositClear1 = new javax.swing.JButton();
        WithdrawConfirm1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BankLabel2 = new javax.swing.JLabel();
        UsernameText2 = new javax.swing.JTextField();
        UserLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ConfirmText1 = new javax.swing.JTextField();
        DepositConfirm2 = new javax.swing.JButton();
        DepositClear2 = new javax.swing.JButton();
        WithdrawConfirm2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BankLabel1.setBackground(new java.awt.Color(204, 204, 204));
        BankLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BankLabel1.setForeground(new java.awt.Color(0, 51, 153));
        BankLabel1.setText("Bank Inc. Checking");

        UsernameText1.setEditable(false);
        UsernameText1.setForeground(new java.awt.Color(0, 51, 153));
        UsernameText1.setText("jTextField4");
        UsernameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameText1ActionPerformed(evt);
            }
        });

        UserLabel1.setForeground(new java.awt.Color(0, 51, 153));
        UserLabel1.setText("User:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 153));
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Balance:");

        ConfirmText.setBackground(new java.awt.Color(242, 242, 242));
        ConfirmText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfirmText.setForeground(new java.awt.Color(0, 51, 153));
        ConfirmText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfirmText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmTextActionPerformed(evt);
            }
        });

        DepositConfirm1.setBackground(new java.awt.Color(242, 242, 242));
        DepositConfirm1.setForeground(new java.awt.Color(0, 51, 153));
        DepositConfirm1.setText("Deposit");
        DepositConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositConfirm1ActionPerformed(evt);
            }
        });

        DepositClear1.setBackground(new java.awt.Color(242, 242, 242));
        DepositClear1.setForeground(new java.awt.Color(0, 51, 153));
        DepositClear1.setText("Clear");
        DepositClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositClear1ActionPerformed(evt);
            }
        });

        WithdrawConfirm1.setBackground(new java.awt.Color(242, 242, 242));
        WithdrawConfirm1.setForeground(new java.awt.Color(0, 51, 153));
        WithdrawConfirm1.setText("Withdraw");
        WithdrawConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawConfirm1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Savings Account:");

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setForeground(new java.awt.Color(0, 51, 153));
        jButton3.setText("Go");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(242, 242, 242));
        jButton6.setForeground(new java.awt.Color(0, 51, 153));
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BankLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsernameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DepositConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(WithdrawConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(DepositClear1)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UsernameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserLabel1))
                    .addComponent(BankLabel1))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addComponent(ConfirmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawConfirm1)
                    .addComponent(DepositClear1)
                    .addComponent(DepositConfirm1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addGap(38, 38, 38)
                .addComponent(jButton6)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BankLabel2.setBackground(new java.awt.Color(204, 204, 204));
        BankLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BankLabel2.setForeground(new java.awt.Color(0, 51, 153));
        BankLabel2.setText("Bank Inc. Savings");

        UsernameText2.setEditable(false);
        UsernameText2.setForeground(new java.awt.Color(0, 51, 153));
        UsernameText2.setText("jTextField4");
        UsernameText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameText2ActionPerformed(evt);
            }
        });

        UserLabel2.setForeground(new java.awt.Color(0, 51, 153));
        UserLabel2.setText("User:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 51, 153));
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Balance:");

        ConfirmText1.setBackground(new java.awt.Color(242, 242, 242));
        ConfirmText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfirmText1.setForeground(new java.awt.Color(0, 51, 153));
        ConfirmText1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfirmText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmText1ActionPerformed(evt);
            }
        });

        DepositConfirm2.setBackground(new java.awt.Color(242, 242, 242));
        DepositConfirm2.setForeground(new java.awt.Color(0, 51, 153));
        DepositConfirm2.setText("Deposit");
        DepositConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositConfirm2ActionPerformed(evt);
            }
        });

        DepositClear2.setBackground(new java.awt.Color(242, 242, 242));
        DepositClear2.setForeground(new java.awt.Color(0, 51, 153));
        DepositClear2.setText("Clear");
        DepositClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositClear2ActionPerformed(evt);
            }
        });

        WithdrawConfirm2.setBackground(new java.awt.Color(242, 242, 242));
        WithdrawConfirm2.setForeground(new java.awt.Color(0, 51, 153));
        WithdrawConfirm2.setText("Withdraw");
        WithdrawConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawConfirm2ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Savings Account:");

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setForeground(new java.awt.Color(0, 51, 153));
        jButton4.setText("Go");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(242, 242, 242));
        jButton7.setForeground(new java.awt.Color(0, 51, 153));
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfirmText1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BankLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(UserLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsernameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(DepositConfirm2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(WithdrawConfirm2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DepositClear2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DepositClear2, DepositConfirm2, WithdrawConfirm2});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UsernameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserLabel2))
                    .addComponent(BankLabel2))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addComponent(ConfirmText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawConfirm2)
                    .addComponent(DepositClear2)
                    .addComponent(DepositConfirm2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton4))
                .addGap(38, 38, 38)
                .addComponent(jButton7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameText1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ConfirmTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmTextActionPerformed

    private void DepositConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositConfirm1ActionPerformed
        // TODO add your handling code here:
        balance += Float.parseFloat(ConfirmText.getText());
        jTextField1.setText(String.valueOf(balance));
    }//GEN-LAST:event_DepositConfirm1ActionPerformed

    private void DepositClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositClear1ActionPerformed
        // TODO add your handling code here:
        ConfirmText.setText("");
    }//GEN-LAST:event_DepositClear1ActionPerformed

    private void WithdrawConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawConfirm1ActionPerformed
        // TODO add your handling code here:
        float withdrawl = Float.parseFloat(ConfirmText.getText());
        if (balance >= withdrawl){
            balance -= withdrawl;
        }
        else {
            JOptionPane.showMessageDialog(null, "Insufficient Funds");
        }
        jTextField1.setText(String.valueOf(balance));
    }//GEN-LAST:event_WithdrawConfirm1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Savings().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UsernameText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameText2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ConfirmText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmText1ActionPerformed

    private void DepositConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositConfirm2ActionPerformed
        // TODO add your handling code here:
        balance += Float.parseFloat(ConfirmText.getText());
        jTextField1.setText(String.valueOf(balance));
    }//GEN-LAST:event_DepositConfirm2ActionPerformed

    private void DepositClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositClear2ActionPerformed
        // TODO add your handling code here:
        ConfirmText.setText("");
    }//GEN-LAST:event_DepositClear2ActionPerformed

    private void WithdrawConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawConfirm2ActionPerformed
        // TODO add your handling code here:
        float withdrawl = Float.parseFloat(ConfirmText.getText());
        if (balance >= withdrawl){
            balance -= withdrawl;
        }
        else {
            JOptionPane.showMessageDialog(null, "Insufficient Funds");
        }
        jTextField1.setText(String.valueOf(balance));
    }//GEN-LAST:event_WithdrawConfirm2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Savings().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Savings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BankLabel1;
    private javax.swing.JLabel BankLabel2;
    private javax.swing.JTextField ConfirmText;
    private javax.swing.JTextField ConfirmText1;
    private javax.swing.JButton DepositClear1;
    private javax.swing.JButton DepositClear2;
    private javax.swing.JButton DepositConfirm1;
    private javax.swing.JButton DepositConfirm2;
    private javax.swing.JLabel UserLabel1;
    private javax.swing.JLabel UserLabel2;
    private javax.swing.JTextField UsernameText1;
    private javax.swing.JTextField UsernameText2;
    private javax.swing.JButton WithdrawConfirm1;
    private javax.swing.JButton WithdrawConfirm2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
