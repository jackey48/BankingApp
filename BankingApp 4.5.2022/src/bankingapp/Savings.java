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

        ExitButton = new javax.swing.JButton();
        BankLabel = new javax.swing.JLabel();
        WithdrawText = new javax.swing.JTextField();
        BalanceLabel = new javax.swing.JLabel();
        DepositClear = new javax.swing.JButton();
        WithdrawConfirm = new javax.swing.JButton();
        BalanceText = new javax.swing.JTextField();
        DepositLabel = new javax.swing.JLabel();
        WithdrawLabel = new javax.swing.JLabel();
        DepositConfirm = new javax.swing.JButton();
        WithdrawClear = new javax.swing.JButton();
        DepositText = new javax.swing.JTextField();
        UsernameText = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        BankLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BankLabel.setText("Bank Inc. Savings");

        BalanceLabel.setText("Balance:");

        DepositClear.setText("Clear");
        DepositClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositClearActionPerformed(evt);
            }
        });

        WithdrawConfirm.setText("Confirm");
        WithdrawConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawConfirmActionPerformed(evt);
            }
        });

        BalanceText.setEditable(false);
        BalanceText.setText("0");
        BalanceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceTextActionPerformed(evt);
            }
        });

        DepositLabel.setText("Deposit:");

        WithdrawLabel.setText("Withdraw:");

        DepositConfirm.setText("Confirm");
        DepositConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositConfirmActionPerformed(evt);
            }
        });

        WithdrawClear.setText("Clear");
        WithdrawClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawClearActionPerformed(evt);
            }
        });

        DepositText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositTextActionPerformed(evt);
            }
        });

        UsernameText.setEditable(false);
        UsernameText.setText("jTextField4");

        UserLabel.setText("User:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ExitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BankLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DepositLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WithdrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(WithdrawText, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addGap(120, 120, 120))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(DepositText)
                                .addGap(123, 123, 123)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(WithdrawConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WithdrawClear))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DepositConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DepositClear))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BalanceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(BalanceText, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addGap(275, 275, 275)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UserLabel)
                        .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceLabel)
                    .addComponent(BalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepositText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DepositLabel)
                        .addComponent(DepositConfirm)
                        .addComponent(DepositClear)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawLabel)
                    .addComponent(WithdrawClear)
                    .addComponent(WithdrawText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WithdrawConfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DepositClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositClearActionPerformed
        // TODO add your handling code here:
        DepositText.setText("");
    }//GEN-LAST:event_DepositClearActionPerformed

    private void WithdrawConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawConfirmActionPerformed
        // TODO add your handling code here:
        float num1;
        num1 = Float.parseFloat(BalanceText.getText()) - Float.parseFloat(WithdrawText.getText());
        BalanceText.setText(String.valueOf(num1));
    }//GEN-LAST:event_WithdrawConfirmActionPerformed

    private void BalanceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceTextActionPerformed

    private void DepositConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositConfirmActionPerformed
        // TODO add your handling code here:
        float num1;
        num1 = Float.parseFloat(BalanceText.getText()) + Float.parseFloat(DepositText.getText());
        BalanceText.setText(String.valueOf(num1));
    }//GEN-LAST:event_DepositConfirmActionPerformed

    private void WithdrawClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawClearActionPerformed
        WithdrawText.setText("");
    }//GEN-LAST:event_WithdrawClearActionPerformed

    private void DepositTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositTextActionPerformed

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
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JTextField BalanceText;
    private javax.swing.JLabel BankLabel;
    private javax.swing.JButton DepositClear;
    private javax.swing.JButton DepositConfirm;
    private javax.swing.JLabel DepositLabel;
    private javax.swing.JTextField DepositText;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JButton WithdrawClear;
    private javax.swing.JButton WithdrawConfirm;
    private javax.swing.JLabel WithdrawLabel;
    private javax.swing.JTextField WithdrawText;
    // End of variables declaration//GEN-END:variables
}
