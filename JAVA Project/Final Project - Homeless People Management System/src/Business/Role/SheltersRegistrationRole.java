/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SheltersRegistration;
import Business.Organization.Nurse;
import Business.UserAccount.UserAccount;
import UserInterface.SheltersRegistrationRoleWorkArea.SheltersRegistrationRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mengtingyang
 */
public class SheltersRegistrationRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SheltersRegistrationRoleWorkAreaJPanel(userProcessContainer, account, (SheltersRegistration)organization, enterprise,business);
    }
}
