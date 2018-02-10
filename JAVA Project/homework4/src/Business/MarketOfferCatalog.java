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
public class MarketOfferCatalog {
    private ArrayList<MarketOffer> marketOfferCatalog;

    public MarketOfferCatalog() {
        this.marketOfferCatalog =new ArrayList<MarketOffer>() ;
    }

    public ArrayList<MarketOffer> getMarketOfferCatalog() {
        return marketOfferCatalog;
    }
    
    public MarketOffer addMarketOffer(){
    MarketOffer marketOffer=new MarketOffer();
    marketOfferCatalog.add(marketOffer);
    return marketOffer;
    }
    
    public void removeMarketOffer(MarketOffer marketOffer){
    marketOfferCatalog.remove(marketOffer);
    }
    
}
