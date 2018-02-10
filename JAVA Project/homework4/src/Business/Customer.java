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
public class Customer {
    String customerName;
    int    customerID;
    String customerAddress;
    String contact;
   static  int numberCustomer=0;
    
    private SalesPerson customer_SalesPerosn;
    
    public Customer (){
    this.customer_SalesPerosn=new SalesPerson();
    numberCustomer++;
    customerID=numberCustomer;
    }

    public SalesPerson getCustomer_SalesPerosn() {
        return customer_SalesPerosn;
    }

    public void setCustomer_SalesPerosn(SalesPerson customer_SalesPerosn) {
        this.customer_SalesPerosn = customer_SalesPerosn;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    @Override
    public String toString(){
    return customerName;
    }
    
    
}
