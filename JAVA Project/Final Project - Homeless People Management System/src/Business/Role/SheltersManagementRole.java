/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SheltersManagement;
import Business.Organization.SheltersRegistration;
import Business.UserAccount.UserAccount;
import UserInterface.SheltersManagementRoleWorkArea.SheltersManagementRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mengtingyang
 */
public class SheltersManagementRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SheltersManagementRoleWorkAreaJPanel(userProcessContainer, account, (SheltersManagement)organization, enterprise,business);
    }
}
