/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Homeless;

import java.util.ArrayList;

/**
 *
 * @author butte
 */
public class HomelessDirectory {
    private ArrayList<Homeless> homelessList;
    
    public HomelessDirectory(){
        homelessList = new ArrayList<>();
    }

    public ArrayList<Homeless> getHomelessList() {
        return homelessList;
    }

    public void setHomelessList(ArrayList<Homeless> homelessList) {
        this.homelessList = homelessList;
    }
    
    public Homeless CreateHomeless(String name){
        Homeless homeless = new Homeless();
        homeless.setName(name);
        homelessList.add(homeless);
        return homeless;
    }
      public int getPeopleNumber(){
        int i=0;
        for(Homeless homeless : homelessList)
            i++;
        return i;
    }
    public int getFemalPeopleNumber(){
        int i=0;
        for(Homeless homeless : homelessList){
            if(homeless.getGender().equals("Female"))
            i++;
        }
        return i;
    }
    public int getMalePeopleNumber(){
        int i=0;
        for(Homeless homeless : homelessList){
            if(homeless.getGender().equals("Male"))
            i++;
        }
        return i;
    }
    public int getFirstStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=0&&homeless.getAge()<10)
            i++;
        }
        return i;
    }
    public int getSecondStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=10&&homeless.getAge()<20)
            i++;
        }
        return i;                   
    }
    public int getThirdStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=20&&homeless.getAge()<30)
            i++;
        }
        return i;                   
    }
    public int getFourthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=20&&homeless.getAge()<30)
            i++;
        }
        return i;                   
    }
    public int getFifthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=30&&homeless.getAge()<40)
            i++;
        }
        return i;                   
    }
    public int getSixthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=40&&homeless.getAge()<50)
            i++;
        }
        return i;                   
    }
    public int getSeventhStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=50&&homeless.getAge()<60)
            i++;
        }
        return i;                   
    }
    public int getEighthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=60&&homeless.getAge()<70)
            i++;
        }
        return i;                   
    }
    public int getNinthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=70&&homeless.getAge()<80)
            i++;
        }
        return i;                   
    }
    public int getTenthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=80&&homeless.getAge()<90)
            i++;
        }
        return i;                   
    }
    public int getEleventhStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=90&&homeless.getAge()<100)
            i++;
        }
        return i;                   
    }
    public int getTwelfthStagePeopleNumber(){
         int i=0;
         for(Homeless homeless : homelessList){
            if(homeless.getAge()>=100&&homeless.getAge()<110)
            i++;
        }
        return i;                   
    }
}
