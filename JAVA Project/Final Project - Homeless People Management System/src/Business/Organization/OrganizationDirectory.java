/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    public Organization createOrganization(Organization.OrganizationType type){
        Organization organization = null;
        
        if (type.getValue().equals(Organization.OrganizationType.Administrative.getValue())){
            organization = new Administrative();
            organizationList.add(organization);
        }
        
        if (type.getValue().equals(Organization.OrganizationType.DataAnalytics.getValue())){
            organization = new DataAnalytics();
            organizationList.add(organization);
        }
        
        if (type.getValue().equals(Organization.OrganizationType.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
        
         if (type.getValue().equals(Organization.OrganizationType.HomelessPeopleRegistration.getValue())){
            organization = new HomelessPeopleRegistration();
            organizationList.add(organization);
        }
         
          if (type.getValue().equals(Organization.OrganizationType.Inventory.getValue())){
            organization = new Inventory();
            organizationList.add(organization);
        }
        
          if (type.getValue().equals(Organization.OrganizationType.Lab.getValue())){
            organization = new Lab();
            organizationList.add(organization);
        }
          
           if (type.getValue().equals(Organization.OrganizationType.PhysicalExamination.getValue())){
            organization = new PhysicalExamination();
            organizationList.add(organization);
        }
           
           if (type.getValue().equals(Organization.OrganizationType.SheltersManagement.getValue())){
            organization = new SheltersManagement();
            organizationList.add(organization);
        }
           
           if (type.getValue().equals(Organization.OrganizationType.SheltersRegistration.getValue())){
            organization = new SheltersRegistration();
            organizationList.add(organization);
        }
           
           if (type.getValue().equals(Organization.OrganizationType.Nurse.getValue())){
            organization = new Nurse();
            organizationList.add(organization);
        }
           
        return organization;
    }
    
}
