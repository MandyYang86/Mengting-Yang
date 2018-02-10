/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelters;

/**
 *
 * @author mengtingyang
 */
public class Shelters {
    private String sheltersName;
    private int sheleterSpaceNumber;
    private String sheleterStatus;
    private SheltersType sheltersType;

//    public Shelters(String sheltersName,int sheleterSpaceNumber,String sheleterStatus,SheltersType sheltersType) {
//        this.sheleterSpaceNumber=sheleterSpaceNumber;
//        this.sheleterStatus=sheleterStatus;
//        this.sheltersName=sheltersName;
//        this.sheltersType=sheltersType;
//    }
//    
     public Shelters(SheltersType sheltersType) {
        this.sheltersType=sheltersType;
    }
    
    public enum SheltersType {
        University("University"),
        Church("Church"),
        PublicLibrary("Public Library"),
        OtherPublicOrganization("Other Public Organization");
        
        private String value;

        private SheltersType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
          @Override
        public String toString() {
            return value;
        }
    }

    public String getSheltersName() {
        return sheltersName;
    }

    public void setSheltersName(String sheltersName) {
        this.sheltersName = sheltersName;
    }

    public int getSheleterSpaceNumber() {
        return sheleterSpaceNumber;
    }

    public void setSheleterSpaceNumber(int sheleterSpaceNumber) {
        this.sheleterSpaceNumber = sheleterSpaceNumber;
    }

    public String getSheleterStatus() {
        return sheleterStatus;
    }

    public void setSheleterStatus(String sheleterStatus) {
        this.sheleterStatus = sheleterStatus;
    }

    public SheltersType getSheltersType() {
        return sheltersType;
    }

    public void setSheltersType(SheltersType sheltersType) {
        this.sheltersType = sheltersType;
    }

       @Override
    public String toString() {
        return sheltersName;
    }
 
    
    
}
