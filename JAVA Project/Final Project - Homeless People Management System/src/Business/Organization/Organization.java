/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Appointment.AppointmentDirectory;
import Business.Disease.DiseaseDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Examination.ResultDirectory;
import Business.Homeless.HomelessDirectory;
import Business.Role.Role;
import Business.Shelters.SheltersDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.Vaccine.VaccineDirectory;
import Business.WorkQueue.WorkQueue;
import SendEmail.SendEmail;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private SheltersDirectory sheltersDirectory;
    private DiseaseDirectory diseaseDirectory;
    private VaccineDirectory vaccineDirectory;
    private HomelessDirectory homelessDirectory;
    private ResultDirectory resultDirectory;
    private AppointmentDirectory appointmentDirectory;
    private SendEmail sendEmail;
    
    public enum OrganizationType{
        PhysicalExamination("Physical Examination"),
        Nurse("Nurse"),
        Lab("Lab"),
        Doctor("Doctor"),
        HomelessPeopleRegistration("Homeless People Registration"),
        Administrative("Administrative"),
        DataAnalytics("Data Analytics"),
        SheltersRegistration("Shelters Registration"),
        SheltersManagement("Shelters Management"),
        Inventory("Inventory");
        
        
        private String value;
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        sheltersDirectory=new SheltersDirectory();
        diseaseDirectory = new DiseaseDirectory();
        vaccineDirectory = new VaccineDirectory();
        homelessDirectory = new HomelessDirectory();
        resultDirectory = new ResultDirectory();
        appointmentDirectory=new AppointmentDirectory();
        sendEmail=new SendEmail();
    }

    public HomelessDirectory getHomelessDirectory() {
        return homelessDirectory;
    }

    public void setHomelessDirectory(HomelessDirectory homelessDirectory) {
        this.homelessDirectory = homelessDirectory;
    }

    public ResultDirectory getResultDirectory() {
        return resultDirectory;
    }

    public SendEmail getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public SheltersDirectory getSheltersDirectory() {
        return sheltersDirectory;
    }

    public void setSheltersDirectory(SheltersDirectory sheltersDirectory) {
        this.sheltersDirectory = sheltersDirectory;
    }

    public DiseaseDirectory getDiseaseDirectory() {
        return diseaseDirectory;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }
    
    
    
      public abstract ArrayList<Role> getSupportedRole();
      
       @Override
    public String toString() {
        return name;
    }
}
