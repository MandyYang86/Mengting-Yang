/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mengtingyang
 */
public class ConfigureABusiness {
     private Business business;

    public ConfigureABusiness() {
    }
     
       public Business initialize(){
      this.business=new Business();
      
      UserAccount systemAdminuserAccount=business.getBusiness_UserAccountDirectory().addUserAccount();
      systemAdminuserAccount.setUserName("systemadmin");
      systemAdminuserAccount.setPassWord("systemadmin");
      systemAdminuserAccount.setRole("System Admin");
      systemAdminuserAccount.setAccountStatus("Active");
      systemAdminuserAccount.setUserID(001);
      
      UserAccount salesAdminuserAccount=business.getBusiness_UserAccountDirectory().addUserAccount();
      SalesPerson salesPerson=business.getBusiness_SalesPersonDirectory().addSalesPerson();
      salesPerson.setSalesPersonUserName("sale");
      salesPerson.setSalesPersonPassWord("sale");
      salesAdminuserAccount.setUserName("sale");
      salesAdminuserAccount.setPassWord("sale");
      salesAdminuserAccount.setRole("Salesperson");
      salesAdminuserAccount.setAccountStatus("Active");
      salesAdminuserAccount.setUserID(002);
      salesAdminuserAccount.setUserAccount_SalesPerson(salesPerson);
      
      UserAccount supplierAdminuserAccount=business.getBusiness_UserAccountDirectory().addUserAccount();
      Supplier supplier=business.getBusiness_SupplierDirectory().addSupplier();
      supplier.setSupplierUserName("sp");
      supplier.setSupplierPassWord("sp");
      supplierAdminuserAccount.setUserName("sp");
      supplierAdminuserAccount.setPassWord("sp");
      supplierAdminuserAccount.setRole("Supplier");
      supplierAdminuserAccount.setAccountStatus("Active");
      supplierAdminuserAccount.setUserID(003);
      supplierAdminuserAccount.setUserAccount_Supplier(supplier);
      
      UserAccount salesAdminuserAccount1=business.getBusiness_UserAccountDirectory().addUserAccount();
      SalesPerson salesPerson1=business.getBusiness_SalesPersonDirectory().addSalesPerson();
      salesPerson1.setSalesPersonUserName("salea");
      salesPerson1.setSalesPersonPassWord("salea");
      salesAdminuserAccount1.setUserName("salea");
      salesAdminuserAccount1.setPassWord("salea");
      salesAdminuserAccount1.setRole("Salesperson");
      salesAdminuserAccount1.setAccountStatus("Active");
      salesAdminuserAccount1.setUserID(004);
      salesAdminuserAccount1.setUserAccount_SalesPerson(salesPerson1);
      
      UserAccount salesAdminuserAccount2=business.getBusiness_UserAccountDirectory().addUserAccount();
      SalesPerson salesPerson2=business.getBusiness_SalesPersonDirectory().addSalesPerson();
      salesPerson2.setSalesPersonUserName("saleb");
      salesPerson2.setSalesPersonPassWord("saleb");
      salesAdminuserAccount2.setUserName("saleb");
      salesAdminuserAccount2.setPassWord("saleb");
      salesAdminuserAccount2.setRole("Salesperson");
      salesAdminuserAccount2.setAccountStatus("Active");
      salesAdminuserAccount2.setUserID(005);
      salesAdminuserAccount2.setUserAccount_SalesPerson(salesPerson2);
      
      
       return business;//??
       }
     
}
