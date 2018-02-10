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
import Business.UserAccount;
import UserInterface.LoginJPanel;
import UserInterface.admin.NewUserAccountJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author butte
 */
public class MngCustomerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    private SalesPerson salesPerson;

    /**
     * Creates new form MngCustomerJPanel
     */
    public MngCustomerJPanel(JPanel userProcessContainer, Business business, SalesPerson salesPerson) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.salesPerson = salesPerson;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
        dtm.setRowCount(0);
        for (Market market : business.getBusiness_MarketList().getMarketList()) {
            for (Customer customer : market.getMarket_CustomerDirectory().getCustomerDirectory()) {
                if (customer.getCustomer_SalesPerosn().equals(salesPerson)) {
                    Object[] row = new Object[3];
                    row[0] = customer;
                    row[1] = customer.getCustomerID();
                    row[2] = market;

                    dtm.addRow(row);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnServeCustomer = new javax.swing.JButton();
        btnReviewSalesHistory = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnCreateNewCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnReviewSalesHistory1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labLoss = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labProfit = new javax.swing.JLabel();
        labPenalty = new javax.swing.JLabel();
        labRewards = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labProLoss = new javax.swing.JLabel();
        labTotally = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Manage Customers");

        btnServeCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnServeCustomer.setText("Serve Customer >>");
        btnServeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeCustomerActionPerformed(evt);
            }
        });

        btnReviewSalesHistory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReviewSalesHistory.setText("Review Sales Order History >>");
        btnReviewSalesHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewSalesHistoryActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogout.setText("Logout ");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnCreateNewCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreateNewCustomer.setText("Create New Customer >>");
        btnCreateNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewCustomerActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerName", "Customer ID", "Market"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setResizable(false);
            tblCustomer.getColumnModel().getColumn(1).setResizable(false);
            tblCustomer.getColumnModel().getColumn(2).setResizable(false);
        }

        btnReviewSalesHistory1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReviewSalesHistory1.setText("Check Your Compensation");
        btnReviewSalesHistory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewSalesHistory1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Your Profit:");

        labLoss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labLoss.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Your Loss:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Your Rewards:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Your Penalty:");

        labProfit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labProfit.setText("0");

        labPenalty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labPenalty.setText("0");

        labRewards.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labRewards.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("As a result, you will get");

        labProLoss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labProLoss.setText("!");

        labTotally.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labTotally.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReviewSalesHistory1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnServeCustomer)
                    .addComponent(btnCreateNewCustomer)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnReviewSalesHistory)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labRewards, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labPenalty, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labTotally, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labProLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnServeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReviewSalesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReviewSalesHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(labRewards)
                    .addComponent(labProfit))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(labLoss)
                    .addComponent(labPenalty))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labProLoss)
                    .addComponent(labTotally))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnServeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select row from table first to go ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
            Market market = (Market) tblCustomer.getValueAt(selectedRow, 2);
            ServeCustomerJPanel panel = new ServeCustomerJPanel(userProcessContainer, business, salesPerson, customer, market);
            userProcessContainer.add(" ServeCustomerJPanel", panel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnServeCustomerActionPerformed

    private void btnReviewSalesHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewSalesHistoryActionPerformed
        // TODO add your handling code here:
        ReviewSalesOrderJPanel panel = new ReviewSalesOrderJPanel(userProcessContainer, business, salesPerson);
        userProcessContainer.add(" ReviewSalesOrderJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnReviewSalesHistoryActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginJPanel loginJPanel = (LoginJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        JOptionPane.showMessageDialog(null, "You have logged out. ", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCreateNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewCustomerActionPerformed
        // TODO add your handling code here:
        CreateNewCustomerJPanel panel = new CreateNewCustomerJPanel(userProcessContainer, business, salesPerson);
        userProcessContainer.add(" CreateNewCustomerJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);

    }//GEN-LAST:event_btnCreateNewCustomerActionPerformed

    private void btnReviewSalesHistory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewSalesHistory1ActionPerformed
        // TODO add your handling code here:
        int totalProfit = calculateProfit();
        int totalLoss = calculateLoss();
        labProfit.setText(String.valueOf(totalProfit));
        labLoss.setText(String.valueOf(totalLoss));

        labRewards.setText(String.valueOf(totalProfit * 0.1));
        labPenalty.setText(String.valueOf(totalLoss * 0.1));
        int compensation = (int) (totalProfit * 0.1 - totalLoss * 0.1);
        if (compensation > 0) {
            labTotally.setText(String.valueOf(java.lang.Math.abs(compensation)));
            labProLoss.setText("  Reward!");
        }
        if (compensation < 0) {
            labTotally.setText(String.valueOf(java.lang.Math.abs(compensation)));
            labProLoss.setText("  Penalty!");
        }
    }//GEN-LAST:event_btnReviewSalesHistory1ActionPerformed
    
    public int calculateProfit()
{
    int sum = 0;
    for(int i = 0; i < salesPerson.getProfitList().size(); i++)
    {
        sum = sum + salesPerson.getProfitList().get(i);
    }
    return sum;
}

public int calculateLoss()
{
    int sum = 0;
    for(int i = 0; i < salesPerson.getLossList().size(); i++)
    {
        sum = sum + salesPerson.getLossList().get(i);
    }
    return sum;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNewCustomer;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReviewSalesHistory;
    private javax.swing.JButton btnReviewSalesHistory1;
    private javax.swing.JButton btnServeCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labLoss;
    private javax.swing.JLabel labPenalty;
    private javax.swing.JLabel labProLoss;
    private javax.swing.JLabel labProfit;
    private javax.swing.JLabel labRewards;
    private javax.swing.JLabel labTotally;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables

}