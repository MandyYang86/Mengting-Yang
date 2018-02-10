/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.JComboBox;

/**
 *
 * @author mengtingyang
 */
public class AirPlane {
    private String serialNumber;
    private double timeToTakeOff;
    private String whetherAvailable;
    private String manufactureYear;
    private String manufactures;
    private int numberofSeats;
    private String whetherExp;
    private double updateTime;
    private String modelNumber;
    private String airPort;

    public String getAirPort() {
        return airPort;
    }

    public void setAirPort(String airPort) {
        this.airPort = airPort;
    }
    
    

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getTimeToTakeOff() {
        return timeToTakeOff;
    }

    public void setTimeToTakeOff(double timeToTakeOff) {
        this.timeToTakeOff = timeToTakeOff;
    }

    public String getWhetherAvailable() {
        return whetherAvailable;
    }

    public void setWhetherAvailable(String whetherAvailable) {
        this.whetherAvailable = whetherAvailable;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public int getNumberofSeats() {
        return numberofSeats;
    }

    public void setNumberofSeats(int numberofSeats) {
        this.numberofSeats = numberofSeats;
    }

    public String getWhetherExp() {
        return whetherExp;
    }

    public void setWhetherExp(String whetherExp) {
        this.whetherExp = whetherExp;
    }

   

    public double getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(double updateTime) {
        this.updateTime = updateTime;
    }
    
  @Override
  public String toString()
  {
  return this.serialNumber;
  
  }

    
    
}
