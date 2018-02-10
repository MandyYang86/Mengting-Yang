/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author mengtingyang
 */
public class SalesPersonDirectory {
    private ArrayList<SalesPerson> salesPersonDirectory;

    public SalesPersonDirectory() {
        salesPersonDirectory=new ArrayList<SalesPerson>();
    }

    public ArrayList<SalesPerson> getSalesPersonDirectory() {
        return salesPersonDirectory;
    }
    
    public SalesPerson addSalesPerson(){
    SalesPerson salesPerson=new SalesPerson();
    salesPersonDirectory.add(salesPerson);
    return salesPerson;
    }
    
    public void removeSalesPerson( SalesPerson salesPerson){
        salesPersonDirectory.remove(salesPerson);
    }
   
       public void sortRevenue(){
           Collections.sort(salesPersonDirectory, new SortComparator());
        
    }
    
}
