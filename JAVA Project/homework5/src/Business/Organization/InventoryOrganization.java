/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorRole;
import Business.Role.InventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class InventoryOrganization extends Organization {
      public InventoryOrganization() {
        super(Organization.OrganizationType.Inventory.getValue());
    }
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryRole());
        return roles;
    }
}
