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
public class Market {
    String marketName;
    
    private CustomerDirectory market_CustomerDirectory;

    public Market() {
        this.market_CustomerDirectory=new  CustomerDirectory();
    }

    public CustomerDirectory getMarket_CustomerDirectory() {
        return market_CustomerDirectory;
    }

    public void setMarket_CustomerDirectory(CustomerDirectory market_CustomerDirectory) {
        this.market_CustomerDirectory = market_CustomerDirectory;
    }
    
    

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
    
    @Override
    public String toString(){
    return marketName;
    }
    
    
}
