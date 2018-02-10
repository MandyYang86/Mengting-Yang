/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MonitorSalesPerformance;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.Order;
import Business.OrderItem;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author mengtingyang
 */
public class ManageSearchJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Business business;

    /**
     * Creates new form ManageSearchJPanel
     */
    public ManageSearchJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        ArrayList<Integer> totalRevenue = new ArrayList<Integer>();


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalRevenue = new javax.swing.JTextField();
        btnSearchTotalRevenue = new javax.swing.JButton();
        btnSearchForPerson = new javax.swing.JButton();
        btnSearchForProduct = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Manage Search");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total Revenue:");

        txtTotalRevenue.setEnabled(false);
        txtTotalRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalRevenueActionPerformed(evt);
            }
        });

        btnSearchTotalRevenue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchTotalRevenue.setText("Search Total Revenue");
        btnSearchTotalRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTotalRevenueActionPerformed(evt);
            }
        });

        btnSearchForPerson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchForPerson.setText("Search For Person");
        btnSearchForPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForPersonActionPerformed(evt);
            }
        });

        btnSearchForProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchForProduct.setText("Search For Product");
        btnSearchForProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnSearchTotalRevenue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchForProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchForPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(btnSearchTotalRevenue)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSearchForPerson)
                .addGap(57, 57, 57)
                .addComponent(btnSearchForProduct)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalRevenueActionPerformed

    private void btnSearchForPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForPersonActionPerformed
        // TODO add your handling code here:
        SearchForPersonJPanel panel= new SearchForPersonJPanel(userProcessContainer,business);
        userProcessContainer.add("SearchForPersonJPanel",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSearchForPersonActionPerformed

    private void btnSearchForProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForProductActionPerformed
        // TODO add your handling code here:
        SearchForProductJPanel panel= new  SearchForProductJPanel(userProcessContainer,business);
        userProcessContainer.add(" SearchForProductJPanel",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSearchForProductActionPerformed

    private void btnSearchTotalRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTotalRevenueActionPerformed
        for(Market mk: business.getBusiness_MarketList().getMarketList()){
                 for(Customer customer: mk.getMarket_CustomerDirectory().getCustomerDirectory()){
                     for(Order order: business.getBusiness_MasterOrderCatalog().getMasterOrderCatalog()){
                         if(order.getOrder_customer().equals(customer)){
                             sumList.removeAll(sumList);
                            for(OrderItem oi: order.getOrderItemList()){
                                int a =(oi.getQuantity()*oi.getActualPrice());
                                sumList.add(a);
                                }
                                int totalPrice=0;
                                 for(int i=0;i<sumList.size();i++){
                                     totalPrice = sumList.get(i)+totalPrice;
                                    }
                                 
                                order.setTotalPrice(totalPrice);
                             
                             customer.getCustomer_SalesPerosn().setRevenue(order.getTotalPrice());
                         }
                     }
                }
    }   
        
     
        for(Order order:business.getBusiness_MasterOrderCatalog().getMasterOrderCatalog()){
            totalRevenue.add(order.getTotalPrice());
        }
          int totalRevenueNumber=0;
                                 for(int i=0;i<totalRevenue.size();i++){
                                     totalRevenueNumber = totalRevenue.get(i)+totalRevenueNumber;
                                    }
                                 txtTotalRevenue.setText(String.valueOf(totalRevenueNumber));
    }//GEN-LAST:event_btnSearchTotalRevenueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchForPerson;
    private javax.swing.JButton btnSearchForProduct;
    private javax.swing.JButton btnSearchTotalRevenue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
