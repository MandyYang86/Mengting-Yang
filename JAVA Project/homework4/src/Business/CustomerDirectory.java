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
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory ;

    public CustomerDirectory() {
       customerDirectory =new ArrayList<Customer> ();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }
    
    public Customer addCustomer(){
    Customer customer=new Customer();
    customerDirectory.add(customer);
    return customer;
    }
    
    public void removeCustomer(Customer customer){
    customerDirectory.remove(customer);
    }
    
}
