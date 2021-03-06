/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Salesperson;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.SalesPerson;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author butte
 */
public class ServeCustomerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private  Business business;
    private SalesPerson salesPerson;
    private  Customer customer;
    private Market market;

    /**
     * Creates new form ServeCustomerJPanel
     */
    

    ServeCustomerJPanel(JPanel userProcessContainer, Business business, SalesPerson salesPerson, Customer customer, Market market) {
       initComponents();
       this.business=business;
       this.customer=customer;
       this.market=market;
       this.salesPerson=salesPerson;
       this.userProcessContainer=userProcessContainer;
       
       txtSPName.setText(salesPerson.getSalesPersonUserName());
       txtAddress.setText(customer.getCustomerAddress());
       txtContact.setText(customer.getContact());
       txtCustomerName.setText(customer.getCustomerName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtSPName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnBookOrder = new javax.swing.JButton();
        btnBrowse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewCustomerHistory = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Salesperson:");

        txtSPName.setEditable(false);
        txtSPName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtSPName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSPName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        txtSPName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Serve Customer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Customer Name:");

        txtCustomerName.setEditable(false);
        txtCustomerName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtCustomerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCustomerName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        txtCustomerName.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Customer Contact:");

        txtContact.setEditable(false);
        txtContact.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        txtContact.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Customer Address:");

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        txtAddress.setEnabled(false);

        btnBookOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookOrder.setText("Book Customer Order >>");
        btnBookOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookOrderActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBrowse.setText("Browse Product Catalog >>");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewCustomerHistory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewCustomerHistory.setText("View Customer History >>");
        btnViewCustomerHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnViewCustomerHistory)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSPName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel3)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContact, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(txtAddress)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btnBrowse))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addGap(604, 604, 604))
                                .addComponent(btnBookOrder)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSPName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnViewCustomerHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookOrderActionPerformed
        // TODO add your handling code here:
            BookOrderJPanel panel=new  BookOrderJPanel (userProcessContainer,business,salesPerson,customer,market);
            userProcessContainer.add(" BookOrderJPanel ", panel);
            CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnBookOrderActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
           BrowseProductCatalogJPanel panel=new   BrowseProductCatalogJPanel(userProcessContainer,business,salesPerson,customer,market);
            userProcessContainer.add("  BrowseProductCatalogJPanel", panel);
            CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewCustomerHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerHistoryActionPerformed
        // TODO add your handling code here:
           ViewCustomerHistoryJPanel panel=new  ViewCustomerHistoryJPanel(userProcessContainer,business,salesPerson,customer,market);
            userProcessContainer.add(" ViewCustomerHistoryJPanel", panel);
            CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewCustomerHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookOrder;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnViewCustomerHistory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtSPName;
    // End of variables declaration//GEN-END:variables
}
