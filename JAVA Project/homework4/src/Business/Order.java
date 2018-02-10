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
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count=0;    
    private int totalPrice;
    private Customer Order_customer;
    
    private int targetPrice;

    private int gap;

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }
    
    
    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }
    
    

    public Order() {
        count++;
        orderNumber=count;
        orderItemList=new ArrayList<OrderItem>();
        Order_customer=new Customer();
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Customer getOrder_customer() {
        return Order_customer;
    }

    public void setOrder_customer(Customer Order_customer) {
        this.Order_customer = Order_customer;
    }
    
    public int toInt(){
    return orderNumber;
    }
    
    
//    public OrderItem addOrderItem(Product p,int number,int pID,String des,String name){
//    OrderItem orderItem=new OrderItem();
//    orderItem.setOrderItem_Product(p);
//    p.setNumberInStock(number);
//    p.setDescription(des);
//    p.setProductID(pID);
//    p.setProductName(name);
//    orderItemList.add(orderItem);
//    return orderItem;
//    }
    
     public OrderItem addOrderItem(){
     OrderItem orderItem=new OrderItem();
       orderItemList.add(orderItem);
       return orderItem;
     }
     
    public void removeOrderItem(OrderItem orderItem){
    orderItemList.remove(orderItem);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
//    
//     @Override
//    public String toString() {
//        return String.valueOf(orderNumber);
//    }
@Override
    public String toString() {
        return String.valueOf(orderNumber);
    }
    
}
