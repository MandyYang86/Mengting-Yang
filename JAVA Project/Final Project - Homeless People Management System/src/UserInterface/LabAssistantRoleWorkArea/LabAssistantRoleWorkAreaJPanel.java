/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRoleWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.Homeless;
import Business.Organization.Lab;
import static Business.Organization.Organization.OrganizationType.PhysicalExamination;
import Business.Organization.PhysicalExamination;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestPEToLab;
import Chat.Client;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mengtingyang
 */
public class LabAssistantRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantRoleWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Lab lab;
    private Enterprise enterprise;
    //WorkRequestPEToLab request;
    //PhysicalExamination physicalExamination;
    
    public LabAssistantRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Lab lab, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.lab = lab;
        this.enterprise = enterprise;
        //this.physicalExamination = physicalExamination;
        populateTable();
    }

    public void populateTable(){
//        request = (WorkRequestPEToLab)request;
        DefaultTableModel model = (DefaultTableModel)tblLabAssistant.getModel();
        model.setRowCount(0);
        for(WorkRequest workrequest : lab.getWorkQueue().getWorkRequestList()){
            if (workrequest instanceof Business.WorkQueue.WorkRequestPEToLab) {
                WorkRequestPEToLab request = (WorkRequestPEToLab) workrequest;
                Object[] row = new Object[6];
                row[0] = request.getHomeless();
                row[1] = request.getHomeless().getID();
                row[2] = request;
                row[3] = request.getSender();
                row[4] = request.getReceiver();
                row[5] = request.getStatus();
                model.addRow(row);
            }
            
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLabAssistant = new javax.swing.JTable();
        btnProcessRequest = new javax.swing.JButton();
        logoutJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 227, 227));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889295.png"))); // NOI18N
        jLabel2.setText("Lab Assistant Work Area");

        tblLabAssistant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Message", "Sender", "Receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblLabAssistant);

        btnProcessRequest.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnProcessRequest.setText("Process");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        logoutJButton1.setBackground(new java.awt.Color(255, 255, 255));
        logoutJButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        logoutJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889298.png"))); // NOI18N
        logoutJButton1.setText("Chat");
        logoutJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(logoutJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(btnProcessRequest))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutJButton1))
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabAssistant.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row first!");
            return; 
        }
        
        WorkRequestPEToLab request = (WorkRequestPEToLab) tblLabAssistant.getValueAt(selectedRow, 2);
        request.setReceiver(userAccount);
        request.setStatus("ExaminationCompleted");
        populateTable();
   
        Homeless homeless =  (Homeless) tblLabAssistant.getValueAt(selectedRow, 0);
        ProcessWorkRequestJPanel panel = new ProcessWorkRequestJPanel(userProcessContainer, business, homeless, enterprise, userAccount, request);
        userProcessContainer.add("ProcessWorkRequestJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void logoutJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButton1ActionPerformed
        // TODO add your handling code here:
        new Client();
    }//GEN-LAST:event_logoutJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutJButton1;
    private javax.swing.JTable tblLabAssistant;
    // End of variables declaration//GEN-END:variables
}
