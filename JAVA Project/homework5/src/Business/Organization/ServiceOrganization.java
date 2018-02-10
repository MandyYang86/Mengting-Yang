/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorRole;
import Business.Role.InventoryRole;
import Business.Role.Role;
import Business.Role.ServiceRole;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class ServiceOrganization extends Organization{
    public ServiceOrganization() {
        super(Organization.OrganizationType.Service.getValue());
    }
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ServiceRole());
        return roles;
    }
}
