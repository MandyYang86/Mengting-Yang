/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Homeless;

import Business.Examination.ExaminationResult;

/**
 *
 * @author butte
 */
public class Homeless {
    private String name;
    private int ID;
    private static int count = 1;
    private String status;
    private String Gender;
    private int Age;
    private String iconPath;
    private String emailAddress;
    
    private ExaminationResult examinationResult;

    public ExaminationResult getExaminationResult() {
        return examinationResult;
    }

    public void setExaminationResult(ExaminationResult examinationResult) {
        this.examinationResult = examinationResult;
    }
    
    public Homeless(){
        ID = count;
        count++;
//        examinationResult = new ExaminationResult();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Homeless.count = count;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
    
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
