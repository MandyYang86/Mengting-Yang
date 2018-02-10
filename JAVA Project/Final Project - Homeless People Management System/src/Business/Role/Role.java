/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mengtingyang
 */
public abstract class Role {
    public enum RoleType{
        ExaminationRole("Examination Role"),
        NurseRole("Nurse Role"),
        LabAssistantRole("Lab Assistant Role"),
        DoctorRole("Doctor Role"),
        SheltersRegistrationRole("Shelters Registration Role"),
        SheltersManagementRole("Shelters Management Role"),
        PeopleRegistrationRole("People Registration Role"),
        AdministrativeRole("Administrative Role"),
        DataAnalyticsRole("Data Analytics Role"),
        InventoryRole("Inventory Role"),
        SalesPersonRole("SalesPerson Role"),
        EnterpriseAdmin("Enterprise Admin"),
        SystemAdmin("System Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    //not sure!!!
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
    
}
