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
public class OrderItem {

    private int actualPrice;
    private int quantity;
    //private Product product;

    private Product orderItem_Product;

    public OrderItem() {
      this.orderItem_Product = new Product();
    }

    public Product getOrderItem_Product() {
        return orderItem_Product;
    }

    public void setOrderItem_Product(Product orderItem_Product) {
        this.orderItem_Product = orderItem_Product;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }
    
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

    @Override
    public String toString() {
        return orderItem_Product.getProductName();
    }

}
