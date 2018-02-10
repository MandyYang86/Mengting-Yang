/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ExaminationRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.ExaminationRole;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class PhysicalExamination extends Organization  {
     public PhysicalExamination() {
        super(OrganizationType.PhysicalExamination.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ExaminationRole());
        return roles;
    }
}
