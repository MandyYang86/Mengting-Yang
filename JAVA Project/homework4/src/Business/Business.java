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
public class Business {
 private SupplierDirectory business_SupplierDirectory;
 private MarketOfferCatalog business_MarketOfferCatalog;
 private MarketList business_MarketList;
 private SalesPersonDirectory business_SalesPersonDirectory;
 private UserAccountDirectory business_UserAccountDirectory;
 private MasterOrderCatalog business_MasterOrderCatalog;
// private CustomerDirectory business_CustomerDirectory;//?
 private double totalrevenue = 0 ;

    public Business() {
        this.business_MarketList=new MarketList();
        this.business_MarketOfferCatalog=new MarketOfferCatalog();
        this.business_SalesPersonDirectory=new SalesPersonDirectory();
        this.business_SupplierDirectory=new SupplierDirectory();
        this.business_UserAccountDirectory=new UserAccountDirectory();
        this.business_MasterOrderCatalog=new MasterOrderCatalog();
       // this.business_CustomerDirectory=new CustomerDirectory();//?
    }

    public MasterOrderCatalog getBusiness_MasterOrderCatalog() {
        return business_MasterOrderCatalog;
    }

    public void setBusiness_MasterOrderCatalog(MasterOrderCatalog business_MasterOrderCatalog) {
        this.business_MasterOrderCatalog = business_MasterOrderCatalog;
    }
    

    public SupplierDirectory getBusiness_SupplierDirectory() {
        return business_SupplierDirectory;
    }

    public void setBusiness_SupplierDirectory(SupplierDirectory business_SupplierDirectory) {
        this.business_SupplierDirectory = business_SupplierDirectory;
    }

    public MarketOfferCatalog getBusiness_MarketOfferCatalog() {
        return business_MarketOfferCatalog;
    }

    public void setBusiness_MarketOfferCatalog(MarketOfferCatalog business_MarketOfferCatalog) {
        this.business_MarketOfferCatalog = business_MarketOfferCatalog;
    }

    public MarketList getBusiness_MarketList() {
        return business_MarketList;
    }

    public void setBusiness_MarketList(MarketList business_MarketList) {
        this.business_MarketList = business_MarketList;
    }

    public SalesPersonDirectory getBusiness_SalesPersonDirectory() {
        return business_SalesPersonDirectory;
    }

    public void setBusiness_SalesPersonDirectory(SalesPersonDirectory business_SalesPersonDirectory) {
        this.business_SalesPersonDirectory = business_SalesPersonDirectory;
    }

    public UserAccountDirectory getBusiness_UserAccountDirectory() {
        return business_UserAccountDirectory;
    }

    public void setBusiness_UserAccountDirectory(UserAccountDirectory business_UserAccountDirectory) {
        this.business_UserAccountDirectory = business_UserAccountDirectory;
    }
    
      public void addRevenue(double revenue){
        totalrevenue += revenue ;
    }
    
    public double getRevenue(){
        return totalrevenue ;
    }

    /*public CustomerDirectory getBusiness_CustomerDirectory() {
        return business_CustomerDirectory;
    }

    public void setBusiness_CustomerDirectory(CustomerDirectory business_CustomerDirectory) {
        this.business_CustomerDirectory = business_CustomerDirectory;
    }*/
 
    
    
 
}
