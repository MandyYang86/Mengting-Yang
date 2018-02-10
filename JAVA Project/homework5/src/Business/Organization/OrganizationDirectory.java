/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.OrganizationType;
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
    
 public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(OrganizationType.Distributor.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(OrganizationType.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(OrganizationType.Service.getValue())){
            organization = new ServiceOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}
