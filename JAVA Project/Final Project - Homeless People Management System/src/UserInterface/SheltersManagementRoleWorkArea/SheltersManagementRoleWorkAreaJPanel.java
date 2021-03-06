/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SheltersManagementRoleWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SheltersManagement;
import Business.Shelters.Shelters;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdministrativeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mengtingyang
 */
public class SheltersManagementRoleWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private SheltersManagement sheltersManagement;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form SheltersManagementRoleWorkAreaJPanel
     */
    public SheltersManagementRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SheltersManagement sheltersManagement, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.account = account;
        this.business = business;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.sheltersManagement = sheltersManagement;
        populateTable();

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkQuest.getModel();

        model.setRowCount(0);

        for (WorkRequest request : sheltersManagement.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkQuest = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 227, 227));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889295.png"))); // NOI18N
        jLabel1.setText("Welcome   Agency   Management!");

        tblWorkQuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Recevier", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkQuest.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblWorkQuest);
        if (tblWorkQuest.getColumnModel().getColumnCount() > 0) {
            tblWorkQuest.getColumnModel().getColumn(0).setResizable(false);
            tblWorkQuest.getColumnModel().getColumn(1).setResizable(false);
            tblWorkQuest.getColumnModel().getColumn(2).setResizable(false);
            tblWorkQuest.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889297.png"))); // NOI18N
        btnSearch.setText("Search  Space  for  This  Work  Request");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889276.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnRefresh))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(29, 29, 29)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkQuest.getSelectedRow();
        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null,"Please select a row from table to view details ", "Warning" ,JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        WorkRequest request = (WorkRequest) tblWorkQuest.getValueAt(selectedRow, 0);
        String status=(String) tblWorkQuest.getValueAt(selectedRow, 3);
        
        if(status.endsWith("Completed")){
           JOptionPane.showMessageDialog(null,"You have completed this work request! ", "Warning" ,JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        request.setReceiver(account);
        request.setStatus("Processing");
        populateTable();

        SheltersManagementWorkRequestJPanel manageNetworkJPanel = new SheltersManagementWorkRequestJPanel(userProcessContainer, account, business, enterprise,
        sheltersManagement, (AdministrativeWorkRequest) request);
        userProcessContainer.add("SheltersManagementWorkRequestJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblWorkQuest;
    // End of variables declaration//GEN-END:variables
}
