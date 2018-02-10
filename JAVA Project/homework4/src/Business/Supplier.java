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
public class Supplier {
 
    private String supplierUserName;
    private String supplierName;
    private String supplierPassWord;
    
    private  ProductCatalog supplier_productCatalog;

    public Supplier() {
        this.supplier_productCatalog =new ProductCatalog ();
    }
    

    public ProductCatalog getSupplier_productCatalog() {
        return supplier_productCatalog;
    }

    public void setSupplier_productCatalog(ProductCatalog supplier_productCatalog) {
        this.supplier_productCatalog = supplier_productCatalog;
    }
    
    

    public String getSupplierUserName() {
        return supplierUserName;
    }

    public void setSupplierUserName(String supplierUserName) {
        this.supplierUserName = supplierUserName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPassWord() {
        return supplierPassWord;
    }

    public void setSupplierPassWord(String supplierPassWord) {
        this.supplierPassWord = supplierPassWord;
    }
    
     @Override
    public String toString(){
    return supplierUserName;
    }


    
}
