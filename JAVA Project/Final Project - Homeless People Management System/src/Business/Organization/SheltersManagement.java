/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SheltersManagementRole;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class SheltersManagement extends Organization{
    public SheltersManagement() {
        super(OrganizationType.SheltersManagement.getValue());
    }
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new  SheltersManagementRole());
        return roles;
    }
}
