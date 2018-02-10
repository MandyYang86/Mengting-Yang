/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.AirPlane;
import Business.AirPlaneHistory;
import com.sun.glass.events.KeyEvent;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.accessibility.AccessibleContext;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author mengtingyang
 */
 public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
     
    private AirPlaneHistory aph;
    public CreatePanel(AirPlaneHistory aph) {
        initComponents();
        this.aph=aph;
         
        //To change body of generated methods, choose Tools | Templates.
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        txtTimeTakeOff = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumberSeats = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUpdateTime = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        manuComboBox = new javax.swing.JComboBox<>();
        manuYearComboBox = new javax.swing.JComboBox<>();
        expComboBox = new javax.swing.JComboBox<>();
        avaComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtAirPort = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Create Air Plane Information");

        jLabel2.setText("Serial Number:");

        jLabel3.setText("Time to Take Off (Hour) :");

        jLabel4.setText("Whether Available:");

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });
        txtSerialNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialNumberKeyTyped(evt);
            }
        });

        txtTimeTakeOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimeTakeOffMouseClicked(evt);
            }
        });
        txtTimeTakeOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeTakeOffActionPerformed(evt);
            }
        });
        txtTimeTakeOff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimeTakeOffKeyTyped(evt);
            }
        });

        jLabel5.setText("Manufacture Year:");

        jLabel6.setText("Manufacturers:");

        jLabel7.setText("Number of Seats:");

        txtNumberSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberSeatsKeyTyped(evt);
            }
        });

        jLabel8.setText("Whether Expire Maintain Certificate:");

        jLabel9.setText("Catalog Update Time:");

        txtUpdateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateTimeActionPerformed(evt);
            }
        });
        txtUpdateTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateTimeKeyTyped(evt);
            }
        });

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel10.setText("Model Number:");

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });
        txtModelNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModelNumberKeyTyped(evt);
            }
        });

        manuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Airbus", "Boeing", "Lockheed Martin", "United Technologies", "GE Aviation", "Raytheon\t" }));
        manuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuComboBoxActionPerformed(evt);
            }
        });

        manuYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        manuYearComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                manuYearComboBoxComponentAdded(evt);
            }
        });
        manuYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuYearComboBoxActionPerformed(evt);
            }
        });

        expComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        expComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expComboBoxActionPerformed(evt);
            }
        });

        avaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        avaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setText("Air Port");

        txtAirPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAirPortKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimeTakeOff, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumberSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(manuComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(manuYearComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE))
                    .addComponent(expComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAirPort, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUpdateTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimeTakeOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(avaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(manuYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10))
                    .addComponent(manuComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumberSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(expComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtAirPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

       
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String serialNumber=txtSerialNumber.getText();
        String modelNumber=txtModelNumber.getText();
        double timeToTakeOff=Double.parseDouble(txtTimeTakeOff.getText());
        int numberofSeats=Integer.parseInt(txtNumberSeats.getText());
        double updateTime=Double.parseDouble(txtUpdateTime.getText());
        String manufactureYear=(String)manuYearComboBox.getSelectedItem();
        String manufacures=(String)manuComboBox.getSelectedItem();
        String whetherAvailable=(String)avaComboBox.getSelectedItem();
        String whetherExp=(String)expComboBox.getSelectedItem();
        String airPort=txtAirPort.getText();
        

        AirPlane a=aph.addPlanes();
        a.setSerialNumber(serialNumber);
        a.setTimeToTakeOff(timeToTakeOff);
        a.setNumberofSeats(numberofSeats);
        a.setUpdateTime(updateTime);
        a.setManufactureYear(manufactureYear);
        a.setManufactures(manufacures);
        a.setWhetherAvailable(whetherAvailable);
        a.setWhetherExp(whetherExp);
        a.setModelNumber(modelNumber);
        a.setAirPort(airPort);
        
      
      
        
        JOptionPane.showMessageDialog(null, "Create Successfull"); 
        
        txtSerialNumber.setText("");
        txtTimeTakeOff.setText("");
        txtNumberSeats.setText("");
        txtUpdateTime.setText("");
        txtModelNumber.setText("");
        txtAirPort.setText("");
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void manuYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuYearComboBoxActionPerformed
        // TODO add your handling code here:
        JComboBox manuYearComboBox = new JComboBox();
       
    }//GEN-LAST:event_manuYearComboBoxActionPerformed

    private void manuYearComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_manuYearComboBoxComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manuYearComboBoxComponentAdded

    private void manuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuComboBoxActionPerformed
        // TODO add your handling code here:
        JComboBox manuComboBox = new JComboBox();
 
    }//GEN-LAST:event_manuComboBoxActionPerformed

    private void avaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaComboBoxActionPerformed
        // TODO add your handling code here:
        JComboBox avaComboBox = new JComboBox();
    }//GEN-LAST:event_avaComboBoxActionPerformed

    private void expComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expComboBoxActionPerformed
        // TODO add your handling code here:
         JComboBox expComboBox = new JComboBox();
    }//GEN-LAST:event_expComboBoxActionPerformed

    private void txtTimeTakeOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeTakeOffActionPerformed
        // TODO add your handling code here:
           

    }//GEN-LAST:event_txtTimeTakeOffActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void txtSerialNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNumberKeyTyped
        // TODO add your handling code here:
    char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtSerialNumberKeyTyped

    private void txtTimeTakeOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimeTakeOffMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtTimeTakeOffMouseClicked

    private void txtTimeTakeOffKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeTakeOffKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtTimeTakeOffKeyTyped

    private void txtNumberSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberSeatsKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtNumberSeatsKeyTyped

    private void txtUpdateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateTimeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtUpdateTimeActionPerformed

    private void txtUpdateTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateTimeKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtUpdateTimeKeyTyped

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void txtModelNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelNumberKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
         if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a number correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtModelNumberKeyTyped

    private void txtAirPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAirPortKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
         if(!(Character.isLetter(c) || (c==KeyEvent.VK_BACKSPACE)) || c==KeyEvent.VK_DELETE){
             JOptionPane.showMessageDialog(null, "Please enter a text correctly!"); 
          evt.consume();
         }
    }//GEN-LAST:event_txtAirPortKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> avaComboBox;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> expComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> manuComboBox;
    private javax.swing.JComboBox<String> manuYearComboBox;
    private javax.swing.JTextField txtAirPort;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtNumberSeats;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtTimeTakeOff;
    private javax.swing.JTextField txtUpdateTime;
    // End of variables declaration//GEN-END:variables
}