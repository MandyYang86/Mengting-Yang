/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import User.Person;
import User.License;
import User.FinancialAccounts;
import User.CreditCard;
import User.Address;



/**
 *
 * @author mengtingyang
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    
    public Person person;
    public CreditCard creditcard;
    public License license;
    public FinancialAccounts financialaccounts;
    public Address address;
    
    public mainJFrame() {
        initComponents();
        person=new Person();
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
        displayPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        personCeateBtn = new javax.swing.JButton();
        personViewBtn = new javax.swing.JButton();
        licenseCeateBtn = new javax.swing.JButton();
        accountsCeateBtn = new javax.swing.JButton();
        cardCeateBtn = new javax.swing.JButton();
        addressCeateBtn = new javax.swing.JButton();
        licenseViewBtn = new javax.swing.JButton();
        accountsViewBtn = new javax.swing.JButton();
        cardViewBtn = new javax.swing.JButton();
        addressViewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(displayPanel);

        personCeateBtn.setText("Person Create");
        personCeateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCeateBtnActionPerformed(evt);
            }
        });

        personViewBtn.setText(" Person View");
        personViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personViewBtnActionPerformed(evt);
            }
        });

        licenseCeateBtn.setText("License Create");
        licenseCeateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseCeateBtnActionPerformed(evt);
            }
        });

        accountsCeateBtn.setText("Accounts Create");
        accountsCeateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsCeateBtnActionPerformed(evt);
            }
        });

        cardCeateBtn.setText("Card Create");
        cardCeateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardCeateBtnActionPerformed(evt);
            }
        });

        addressCeateBtn.setText("Address Create");
        addressCeateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressCeateBtnActionPerformed(evt);
            }
        });

        licenseViewBtn.setText("License View");
        licenseViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseViewBtnActionPerformed(evt);
            }
        });

        accountsViewBtn.setText("Accounts View");
        accountsViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsViewBtnActionPerformed(evt);
            }
        });

        cardViewBtn.setText("Card View");
        cardViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardViewBtnActionPerformed(evt);
            }
        });

        addressViewBtn.setText("Address View");
        addressViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(personCeateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(licenseCeateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accountsCeateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressCeateBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personViewBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licenseViewBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountsViewBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardViewBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressViewBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardCeateBtn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(personCeateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licenseCeateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountsCeateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardCeateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressCeateBtn)
                .addGap(30, 30, 30)
                .addComponent(personViewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licenseViewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountsViewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardViewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressViewBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);
        jSplitPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personCeateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCeateBtnActionPerformed
        // TODO add your handling code here:
        personCreatePanel personcreatepanel=new personCreatePanel(person);
        jSplitPane1.setRightComponent(personcreatepanel);
   
    }//GEN-LAST:event_personCeateBtnActionPerformed

    private void licenseCeateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseCeateBtnActionPerformed
        // TODO add your handling code here:
        licenseCreatePanel licensecreatepanel=new licenseCreatePanel(license);
        jSplitPane1.setRightComponent(licensecreatepanel);
    }//GEN-LAST:event_licenseCeateBtnActionPerformed

    private void accountsCeateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsCeateBtnActionPerformed
        // TODO add your handling code here:
        financialAccountsCreatePanel financialaccountscreatepanel=new financialAccountsCreatePanel(financialaccounts);
         jSplitPane1.setRightComponent(financialaccountscreatepanel);
    }//GEN-LAST:event_accountsCeateBtnActionPerformed

    private void cardCeateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardCeateBtnActionPerformed
        // TODO add your handling code here:
        creditCardCreatePanel creditcardcreatepanel=new creditCardCreatePanel(creditcard);
        jSplitPane1.setRightComponent(creditcardcreatepanel);
    }//GEN-LAST:event_cardCeateBtnActionPerformed

    private void addressCeateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressCeateBtnActionPerformed
        // TODO add your handling code here:
        addressCreatePanel addresscreatepanel=new addressCreatePanel(address);
        jSplitPane1.setRightComponent(addresscreatepanel);
    }//GEN-LAST:event_addressCeateBtnActionPerformed

    
    
    
    
    
    private void personViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personViewBtnActionPerformed
        // TODO add your handling code here:
        personViewPanel personviewpanel=new personViewPanel(person);
        jSplitPane1.setRightComponent(personviewpanel);
        
    }//GEN-LAST:event_personViewBtnActionPerformed

    private void licenseViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseViewBtnActionPerformed
        // TODO add your handling code here:
        licenseViewPanel licenseviewpanel=new licenseViewPanel(license);
        jSplitPane1.setRightComponent(licenseviewpanel);
    }//GEN-LAST:event_licenseViewBtnActionPerformed

    private void accountsViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsViewBtnActionPerformed
        // TODO add your handling code here:
        financialAccountsViewPanel financialaccountsviewpanel=new financialAccountsViewPanel(financialaccounts);
        jSplitPane1.setRightComponent(financialaccountsviewpanel);
        
    }//GEN-LAST:event_accountsViewBtnActionPerformed

    private void cardViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardViewBtnActionPerformed
        // TODO add your handling code here:
        creditCardViewPanel creditcardviewpanel=new creditCardViewPanel(creditcard);
        jSplitPane1.setRightComponent(creditcardviewpanel);
    }//GEN-LAST:event_cardViewBtnActionPerformed

    private void addressViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressViewBtnActionPerformed
        // TODO add your handling code here:
        addressViewPanel addressviewpanel=new addressViewPanel(address);
        jSplitPane1.setRightComponent(addressviewpanel);
    }//GEN-LAST:event_addressViewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountsCeateBtn;
    private javax.swing.JButton accountsViewBtn;
    private javax.swing.JButton addressCeateBtn;
    private javax.swing.JButton addressViewBtn;
    private javax.swing.JButton cardCeateBtn;
    private javax.swing.JButton cardViewBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton licenseCeateBtn;
    private javax.swing.JButton licenseViewBtn;
    private javax.swing.JButton personCeateBtn;
    private javax.swing.JButton personViewBtn;
    // End of variables declaration//GEN-END:variables
}
