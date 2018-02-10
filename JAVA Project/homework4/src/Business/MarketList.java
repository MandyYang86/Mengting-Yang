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
public class MarketList {
    private ArrayList<Market> marketList;

    public MarketList() {
        this.marketList = new ArrayList<Market>();
        Market mk1 = new Market();
        String mk1Name = "Higher Education";
        mk1.setMarketName(mk1Name);
        marketList.add(mk1);
        
        Market mk2 = new Market();
        String mk2Name = "Finance";
        mk2.setMarketName(mk2Name);
        marketList.add(mk2);
        
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }
    
    public Market addMarket(){
    Market market=new Market();
    marketList.add(market);
    return market;
    }
    
    public void removeMarket(Market market){
    marketList.remove(market);
    }
}
