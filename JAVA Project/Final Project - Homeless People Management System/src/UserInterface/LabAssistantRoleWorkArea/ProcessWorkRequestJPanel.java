/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRoleWorkArea;

import Business.Disease.Disease;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Examination.ExaminationResult;
import Business.Homeless.Homeless;
import Business.Organization.Doctor;
import Business.Organization.Organization;
import static Business.Organization.Organization.OrganizationType.Doctor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestPEToLab;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author butte
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private Homeless homeless;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private WorkRequestPEToLab workRequest;
    
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, EcoSystem business, Homeless homeless, Enterprise enterprise, UserAccount userAccount, WorkRequestPEToLab request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.homeless = homeless;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.workRequest = request;
        populateComboDisease();
    }

    public void populateComboDisease(){
        comboDisease.removeAllItems();
        for (Disease disease: business.getDiseaseDirectory().getDiseaseDirectory()) {
            comboDisease.addItem(disease);
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

        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRemark = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboDisease = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setText("Blood Pressure:");

        setBackground(new java.awt.Color(255, 227, 227));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889295.png"))); // NOI18N
        jLabel2.setText("Process Physical Examination");

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Height:");

        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHeightKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Weight:");

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("Blood Pressure:");

        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBPKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setText("Remark:");

        txtRemark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarkKeyTyped(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889293.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setText("Disease:");

        comboDisease.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889304.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRemark, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(comboDisease, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            //write here

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter Something!");
        }
        
        int height = Integer.parseInt(txtHeight.getText());
        int weight = Integer.parseInt(txtWeight.getText());
        int bloodPressure = Integer.parseInt(txtBP.getText());
        Disease disease = (Disease) comboDisease.getSelectedItem();
        String remark = txtRemark.getText();
        
        ExaminationResult test = new ExaminationResult();
        test.setHeight(height);
        test.setWeight(weight);
        test.setBloodPressure(bloodPressure);
        test.setDisease(disease);
        test.setRemark(remark);
        homeless.setExaminationResult(test);
        workRequest.setHomeless(homeless);

        
//        homeless.getExaminationResult().setHeight(height);
//        homeless.getExaminationResult().setWeight(weight);
//        homeless.getExaminationResult().setBloodPressure(bloodPressure);
//        homeless.getExaminationResult().setDisease(disease);
//        homeless.getExaminationResult().setRemark(remark);
        
//        examinationResult.setHeight(height);
//        examinationResult.setWeight(weight);
//        examinationResult.setBloodPressure(bloodPressure);
//        examinationResult.setDisease(disease);
//        examinationResult.setRemark(remark);
//        business.getResultDirectory().getResultList().add(examinationResult);

    Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof Doctor){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(workRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(workRequest);
        }
        
        JOptionPane.showMessageDialog(null, "Result submitted successfully!");
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtHeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtHeightKeyTyped

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtWeightKeyTyped

    private void txtBPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtBPKeyTyped

    private void txtRemarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarkKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
         if(!(Character.isLetter(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a text correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtRemarkKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox comboDisease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
