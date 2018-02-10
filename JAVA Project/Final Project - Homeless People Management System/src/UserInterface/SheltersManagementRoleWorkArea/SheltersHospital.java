/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SheltersManagementRoleWorkArea;

import Business.Appointment.Appointment;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.NetWork;
import Business.Organization.SheltersManagement;
import Business.Shelters.Shelters;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdministrativeWorkRequest;
import Chat.Client;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mengtingyang
 */
public class SheltersHospital extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private SheltersManagement sheltersManagement;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form SheltersHospital
     */
    SheltersHospital(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise, SheltersManagement sheltersManagement, AdministrativeWorkRequest administrativeWorkRequest) {
        initComponents();
        this.account = account;
        this.business = business;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.sheltersManagement = sheltersManagement;

        populateHospitalTable();
        populateSheltersTable();
         populateCombobox();
    }
    
    public void populateCombobox() {
        comboShelter.removeAllItems();
          for (Shelters shelters : business.getSheltersDirectory().getSheltersList()) {
            comboShelter.addItem(shelters);
        }
    }

    public void populateHospitalTable() {
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();

        model.setRowCount(0);
        for (NetWork network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType().equals(Hospital)) {
                    Object[] row = new Object[1];
                    row[0] = enterprise;
                    model.addRow(row);
                }
            }
        }
    }

    public void populateSheltersTable() {
        DefaultTableModel model = (DefaultTableModel) tblShelters.getModel();

        model.setRowCount(0);
        for (Shelters shelters : business.getSheltersDirectory().getSheltersList()) {

            Object[] row = new Object[1];
            row[0] = shelters;

            model.addRow(row);

        }
    }
    
    public void  populateAppiontmentTable() {
        DefaultTableModel model = (DefaultTableModel) tblApp.getModel();

        model.setRowCount(0);
        for (Appointment app:business.getAppointmentDirectory().getAppointmentDirectory()) {

            Object[] row = new Object[7];
            row[0] = app.getHospitalName();
            row[1] = app.getShelterName();
            row[2] = app.getYear();
            row[3] = app.getMonth();
            row[4] = app.getDate();
            row[5] = app.getStatus();
            row[6] = app;

            model.addRow(row);

        }
    }
    

    public void openURL(String url) {
        try {
            browse(url);
        } catch (Exception e) {
        }
    }

    private void browse(String url) throws Exception {
        //获取操作系统的名字  
        String osName = System.getProperty("os.name", "");
        if (osName.startsWith("Mac OS")) {
            //苹果的打开方式  
            Class fileMgr = Class.forName("com.apple.eio.FileManager");
            Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[]{String.class});
            openURL.invoke(null, new Object[]{url});
        } else if (osName.startsWith("Windows")) {
            //windows的打开方式。  
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else {
            // Unix or Linux的打开方式  
            String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
            String browser = null;
            for (int count = 0; count < browsers.length && browser == null; count++) //执行代码，在brower有值后跳出，  
            //这里是如果进程创建成功了，==0是表示正常结束。  
            {
                if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0) {
                    browser = browsers[count];
                }
            }
            if (browser == null) {
                throw new Exception("Could not find web browser");
            } else //这个值在上面已经成功的得到了一个进程。  
            {
                Runtime.getRuntime().exec(new String[]{browser, url});
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

        btnCheckMap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblShelters = new javax.swing.JTable();
        proBar = new javax.swing.JProgressBar();
        lableNeedNumber = new javax.swing.JLabel();
        lableHosName = new javax.swing.JLabel();
        lableNeedNumber2 = new javax.swing.JLabel();
        lableNeedNumber3 = new javax.swing.JLabel();
        comYear = new javax.swing.JComboBox<>();
        lableNeedNumber4 = new javax.swing.JLabel();
        comMonth = new javax.swing.JComboBox<>();
        lableNeedNumber5 = new javax.swing.JLabel();
        comDay = new javax.swing.JComboBox<>();
        lableNeedNumber6 = new javax.swing.JLabel();
        comboShelter = new javax.swing.JComboBox();
        btnSend = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblApp = new javax.swing.JTable();
        btnMake = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        lableNeedNumber7 = new javax.swing.JLabel();
        txtNote = new javax.swing.JTextField();
        logoutJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 227, 227));

        btnCheckMap.setBackground(new java.awt.Color(255, 255, 255));
        btnCheckMap.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnCheckMap.setText("Check Map");
        btnCheckMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMapActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889295.png"))); // NOI18N
        jLabel1.setText("Welcome   Agency   Management!");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889304.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospital);
        if (tblHospital.getColumnModel().getColumnCount() > 0) {
            tblHospital.getColumnModel().getColumn(0).setResizable(false);
        }

        tblShelters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shelters Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblShelters);
        if (tblShelters.getColumnModel().getColumnCount() > 0) {
            tblShelters.getColumnModel().getColumn(0).setResizable(false);
        }

        lableNeedNumber.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber.setText("Choose A Hospital From Table to Go");

        lableHosName.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableHosName.setForeground(new java.awt.Color(0, 153, 255));
        lableHosName.setText("Hospital Name");

        lableNeedNumber2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber2.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber2.setText("Year:");

        lableNeedNumber3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber3.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber3.setText("Name:");

        comYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020" }));

        lableNeedNumber4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber4.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber4.setText("Shelters to Go:");

        comMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lableNeedNumber5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber5.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber5.setText("Month:");

        comDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        lableNeedNumber6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber6.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber6.setText("Day:");

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnSend.setText("Send ");
        btnSend.setEnabled(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(255, 255, 255));
        btnCheck.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnCheck.setText("Check if Date Avaliable");
        btnCheck.setEnabled(false);
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        tblApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital", "Shelters", "Year", "Month", "Date", "Staus", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblApp);
        if (tblApp.getColumnModel().getColumnCount() > 0) {
            tblApp.getColumnModel().getColumn(0).setResizable(false);
            tblApp.getColumnModel().getColumn(1).setResizable(false);
            tblApp.getColumnModel().getColumn(2).setResizable(false);
            tblApp.getColumnModel().getColumn(3).setResizable(false);
            tblApp.getColumnModel().getColumn(4).setResizable(false);
            tblApp.getColumnModel().getColumn(5).setResizable(false);
        }

        btnMake.setBackground(new java.awt.Color(255, 255, 255));
        btnMake.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnMake.setText("Make Appointment");
        btnMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889276.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnRefresh1.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889297.png"))); // NOI18N
        btnRefresh1.setText("Check Process");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        lableNeedNumber7.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lableNeedNumber7.setForeground(new java.awt.Color(0, 153, 255));
        lableNeedNumber7.setText("Appointment Note:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableNeedNumber)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMake, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lableNeedNumber4)
                                        .addComponent(lableNeedNumber5)
                                        .addComponent(lableNeedNumber6)
                                        .addComponent(lableNeedNumber2)
                                        .addComponent(lableNeedNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lableNeedNumber7))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lableHosName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboShelter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(logoutJButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnRefresh)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnRefresh1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(proBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(36, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(btnCheckMap, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack)))
                .addGap(2, 2, 2)
                .addComponent(btnCheckMap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnMake, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lableNeedNumber)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lableHosName)
                            .addComponent(lableNeedNumber3))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lableNeedNumber2)
                            .addComponent(comYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lableNeedNumber5)
                            .addComponent(comMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableNeedNumber6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lableNeedNumber4)
                            .addComponent(comboShelter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(proBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lableNeedNumber7)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh)
                            .addComponent(btnRefresh1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutJButton1)))
                .addGap(40, 52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMapActionPerformed
        // TODO add your handling code here:
        String url = "https://www.google.com/maps/@42.3437217,-71.0913747,15z";
        openURL(url);
    }//GEN-LAST:event_btnCheckMapActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SheltersManagementWorkRequestJPanel sysAdminwjp = (SheltersManagementWorkRequestJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String year = (String) comYear.getSelectedItem();
        String date = (String) comDay.getSelectedItem();
        String month = (String) comMonth.getSelectedItem();
        String note=(String)txtNote.getText();

        int selectedRow = tblHospital.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table to go ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Enterprise enterprise=(Enterprise) tblHospital.getValueAt(selectedRow, 0);
        String hosName=(String) enterprise.getName();
      
        Shelters shelter=(Shelters) comboShelter.getSelectedItem();
        String shelters=shelter.getSheltersName();
        
        Appointment appointment=business.getAppointmentDirectory().addAppointment();
        appointment.setDate(date);
        appointment.setMonth(month);
        appointment.setStatus("Send");
        appointment.setYear(year);
        appointment.setHospitalName(hosName);
        appointment.setShelterName(shelters);
       appointment.setAppointmentNote(note);
        
        JOptionPane.showMessageDialog(null, "Send Successfully! ", "Warning", JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        boolean check = false;

        String year = (String) comYear.getSelectedItem();
        String date = (String) comDay.getSelectedItem();
        String month = (String) comMonth.getSelectedItem();

        for (Appointment appointment : business.getAppointmentDirectory().getAppointmentDirectory()) {
            if (appointment.getYear().equals(year) && appointment.getMonth().equals(month) && appointment.getDate().equalsIgnoreCase(date)) {
                check = true;
                break;
            }
        }
        
        if(check==true){
         JOptionPane.showMessageDialog(null, "This date has already been scheduled ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(check==false){
         JOptionPane.showMessageDialog(null, "You can chooose this day! ", "Warning", JOptionPane.WARNING_MESSAGE);
         btnSend.setEnabled(true);
        }
        


    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHospital.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table to go ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        btnCheck.setEnabled(true);
        Enterprise enterprise = (Enterprise) tblHospital.getValueAt(selectedRow, 0);
        lableHosName.setText(enterprise.getName());
       // btnSend.setEnabled(true);
    }//GEN-LAST:event_btnMakeActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateAppiontmentTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblApp.getSelectedRow();
          String status=(String) tblApp.getValueAt(selectedRow, 5);
        if(status.equals("Send")){
        proBar.setValue(50);
        }
      
          if(status.equals("Complete")){
        proBar.setValue(100);
        }
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void logoutJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButton1ActionPerformed
        // TODO add your handling code here:
        new Client();
    }//GEN-LAST:event_logoutJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCheckMap;
    private javax.swing.JButton btnMake;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> comDay;
    private javax.swing.JComboBox<String> comMonth;
    private javax.swing.JComboBox<String> comYear;
    private javax.swing.JComboBox comboShelter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lableHosName;
    private javax.swing.JLabel lableNeedNumber;
    private javax.swing.JLabel lableNeedNumber2;
    private javax.swing.JLabel lableNeedNumber3;
    private javax.swing.JLabel lableNeedNumber4;
    private javax.swing.JLabel lableNeedNumber5;
    private javax.swing.JLabel lableNeedNumber6;
    private javax.swing.JLabel lableNeedNumber7;
    private javax.swing.JButton logoutJButton1;
    private javax.swing.JProgressBar proBar;
    private javax.swing.JTable tblApp;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTable tblShelters;
    private javax.swing.JTextField txtNote;
    // End of variables declaration//GEN-END:variables
}
