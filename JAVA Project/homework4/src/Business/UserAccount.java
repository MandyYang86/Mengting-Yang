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
public class UserAccount {
    String userName;
    String passWord;
    String role;
    String accountStatus;//Active or Disable
    int userID;
    
    private Supplier UserAccount_Supplier;
    private SalesPerson UserAccount_SalesPerson;

    public Supplier getUserAccount_Supplier() {
        return UserAccount_Supplier;
    }

    public void setUserAccount_Supplier(Supplier UserAccount_Supplier) {
        this.UserAccount_Supplier = UserAccount_Supplier;
    }

    public SalesPerson getUserAccount_SalesPerson() {
        return UserAccount_SalesPerson;
    }

    public void setUserAccount_SalesPerson(SalesPerson UserAccount_SalesPerson) {
        this.UserAccount_SalesPerson = UserAccount_SalesPerson;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String toString(){
    return userName;
    }
}
