/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;


/**
 *
 * @author mengtingyang
 */
public class ConfigureSystem {
    public static EcoSystem configure(){
   EcoSystem system=EcoSystem.getInstance();
  Employee employee=system.getEmployeeDirectory().createEmployee("YANG");
  
   UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
    return system;
    }
}
