/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import User.Address;
import User.CreditCard;
import User.FinancialAccounts;
import User.License;
import User.Person;

/**
 *
 * @author mengtingyang
 */
public class checkJFrame extends javax.swing.JFrame {

    /**
     * Creates new form checkJFrame
     */
    public Person person;
    public CreditCard creditcard;
    public License license;
    public FinancialAccounts financialaccounts;
    public Address address;
    
    public checkJFrame() {
        initComponents();
        creditcard=new CreditCard();
        license=new License();
        financialaccounts=new FinancialAccounts();
        address= new Address();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        checkPanel = new javax.swing.JPanel();
        licenseBtn = new javax.swing.JButton();
        accountsBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        creditBtn = new javax.swing.JButton();
        disPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        licenseBtn.setText("License");
        licenseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseBtnActionPerformed(evt);
            }
        });

        accountsBtn.setText("Accounts");
        accountsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Address");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        creditBtn.setText("CreditCard");
        creditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkPanelLayout = new javax.swing.GroupLayout(checkPanel);
        checkPanel.setLayout(checkPanelLayout);
        checkPanelLayout.setHorizontalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(licenseBtn)
                    .addComponent(creditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        checkPanelLayout.setVerticalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(licenseBtn)
                .addGap(34, 34, 34)
                .addComponent(accountsBtn)
                .addGap(29, 29, 29)
                .addComponent(addBtn)
                .addGap(29, 29, 29)
                .addComponent(creditBtn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(checkPanel);

        javax.swing.GroupLayout disPanelLayout = new javax.swing.GroupLayout(disPanel);
        disPanel.setLayout(disPanelLayout);
        disPanelLayout.setHorizontalGroup(
            disPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        disPanelLayout.setVerticalGroup(
            disPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(disPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void licenseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseBtnActionPerformed
        // TODO add your handling code here:
        licenseViewPanel licenseviewpanel=new licenseViewPanel(license);
        jSplitPane1.setRightComponent(licenseviewpanel);
    }//GEN-LAST:event_licenseBtnActionPerformed

    private void accountsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsBtnActionPerformed
        // TODO add your handling code here:
        financialAccountsViewPanel financialaccountsviewpanel=new financialAccountsViewPanel(financialaccounts);
        jSplitPane1.setRightComponent(financialaccountsviewpanel);
    }//GEN-LAST:event_accountsBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        addressViewPanel addressviewpanel=new addressViewPanel(address);
        jSplitPane1.setRightComponent(addressviewpanel);
    }//GEN-LAST:event_addBtnActionPerformed

    private void creditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditBtnActionPerformed
        // TODO add your handling code here:
        creditCardViewPanel creditcardviewpanel=new creditCardViewPanel(creditcard);
        jSplitPane1.setRightComponent(creditcardviewpanel);
    }//GEN-LAST:event_creditBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(checkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountsBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel checkPanel;
    private javax.swing.JButton creditBtn;
    private javax.swing.JPanel disPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton licenseBtn;
    // End of variables declaration//GEN-END:variables
}