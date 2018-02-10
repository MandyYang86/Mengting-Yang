/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.WorkQueue.WorkRequestPEToLab;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mengtingyang
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        comboOrganization.removeAllItems();

        if (enterprise.getEnterpriseType().getValue().equals("Hospital")) {
            for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                if (!type.getValue().equals(Organization.OrganizationType.Administrative.getValue())) {
                    if (!type.getValue().equals(Organization.OrganizationType.DataAnalytics.getValue())) {
                        if (!type.getValue().equals(Organization.OrganizationType.HomelessPeopleRegistration.getValue())) {
                            if (!type.getValue().equals(Organization.OrganizationType.Inventory.getValue())) {
                                if (!type.getValue().equals(Organization.OrganizationType.SheltersManagement.getValue())) {
                                    if (!type.getValue().equals(Organization.OrganizationType.SheltersRegistration.getValue())) {
                                        comboOrganization.addItem(type);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (enterprise.getEnterpriseType().getValue().equals("Government")) {
            for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                if (!type.getValue().equals(Organization.OrganizationType.Doctor.getValue())) {
                    if (!type.getValue().equals(Organization.OrganizationType.Inventory.getValue())) {
                        if (!type.getValue().equals(Organization.OrganizationType.Lab.getValue())) {
                            if (!type.getValue().equals(Organization.OrganizationType.PhysicalExamination.getValue())) {
                                if (!type.getValue().equals(Organization.OrganizationType.SheltersManagement.getValue())) {
                                    if (!type.getValue().equals(Organization.OrganizationType.SheltersRegistration.getValue())) {
                                        if (!type.getValue().equals(Organization.OrganizationType.Nurse.getValue())) {
                                            comboOrganization.addItem(type);

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (enterprise.getEnterpriseType().getValue().equals("Agency")) {
            for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                if (!type.getValue().equals(Organization.OrganizationType.Doctor.getValue())) {
                    if (!type.getValue().equals(Organization.OrganizationType.Inventory.getValue())) {
                        if (!type.getValue().equals(Organization.OrganizationType.Lab.getValue())) {
                            if (!type.getValue().equals(Organization.OrganizationType.PhysicalExamination.getValue())) {
                                if (!type.getValue().equals(Organization.OrganizationType.Administrative.getValue())) {
                                    if (!type.getValue().equals(Organization.OrganizationType.DataAnalytics.getValue())) {
                                        if (!type.getValue().equals(Organization.OrganizationType.Nurse.getValue())) {
                                            if (!type.getValue().equals(Organization.OrganizationType.HomelessPeopleRegistration.getValue())) {
                                                comboOrganization.addItem(type);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (enterprise.getEnterpriseType().getValue().equals("Supplier")) {
            for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                if (!type.getValue().equals(Organization.OrganizationType.Doctor.getValue())) {
                    if (!type.getValue().equals(Organization.OrganizationType.SheltersManagement.getValue())) {
                        if (!type.getValue().equals(Organization.OrganizationType.Lab.getValue())) {
                            if (!type.getValue().equals(Organization.OrganizationType.PhysicalExamination.getValue())) {
                                if (!type.getValue().equals(Organization.OrganizationType.SheltersRegistration.getValue())) {
                                    if (!type.getValue().equals(Organization.OrganizationType.Administrative.getValue())) {
                                        if (!type.getValue().equals(Organization.OrganizationType.DataAnalytics.getValue())) {
                                            if (!type.getValue().equals(Organization.OrganizationType.Nurse.getValue())) {
                                                if (!type.getValue().equals(Organization.OrganizationType.HomelessPeopleRegistration.getValue())) {
                                                    comboOrganization.addItem(type);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

//           if (enterprise.getEnterpriseType().getValue().equals("Supplier")) {
//             for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
//                 if (type.getValue().equals(Organization.OrganizationType.Inventory)) {
//                     comboOrganization.addItem(type);
//                 }
//                 if (type.getValue().equals(Organization.OrganizationType.Sale)) {
//                     comboOrganization.addItem(type);
//                 }
//             }
//         }
//     }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[1];
            row[0] = organization;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        comboOrganization = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 227, 227));

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
        }

        comboOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889293.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889295.png"))); // NOI18N
        jLabel3.setText("Organization    List");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Organization    Name");

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889335.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnAdd)
                        .addGap(152, 152, 152)
                        .addComponent(btnDelete)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(comboOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Organization.OrganizationType type = (Organization.OrganizationType) comboOrganization.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganization.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select row from table first to go ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Organization organization = (Organization) tblOrganization.getValueAt(selectedRow, 0);
            enterprise.getOrganizationDirectory().getOrganizationList().remove(organization);

            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EnterpriseAdminWorkAreaJPanel sysAdminwjp = (EnterpriseAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboOrganization;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
