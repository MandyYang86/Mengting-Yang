/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mengtingyang
 */
public class ProductCatalog {
    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog=new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public void sortProductRevenue(){
           Collections.sort(productCatalog, new SortProduct());
        
    }
    
    public  Product addProdcut(){
    Product product=new Product();
    productCatalog.add(product);
    return product;
    }
    
    public void removeProdcut(Product product){
        productCatalog.remove(product);
    }
    
    public Product searchProduct(int p){
    for(Product product:productCatalog){
    if(product.getProductID()==p){
    return product;
    } 
    }
    return null;
    }
}
