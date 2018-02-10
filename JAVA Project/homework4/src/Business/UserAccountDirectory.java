/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        this.userAccountDirectory = new ArrayList<UserAccount>() ;
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount addUserAccount(){
    UserAccount userAccount=new UserAccount();
    userAccountDirectory.add(userAccount);
    return userAccount;
    }
    
    public void removeUserAccount(UserAccount userAccount){
    userAccountDirectory.remove(userAccount);
    }
}
