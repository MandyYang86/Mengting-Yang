/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DataAnalyticsRoleWorkArea;

import Business.Disease.Disease;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.NetWork;
import Business.Organization.Doctor;
import Business.Organization.HomelessPeopleRegistration;
import Business.Organization.Nurse;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author 84690
 */
public class ViewDiseaseDistributedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDiseaseDistributed
     */
    private Organization organization;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    public ViewDiseaseDistributedJPanel(JPanel userProecssContainer,Organization organization,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.organization = organization;
        this.userProcessContainer = userProecssContainer;
        this.enterprise = enterprise;
        this.business =business;
        populateDetails();
    }
    public void populateDetails(){
        Enterprise ent = null;
        for(NetWork network : business.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HospitalEnterprise){
                    ent = enterprise;
                    break;
                }
            }
            break;
        }
        
        for(Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof Doctor){
                Organization org = organization;
                
                org.getWorkQueue().niubility();
                if(org.getWorkQueue().getTopK(org.getWorkQueue().getAllMap(), 1).size()==0){
                    TotalTextField.setText(null);
                }
                else TotalTextField.setText( org.getWorkQueue().getTopK(org.getWorkQueue().getAllMap(), 1).get(0));
                if(org.getWorkQueue().getTopK(org.getWorkQueue().getWomanMap(), 1).size()==0){
                    FemaleTextField.setText(null);
                }
                else FemaleTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getWomanMap(), 1).get(0));
                if(org.getWorkQueue().getTopK(org.getWorkQueue().getManMap(), 1).size()==0){
                    MaleTextField.setText(null);
                }
                else MaleTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getManMap(), 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[0], 1).size()==0)){
                    FirstTextField.setText(null);
                }
                else FirstTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[0], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[1], 1).size()==0)){
                    SecondTextField.setText(null);
                }
                else SecondTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[1], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[2], 1).size()==0)){
                    ThirdTextField.setText(null);
                }
                else ThirdTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[2], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[3], 1).size()==0)){
                    FourthTextField.setText(null);
                }
                else FourthTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[3], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[4], 1).size()==0)){
                    FifthTextField.setText(null);
                }
                else FifthTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[4], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[5], 1).size()==0)){
                    SixthTextField.setText(null);
                }
                else SixthTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[5], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[6], 1).size()==0)){
                    SeventhTextField.setText(null);
                }
                else SeventhTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[6], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[7], 1).size()==0)){
                    EighthTextField.setText(null);
                }
                else EighthTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[7], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[8], 1).size()==0)){
                    NinthTextField.setText(null);
                }
                else NinthTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[8], 1).get(0));
                if((org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[9], 1).size()==0)){
                    TenthTextField.setText(null);
                }
                else TenthTextField.setText(org.getWorkQueue().getTopK(org.getWorkQueue().getAgeMaps()[9], 1).get(0));
                
            }
        }
          
    }
    public void populateHistogram(){
         JFreeChart chart = ChartFactory.createBarChart3D("Static", "Disease Name", "Number",  getDataSet2());
         CategoryPlot plot = chart.getCategoryPlot();
         NumberAxis numberAxis = (NumberAxis) plot.getRangeAxis();
        numberAxis .setAutoTickUnitSelection(false);    
        double unit=1;//刻度的长度
        NumberTickUnit ntu= new NumberTickUnit(unit);
        numberAxis .setTickUnit(ntu);
 
        /*DateAxis xAxis = new DateAxis(xName);
        xAxis.setRange(start_time, end_time);
        xAxis.setAutoTickUnitSelection(false);
        xAxis.setTickUnit(new DateTickUnit(DateTickUnit.MINUTE,20));
        plot.setDomainAxis(xAxis);*/
        // 获取图表区域对象  
        CategoryAxis domainAxis = plot.getDomainAxis(); // 水平底部列表  
        domainAxis.setLabelFont(new Font("黑体", Font.BOLD, 14)); // 水平底部标题  
        domainAxis.setTickLabelFont(new Font("宋体", Font.BOLD, 12)); // 垂直标题  
        ValueAxis rangeAxis = plot.getRangeAxis();// 获取柱状  
        rangeAxis.setLabelFont(new Font("黑体", Font.BOLD, 15));  
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));  
        chart.getTitle().setFont(new Font("宋体", Font.BOLD, 20));// 设置标题字体 
        ChartPanel chartPanel = new ChartPanel(chart, true);
           
        JFrame frame=new JFrame("Static Data");    
        frame.add(chartPanel);           //添加柱形图    
        frame.setBounds(50, 50, 900, 600);    
        frame.setVisible(true); 
        int k = getDataSet2().getColumnCount();  
        if (k == 1) {  
          plot.getDomainAxis().setLowerMargin(0.26);  
          plot.getDomainAxis().setUpperMargin(0.66);  
      } else if (k < 6) {  
          double margin = (1.0 - k * 0.08) / 3;  
          plot.getDomainAxis().setLowerMargin(margin);  
          plot.getDomainAxis().setUpperMargin(margin);  
           domainAxis.setCategoryMargin(0.1);  
          ((BarRenderer3D) plot.getRenderer()).setItemMargin(margin);  
      } else {  
          ((BarRenderer3D) plot.getRenderer()).setItemMargin(0.1);  
      }  
    }
    public void populateChart(){
        DefaultPieDataset data = getDataSet();
        JFreeChart chart = ChartFactory.createPieChart3D("Disease Distributed",data,true,false,false);
        //设置百分比
        PiePlot pieplot = (PiePlot) chart.getPlot();
        DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题
        NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象
        StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0} {2}", nf, df);//获得StandardPieSectionLabelGenerator对象
        pieplot.setLabelGenerator(sp1);//设置饼图显示百分比
        //没有数据的时候显示的内容
        pieplot.setNoDataMessage("No Data");
        pieplot.setCircular(false);
        pieplot.setLabelGap(0.02D);
        pieplot.setIgnoreNullValues(true);//设置不显示空值
        pieplot.setIgnoreZeroValues(true);//设置不显示负值
        ChartPanel chartPanel = new ChartPanel(chart, true);
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.setBounds(50, 50, 900, 600);    
        frame.setVisible(true); 
        chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体
        PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
        piePlot.setLabelFont(new Font("宋体",Font.BOLD,10));//解决乱码
        chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,10));
}
    private CategoryDataset getDataSet2(){
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         Enterprise ent = null;
        for(NetWork network : business.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HospitalEnterprise){
                    ent = enterprise;
                    break;
                }
            }
            break;
        }
         for(Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof Doctor){
                Organization org = organization;
                org.getWorkQueue().niubility();
                for (Disease key : org.getWorkQueue().getAllMap().keySet())
                    dataset.addValue(org.getWorkQueue().getAllMap().get(key),"Number",key.getName());


            }
        }
         return dataset;
    }
    private  DefaultPieDataset getDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();
         Enterprise ent = null;
        for(NetWork network : business.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HospitalEnterprise){
                    ent = enterprise;
                    break;
                }
            }
            break;
        }
        for(Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof Doctor){
                Organization org = organization;
                org.getWorkQueue().niubility();
                for (Disease key : org.getWorkQueue().getAllMap().keySet())
                    dataset.setValue(key.getName(),org.getWorkQueue().getAllMap().get(key));


            }
}
return dataset;
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
        TotalTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FemaleTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MaleTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FirstTextField = new javax.swing.JTextField();
        SecondTextField = new javax.swing.JTextField();
        ThirdTextField = new javax.swing.JTextField();
        FourthTextField = new javax.swing.JTextField();
        FifthTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SixthTextField = new javax.swing.JTextField();
        SeventhTextField = new javax.swing.JTextField();
        EighthTextField = new javax.swing.JTextField();
        NinthTextField = new javax.swing.JTextField();
        TenthTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        ViewDetailsjButton = new javax.swing.JButton();
        ViewDetailsjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 227, 227));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Total:");

        TotalTextField.setEditable(false);
        TotalTextField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setText("Female:");

        FemaleTextField.setEditable(false);
        FemaleTextField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Male:");

        MaleTextField.setEditable(false);
        MaleTextField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("0-10:");

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setText("11-20:");

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setText("21-30:");

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setText("31-40:");

        jLabel8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel8.setText("41-50:");

        FirstTextField.setEditable(false);
        FirstTextField.setEnabled(false);

        SecondTextField.setEditable(false);
        SecondTextField.setEnabled(false);
        SecondTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondTextFieldActionPerformed(evt);
            }
        });

        ThirdTextField.setEditable(false);
        ThirdTextField.setEnabled(false);
        ThirdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdTextFieldActionPerformed(evt);
            }
        });

        FourthTextField.setEditable(false);
        FourthTextField.setEnabled(false);

        FifthTextField.setEditable(false);
        FifthTextField.setEnabled(false);
        FifthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifthTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setText("51-60:");

        jLabel10.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel10.setText("61-70:");

        jLabel11.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel11.setText("71-80:");

        jLabel12.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel12.setText("81-90:");

        jLabel13.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel13.setText("91-100:");

        SixthTextField.setEditable(false);
        SixthTextField.setEnabled(false);

        SeventhTextField.setEditable(false);
        SeventhTextField.setEnabled(false);

        EighthTextField.setEditable(false);
        EighthTextField.setEnabled(false);

        NinthTextField.setEditable(false);
        NinthTextField.setEnabled(false);

        TenthTextField.setEditable(false);
        TenthTextField.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889304.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        ViewDetailsjButton.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetailsjButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ViewDetailsjButton.setText("View Pie Chart ");
        ViewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsjButtonActionPerformed(evt);
            }
        });

        ViewDetailsjButton1.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetailsjButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ViewDetailsjButton1.setText("View  Histogram");
        ViewDetailsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(FirstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(SixthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(SecondTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(SeventhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(ThirdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(EighthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(FourthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(NinthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FemaleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(TotalTextField)
                                    .addComponent(MaleTextField))
                                .addGap(83, 83, 83)
                                .addComponent(ViewDetailsjButton)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ViewDetailsjButton1)
                            .addComponent(TenthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(FifthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FemaleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MaleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDetailsjButton)
                    .addComponent(ViewDetailsjButton1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThirdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FourthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FifthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SixthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeventhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EighthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NinthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TenthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SecondTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondTextFieldActionPerformed

    private void ThirdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThirdTextFieldActionPerformed

    private void FifthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FifthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FifthTextFieldActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DataAnalyticsRoleWorkAreaJPanel invenAdminwjp = (DataAnalyticsRoleWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ViewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsjButtonActionPerformed
        // TODO add your handling code here:
        populateChart();
    }//GEN-LAST:event_ViewDetailsjButtonActionPerformed

    private void ViewDetailsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsjButton1ActionPerformed
        // TODO add your handling code here:
        populateHistogram();
    }//GEN-LAST:event_ViewDetailsjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EighthTextField;
    private javax.swing.JTextField FemaleTextField;
    private javax.swing.JTextField FifthTextField;
    private javax.swing.JTextField FirstTextField;
    private javax.swing.JTextField FourthTextField;
    private javax.swing.JTextField MaleTextField;
    private javax.swing.JTextField NinthTextField;
    private javax.swing.JTextField SecondTextField;
    private javax.swing.JTextField SeventhTextField;
    private javax.swing.JTextField SixthTextField;
    private javax.swing.JTextField TenthTextField;
    private javax.swing.JTextField ThirdTextField;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JButton ViewDetailsjButton;
    private javax.swing.JButton ViewDetailsjButton1;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
