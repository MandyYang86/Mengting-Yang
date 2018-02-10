/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author mengtingyang
 */
public class SalesPerson {
    String salesPersonName;
    String personID;
    String salesPersonUserName;
    String salesPersonPassWord;
    
    ArrayList<Integer> profitList=new ArrayList<Integer> ();
    ArrayList<Integer> lossList=new ArrayList<Integer> ();

    public ArrayList<Integer> getProfitList() {
        return profitList;
    }

    public void setProfitList(ArrayList<Integer> profitList) {
        this.profitList = profitList;
    }

    public ArrayList<Integer> getLossList() {
        return lossList;
    }

    public void setLossList(ArrayList<Integer> lossList) {
        this.lossList = lossList;
    }
    
    boolean isGoodPerformer = false ;
    double sales_he = 0;
    double sales_fm = 0;
    
    int revenue;
    double sales;
    
    int targetRevenue;

    public int getTargetRevenue() {
        return targetRevenue;
    }

    public void setTargetRevenue(int targetRevenue) {
        this.targetRevenue = targetRevenue;
    }
    
    

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getSalesPersonUserName() {
        return salesPersonUserName;
    }

    public void setSalesPersonUserName(String salesPersonUserName) {
        this.salesPersonUserName = salesPersonUserName;
    }

    public String getSalesPersonPassWord() {
        return salesPersonPassWord;
    }

    public void setSalesPersonPassWord(String salesPersonPassWord) {
        this.salesPersonPassWord = salesPersonPassWord;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString(){
    return salesPersonUserName;
    }
    
        public double getSales_he() {
        return sales_he;
    }
    
    public double getSales_fm() {
        return sales_fm;
    }
    
    public double getNetSales(){
        return (sales_fm + sales_he) ;
    }

    public void setSales(double sales, String market) {
        if(market == "Higher Education Market"){
            this.sales_he += sales ;
        }
        else if(market == "Finance Service Market")
        this.sales_fm += sales;
    }
    
    public boolean isGoodPerformer(){
        return isGoodPerformer ;
    }
    
    public void setIsGoodPerformer(boolean value){
        isGoodPerformer = value ;
    }
    
    //下面在这里定义一个存salesperson的arraylist
 
    
}

