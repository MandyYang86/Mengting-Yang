/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DataAnalyticsRoleWorkArea;
import Business.EcoSystem;
import java.awt.Font;
import Business.Enterprise.Enterprise;
import Business.Organization.Administrative;
import Business.Organization.HomelessPeopleRegistration;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.axis.CategoryAxis;  
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;  
import org.jfree.chart.plot.CategoryPlot;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  
/**
 *
 * @author 84690
 */
public class ViewHomelessPeopleNumberJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHoemlessPeopleNumber
     */
    private Organization organization;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    public ViewHomelessPeopleNumberJPanel(JPanel userProecssContainer,Organization organization,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.organization = organization;
        this.userProcessContainer = userProecssContainer;
        this.enterprise = enterprise;
        this.business = business;
        PopulateDetails();
    }
    public void populateChart(){
        JFreeChart chart = ChartFactory.createBarChart3D("Static", "Age Stage", "People Number",  getDataSet());  
        CategoryPlot plot = chart.getCategoryPlot();// 获取图表区域对象  
       
         NumberAxis numberAxis = (NumberAxis) plot.getRangeAxis();
        numberAxis .setAutoTickUnitSelection(false);    
        double unit=1;//刻度的长度
        NumberTickUnit ntu= new NumberTickUnit(unit);
        numberAxis .setTickUnit(ntu);
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
        
    }
    private CategoryDataset getDataSet() {  
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0;
        
                a=a+business.getHomelessDirectory().getFirstStagePeopleNumber();
                b=b+business.getHomelessDirectory().getSecondStagePeopleNumber();
                c=c+business.getHomelessDirectory().getThirdStagePeopleNumber();
                d=d+business.getHomelessDirectory().getFourthStagePeopleNumber();
                e=e+business.getHomelessDirectory().getFifthStagePeopleNumber();
                f=f+business.getHomelessDirectory().getSixthStagePeopleNumber();
                g=g+business.getHomelessDirectory().getSeventhStagePeopleNumber();
                h=h+business.getHomelessDirectory().getEighthStagePeopleNumber();
                i=i+business.getHomelessDirectory().getNinthStagePeopleNumber();
                j=j+business.getHomelessDirectory().getTenthStagePeopleNumber();
                k=k+business.getHomelessDirectory().getEleventhStagePeopleNumber();
            
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
        dataset.addValue(a, "Number", "0-10");  
        dataset.addValue(b, "Number", "11-20");  
        dataset.addValue(c, "Number", "21-30");  
        dataset.addValue(d, "Number", "31-40");  
        dataset.addValue(e, "Number", "41-50");  
        dataset.addValue(f, "Number", "51-60");  
        dataset.addValue(g, "Number", "61-70");  
        dataset.addValue(h, "Number", "71-80");  
        dataset.addValue(i, "Number", "81-90");  
        dataset.addValue(j, "Number", "91-100");  
        dataset.addValue(k, "Number", "101-110");  
         
        return dataset;  
    }  
    public void PopulateDetails(){
        int x=0,y=0,z=0;
        
                x=x+business.getHomelessDirectory().getPeopleNumber();
                y=y+business.getHomelessDirectory().getMalePeopleNumber();
                z=z+business.getHomelessDirectory().getFemalPeopleNumber();
             
        TotalNumberTextField.setText(Integer.toString(x));
        MaleNumberTextField.setText(Integer.toString(y));
        FemaleNumberTextField.setText(Integer.toString(z));
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
        TotalNumberTextField = new javax.swing.JTextField();
        FemaleNumberTextField = new javax.swing.JTextField();
        MaleNumberTextField = new javax.swing.JTextField();
        ViewDetailsButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 227, 227));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Total Number:");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setText("Female Number:");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Male Number:");

        TotalNumberTextField.setEditable(false);
        TotalNumberTextField.setEnabled(false);

        FemaleNumberTextField.setEditable(false);
        FemaleNumberTextField.setEnabled(false);

        MaleNumberTextField.setEditable(false);
        MaleNumberTextField.setEnabled(false);

        ViewDetailsButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ViewDetailsButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ooopic_1510889298.png"))); // NOI18N
        ViewDetailsButton1.setText("View Details");
        ViewDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsButton1ActionPerformed(evt);
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
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(ViewDetailsButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TotalNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(FemaleNumberTextField)
                            .addComponent(MaleNumberTextField))))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TotalNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FemaleNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MaleNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(ViewDetailsButton1)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DataAnalyticsRoleWorkAreaJPanel invenAdminwjp = (DataAnalyticsRoleWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ViewDetailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsButton1ActionPerformed
        // TODO add your handling code here:
        populateChart();
    }//GEN-LAST:event_ViewDetailsButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FemaleNumberTextField;
    private javax.swing.JTextField MaleNumberTextField;
    private javax.swing.JTextField TotalNumberTextField;
    private javax.swing.JButton ViewDetailsButton1;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
