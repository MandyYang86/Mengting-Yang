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
public class Product {

    private String productName;
    private int numberInStock;
    private String description;
    private int productID;
    private static int productNumber = 0;
    private boolean didSellAboveTarget = false;
    private double netSales = 0;

    private int productRevenue;
    private int productMarketRevenue;

    private MarketOffer product_MarketOffer;

    public Product() {
        this.product_MarketOffer = new MarketOffer();
        productNumber++;
        productID = productNumber;
    }

    public int getProductRevenue() {
        return productRevenue;
    }

    public void setProductRevenue(int productRevenue) {
        this.productRevenue = productRevenue;
    }

    public int getProductMarketRevenue() {
        return productMarketRevenue;
    }

    public void setProductMarketRevenue(int productMarketRevenue) {
        this.productMarketRevenue = productMarketRevenue;
    }

    public MarketOffer getProduct_MarketOffer() {
        return product_MarketOffer;
    }

    public void setProduct_MarketOffer(MarketOffer product_MarketOffer) {
        this.product_MarketOffer = product_MarketOffer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public boolean getDidSellAboveTarget() {
        return didSellAboveTarget;
    }

    public void setDidSellAboveTarget(boolean value) {
        didSellAboveTarget = value;
    }

    public double getNetSales() {
        return netSales;
    }
    
    public void addRevenue(double rev){
        netSales += rev;
    }

    @Override
    public String toString() {
        return productName;
    }

}
