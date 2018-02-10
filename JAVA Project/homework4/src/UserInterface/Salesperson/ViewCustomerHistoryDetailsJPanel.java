/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Salesperson;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.Order;
import Business.OrderItem;
import Business.SalesPerson;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mengtingyang
 */
public class ViewCustomerHistoryDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerHistoryDetailsJPanel
     */
    private JPanel userProcessContainer;
    private  Business business;
    private SalesPerson salesPerson;
    private  Customer customer;
 
    private Order order;

    ViewCustomerHistoryDetailsJPanel(JPanel userProcessContainer, Business business, SalesPerson salesPerson, Customer customer, Order order) {
         initComponents();
                this.business=business;
                this.customer=customer;
                this.salesPerson=salesPerson;
                this.userProcessContainer=userProcessContainer;
                this.order=order;
                
                populateTable();
    }
    
    public void  populateTable(){
                DefaultTableModel dtm=(DefaultTableModel)tblCustomerHistoryDetails.getModel(); 
                dtm.setRowCount(0);
                for(OrderItem orderItem:order.getOrderItemList()){
               Object[] row=new Object[5];
                row[0]=order;
                row[1]=orderItem;
                row[2]=orderItem.getActualPrice();
                row[3]=orderItem.getQuantity();
                row[4]=orderItem.getQuantity()*orderItem.getActualPrice();
                dtm.addRow(row);
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

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerHistoryDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("View Customer History Oreder Details");

        tblCustomerHistoryDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Item", "Price", "Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerHistoryDetails);
        if (tblCustomerHistoryDetails.getColumnModel().getColumnCount() > 0) {
            tblCustomerHistoryDetails.getColumnModel().getColumn(0).setResizable(false);
            tblCustomerHistoryDetails.getColumnModel().getColumn(1).setResizable(false);
            tblCustomerHistoryDetails.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setText("<< BACK");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewCustomerHistoryJPanel JPanel = ( ViewCustomerHistoryJPanel) component;
       JPanel. populateTable();
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomerHistoryDetails;
    // End of variables declaration//GEN-END:variables
}
