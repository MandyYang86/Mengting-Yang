/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DistributorOrganization;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DistributoRoleWorkArea.DistributorRoleWorkAreaJPanel;
import UserInterface.DistributoRoleWorkArea.DistributorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mengtingyang
 */
public class DistributorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistributorWorkAreaJPanel(userProcessContainer, account, (DistributorOrganization)organization, enterprise,business);
    }
    
}
