/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> EnterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return EnterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> EnterpriseList) {
        this.EnterpriseList = EnterpriseList;
    }

    public EnterpriseDirectory() {
        EnterpriseList = new ArrayList();
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.CDC) {
            enterprise = new CDCEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        
        if (type == Enterprise.EnterpriseType.Distributor) {
            enterprise = new DistributorEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        
         if (type == Enterprise.EnterpriseType.StateDepartmentOfPublicHealth) {
            enterprise = new StateDepartmentOfPublicHealthEnterprise(name);
            EnterpriseList.add(enterprise);
        }
         
         if (type == Enterprise.EnterpriseType.Supplier) {
            enterprise = new SupplierEnterprise(name);
            EnterpriseList.add(enterprise);
        }

        return enterprise;
    }

}
