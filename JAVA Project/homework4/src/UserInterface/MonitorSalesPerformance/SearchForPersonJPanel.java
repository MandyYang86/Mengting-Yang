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
import Business.Product;
import UserInterface.admin.MngUserAccountJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JPanel;
import Business.SalesPerson;
import Business.SortComparator;
import Business.Supplier;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mengtingyang
 */
public class SearchForPersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;

    ArrayList<SalesPerson> goodPerformers;
    ArrayList<SalesPerson> badPerformers;

    /**
     * Creates new form SearchForPersonJPanel
     */

    SearchForPersonJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;

        goodPerformers = new ArrayList<SalesPerson>();
        badPerformers = new ArrayList<SalesPerson>();
        ArrayList<SalesPerson> directory = business.getBusiness_SalesPersonDirectory().getSalesPersonDirectory();
        for (SalesPerson sp : directory) {
            if (sp.getNetSales() > 0 && sp.isGoodPerformer()) {
                goodPerformers.add(sp);
            } else if (sp.getNetSales() > 0 && !sp.isGoodPerformer()) {
                badPerformers.add(sp);
            }
        }

        comboMarket.removeAllItems();
        for (Market market : business.getBusiness_MarketList().getMarketList()) {
            comboMarket.addItem(market);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchForPerson = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSearchTOP10 = new javax.swing.JButton();
        comboMarket = new javax.swing.JComboBox();
        btnSearchSalesPersonAbove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSearchSalesPersonBelow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Search For Person");

        tblSearchForPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User Name", "Total Revenue"
            }
        ));
        jScrollPane1.setViewportView(tblSearchForPerson);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("TOP 10 Sales Person by Revenue ");

        btnSearchTOP10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchTOP10.setText("Search By Market");
        btnSearchTOP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTOP10ActionPerformed(evt);
            }
        });

        comboMarket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboMarket.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Higher Education Market", "Financial Services Market" }));

        btnSearchSalesPersonAbove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchSalesPersonAbove.setText("Search Sales Persons");
        btnSearchSalesPersonAbove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSalesPersonAboveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Sales Person with ABOVE target sales");

        btnSearchSalesPersonBelow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchSalesPersonBelow.setText("Search Sales Persons");
        btnSearchSalesPersonBelow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSalesPersonBelowActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sales Person with BELOW target sales");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSearchSalesPersonAbove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchSalesPersonBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchTOP10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comboMarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnBack)
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchTOP10)
                            .addComponent(comboMarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSearchSalesPersonAbove))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnSearchSalesPersonBelow))
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchTOP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTOP10ActionPerformed
        // TODO add your handling code here:
        Market marketSelected = (Market) comboMarket.getSelectedItem();
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        ArrayList<Integer> revenueList = new ArrayList<Integer>();
        ArrayList<Integer> targetList = new ArrayList<Integer>();
        ArrayList<Integer> targetRevenueList = new ArrayList<Integer>();
//        for(Order order: business.getBusiness_MasterOrderCatalog().getMasterOrderCatalog()){
//            for(OrderItem oi: order.getOrderItemList()){
//                int a = (int) (oi.getQuantity()*oi.getActualPrice());
//                //ArrayList<Integer> sumList = new ArrayList<Integer>();
//                sumList.add(a);
//                //sum+=sum;
//                //order.setTotalPrice(sum);
//            }
//             int totalPrice=0;
//             for(int i=0;i<sumList.size();i++){
//                    totalPrice = sumList.get(i)+totalPrice;
//                }
//            order.setTotalPrice(totalPrice);
//        }
        for (Market mk : business.getBusiness_MarketList().getMarketList()) {
            //if(marketSelected.equals(mk.getMarketName())){
            if (mk.equals(marketSelected)) {
                for (Customer customer : mk.getMarket_CustomerDirectory().getCustomerDirectory()) {
                    for (Order order : business.getBusiness_MasterOrderCatalog().getMasterOrderCatalog()) {
                        if (order.getOrder_customer().equals(customer)) {
                            sumList.removeAll(sumList);
                            targetList.removeAll(targetList);
                            for (OrderItem oi : order.getOrderItemList()) {
                                int a = (oi.getQuantity() * oi.getActualPrice());
                                int b = (oi.getQuantity() * oi.getOrderItem_Product().getProduct_MarketOffer().getTargrtPrice());
                                sumList.add(a);
                                targetList.add(b);
                            }
                            int totalPrice = 0;
                            for (int i = 0; i < sumList.size(); i++) {
                                totalPrice = sumList.get(i) + totalPrice;
                            }
                            int targetPrice = 0;
                            for (int i = 0; i < targetList.size(); i++) {
                                targetPrice = targetList.get(i) + targetPrice;
                            }

                            order.setTargetPrice(targetPrice);
                            order.setTotalPrice(totalPrice);
                            customer.getCustomer_SalesPerosn().setTargetRevenue(targetPrice);
                            targetRevenueList.add(customer.getCustomer_SalesPerosn().getTargetRevenue());
                            customer.getCustomer_SalesPerosn().setRevenue(order.getTotalPrice());//这句已经把这个salesperson的所有销售额赋给他了
                            revenueList.add(customer.getCustomer_SalesPerosn().getRevenue());
                        }
                    }

                }
//                 for(int i=0;i<revenueList.size();i++){
//                     System.out.println(revenueList.get(i));
//                 }
//                    Collections.sort(revenueList);
//                    System.out.println(Arrays.toString(revenueList.toArray()));
                int[] intArray = new int[revenueList.size()];
                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = revenueList.get(i);
                }
                //Arrays.sort(intArray);
                //System.out.println(intArray[0]);
                //因为要在这里就输出并且populateTable（）所以在这里排序arraylist
                populateTable();
            }

        }
    }//GEN-LAST:event_btnSearchTOP10ActionPerformed

    private void btnSearchSalesPersonAboveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSalesPersonAboveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblSearchForPerson.getModel();
        dtm.setRowCount(0);
        for (SalesPerson sp : goodPerformers) {
            Object[] row = new Object[4];
            row[0] = sp;
            row[1] = sp.getPersonID();
            row[2] = sp.getSalesPersonUserName();
            row[3] = sp.getNetSales();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnSearchSalesPersonAboveActionPerformed

    private void btnSearchSalesPersonBelowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSalesPersonBelowActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblSearchForPerson.getModel();
        dtm.setRowCount(0);
        for (SalesPerson sp : badPerformers) {
            Object[] row = new Object[4];
            row[0] = sp;
            row[1] = sp.getPersonID();
            row[2] = sp.getSalesPersonUserName();
            row[3] = sp.getNetSales();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnSearchSalesPersonBelowActionPerformed

    public void populateTable() {
        business.getBusiness_SalesPersonDirectory().sortRevenue();
        DefaultTableModel dtm = (DefaultTableModel) tblSearchForPerson.getModel();
        dtm.setRowCount(0);
        for (SalesPerson salesPerson : business.getBusiness_SalesPersonDirectory().getSalesPersonDirectory()) {
            Object[] row = new Object[3];
            row[0] = salesPerson;
            row[1] = salesPerson.getSalesPersonUserName();
            row[2] = salesPerson.getRevenue();
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchSalesPersonAbove;
    private javax.swing.JButton btnSearchSalesPersonBelow;
    private javax.swing.JButton btnSearchTOP10;
    private javax.swing.JComboBox comboMarket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearchForPerson;
    // End of variables declaration//GEN-END:variables
}