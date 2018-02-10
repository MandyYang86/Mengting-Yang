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
public class MarketOffer {
    int floorPrice;
    int targrtPrice;
    int ceilingPrice;

    private Market marketOffer_Market;
    
    public MarketOffer(){
    this.marketOffer_Market=new Market();
    }

    public Market getMarketOffer_Market() {
        return marketOffer_Market;
    }

    public void setMarketOffer_Market(Market marketOffer_Market) {
        this.marketOffer_Market = marketOffer_Market;
    }
    
    
    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getTargrtPrice() {
        return targrtPrice;
    }

    public void setTargrtPrice(int targrtPrice) {
        this.targrtPrice = targrtPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }
    
    
}
