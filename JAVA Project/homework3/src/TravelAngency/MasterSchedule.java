/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAngency;

import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class MasterSchedule {
    ArrayList<AirPlanes> airPlaneList;
     ArrayList<AirLinerFlights> airLinerFlightsList;

    public ArrayList<AirPlanes> getAirPlaneList() {
        return airPlaneList;
    }

    public void setAirPlaneList(ArrayList<AirPlanes> airPlaneList) {
        this.airPlaneList = airPlaneList;
    }

    public ArrayList<AirLinerFlights> getAirLinerFlightsList() {
        return airLinerFlightsList;
    }

    public void setAirLinerFlightsList(ArrayList<AirLinerFlights> airLinerFlightsList) {
        this.airLinerFlightsList = airLinerFlightsList;
    }
     
     public MasterSchedule() {
        this.airPlaneList = new ArrayList<>();
        this.airLinerFlightsList = new ArrayList<>();
    }
     
    public AirPlanes addAirplanes() {
       AirPlanes airplanes = new AirPlanes();
        airPlaneList.add(airplanes);
        return airplanes; 
    }
    
    public AirLinerFlights addAirLinerFlights() {
       AirLinerFlights airlinerflights = new AirLinerFlights();
       airLinerFlightsList.add(airlinerflights);
       return airlinerflights; 
    }
}
