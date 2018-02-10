/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public abstract class Organization {

    private String name;

    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
   private WorkQueue workQueue;
    private int organizationID;
    private static int counter;

    public enum OrganizationType {
        Admin("Admin Organization"),
        Inventory("Inventory Organization"),
        Distributor("Distributor Organization"),
        Service("Service Organization"),
        Clinic("Clinic");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
         workQueue = new WorkQueue();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    @Override
    public String toString() {
        return name;
    }
}
