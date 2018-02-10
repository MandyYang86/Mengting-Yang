/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author mengtingyang
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    //private EmployeeDirectory employeeDirectory;

    public enum EnterpriseType {
        CDC("CDC"),
        StateDepartmentOfPublicHealth("State Department Of Public Health"),
        Supplier("Supplier"),
        Distributor("Distributor");

        private EnterpriseType(String value) {
            this.value = value;
        }

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

//    public EmployeeDirectory getEmployeeDirectory() {
//        return employeeDirectory;
//    }
//
//    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
//        this.employeeDirectory = employeeDirectory;
   // }

    public Enterprise(String name,EnterpriseType type) {
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();  
    }

}
