/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SheltersRegistrationRole;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class SheltersRegistration extends Organization{
    public SheltersRegistration() {
        super(OrganizationType.SheltersRegistration.getValue());
    }
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SheltersRegistrationRole());
        return roles;
    }
}
