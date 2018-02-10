/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdministrativeRole;
import Business.Role.DataAnalyticsRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class DataAnalytics extends Organization{
    public DataAnalytics() {
        super(OrganizationType.DataAnalytics.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DataAnalyticsRole());
        return roles;
    }
}
