/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HomelessPeopleRegistration;
import Business.Organization.Organization;
import Business.Organization.SheltersRegistration;
import Business.UserAccount.UserAccount;
import UserInterface.PeopleRegistrationRoleWorkArea.PeopleRegistrationRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mengtingyang
 */
public class PeopleRegistrationRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PeopleRegistrationRoleWorkAreaJPanel(userProcessContainer, account, (HomelessPeopleRegistration)organization, enterprise,business);
    }
}
