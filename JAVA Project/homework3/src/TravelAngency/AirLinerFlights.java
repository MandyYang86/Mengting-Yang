/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAngency;

/**
 *
 * @author mengtingyang
 */
public class AirLinerFlights {
    String airLiners;
    String flightNumber;
    String departureAirport;
    String arriveAirport;
    int pricePerSeat;
    
    private AirPlanes airPlanes;
    private CustomerDirectory customerDirectory;

    public String getAirLiners() {
        return airLiners;
    }

    public void setAirLiners(String airLiners) {
        this.airLiners = airLiners;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport;
    }

    public int getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(int pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public AirPlanes getAirPlanes() {
        return airPlanes;
    }

    public void setAirPlanes(AirPlanes airPlanes) {
        this.airPlanes = airPlanes;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
}
