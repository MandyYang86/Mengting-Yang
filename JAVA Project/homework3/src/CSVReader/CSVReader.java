/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVReader;

import TravelAngency.AirLinerFlights;
import TravelAngency.AirPlanes;
import TravelAngency.MasterSchedule;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.lang.model.element.Element;

/**
 *
 * @author mengtingyang
 */
public class CSVReader {
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String csvFile = "airPlanesData.csv";
        String csvFileAirLiner = "airLinerFlightsData.csv";
        File myFile = new File("airLinerFlightsData.csv");
        //System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        
        MasterSchedule masterSchedule = new MasterSchedule();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airPlanesElement = line.split(cvsSplitBy);
                AirPlanes airPlanes =masterSchedule.addAirplanes();
                
                String serialNumber = airPlanesElement[0];
                String passengerCapacity = airPlanesElement[1];
                int manufactureYear = Integer.parseInt(airPlanesElement[2]);
                
                airPlanes.setManufactureYear(manufactureYear);
                airPlanes.setPassengerCapacity(passengerCapacity);
                airPlanes.setSerialNumber(serialNumber);
                
                
      
               
            }
            int i=1;
            for (AirPlanes a : masterSchedule.getAirPlaneList()) {
                //System.out.println(i+":SerialNumber-->"+a.getSerialNumber()+"\tPassengerCapacity-->"+a.getPassengerCapacity()+"\tManufactureYear-->"+a.getManufactureYear());
                i++;}
    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
        
         MasterSchedule masterScheduleAirLiner = new MasterSchedule();
         try {

            br = new BufferedReader(new FileReader(csvFileAirLiner));
            while ((line = br.readLine()) != null) {

                // use comma as separator
               
                String[] airLinersElement = line.split(cvsSplitBy);
                AirLinerFlights airLinerFlights =masterScheduleAirLiner.addAirLinerFlights();
                
                String airLiners = airLinersElement[0];
                String flightNumber = airLinersElement[1];
                String departureAirport = airLinersElement[2];
                String arriveAirport = airLinersElement[3];
                int pricePerSeat = Integer.parseInt(airLinersElement[4]);
                
                airLinerFlights.setAirLiners(airLiners);
                airLinerFlights.setDepartureAirport(departureAirport);
                airLinerFlights.setArriveAirport(arriveAirport);
                airLinerFlights.setFlightNumber(flightNumber);
                airLinerFlights.setPricePerSeat(pricePerSeat);
                
                 //calculate revenue per flight
       
                /*String[] flightNumers = line.split(cvsSplitBy);
                String flightNumberCol = flightNumers[1];
                airLinerFlights.setFlightNumber(flightNumberCol);
                List<String> flightNumersArray = Arrays.asList(flightNumers);*/
         
         }
             ArrayList<String> AA193list = new ArrayList<String>();
             ArrayList<String> AA194list = new ArrayList<String>();
             ArrayList<Integer> AAprice = new ArrayList<Integer>();
             
             ArrayList<String> AC551list = new ArrayList<String>();
             ArrayList<String> AC561list = new ArrayList<String>();
             ArrayList<Integer> ACprice = new ArrayList<Integer>();
             
             ArrayList<String> CA888list = new ArrayList<String>();
             ArrayList<String> CA988list = new ArrayList<String>();
             ArrayList<String> CA989list = new ArrayList<String>();
             ArrayList<Integer> CAprice = new ArrayList<Integer>();
             
             ArrayList<String> DL007list = new ArrayList<String>();
             ArrayList<String> DL008list = new ArrayList<String>();
             ArrayList<Integer> DLprice = new ArrayList<Integer>();
             
             ArrayList<String> UA188list = new ArrayList<String>();
             ArrayList<String> UA198list = new ArrayList<String>();
             ArrayList<Integer> UAprice = new ArrayList<Integer>();
             
             ArrayList<String> AirChinalist = new ArrayList<String>();
             ArrayList<String> AirCanadalist = new ArrayList<String>();
             ArrayList<String> AmericanAirlineslist = new ArrayList<String>();
             ArrayList<String> DeltaAirlineslist = new ArrayList<String>();
             ArrayList<String> UnitedAirlineslist = new ArrayList<String>();
             
             
             
            int k=1;
            for (AirLinerFlights al : masterScheduleAirLiner.getAirLinerFlightsList()) {
                //System.out.println(k+":AirLiners-->"+al.getAirLiners()+"\tFlightNumber-->"+al.getFlightNumber()+"\tDepartureAirport-->"
                        //+al.getDepartureAirport()+"\tArriveAirport-->"+al.getArriveAirport()+"\tPricePerSeat-->"+al.getPricePerSeat());
                k++;
                     if("AA193".equals(al.getFlightNumber()))
                     {
                          AA193list.add(al.getFlightNumber());
                          AAprice.add(al.getPricePerSeat());
                     }
                     
                     if("AA194".equals(al.getFlightNumber()))
                     {
                          AA194list.add(al.getFlightNumber());
                     }
                     
                     
                      if("AC551".equals(al.getFlightNumber()))
                     {
                          AC551list.add(al.getFlightNumber());
                          ACprice.add(al.getPricePerSeat());
                     }
                      
                      if("AC561".equals(al.getFlightNumber()))
                     {
                          AC561list.add(al.getFlightNumber());
                     }
                      
                      
                       if("CA888".equals(al.getFlightNumber()))
                     {
                          CA888list.add(al.getFlightNumber());
                          CAprice.add(al.getPricePerSeat());
                     }
                       
                        if("CA988".equals(al.getFlightNumber()))
                     {
                          CA988list.add(al.getFlightNumber());
                     }
                        
                         if("CA989".equals(al.getFlightNumber()))
                     {
                          CA989list.add(al.getFlightNumber());
                     }
                         
                         
                         if("DL007".equals(al.getFlightNumber()))
                     {
                          DL007list.add(al.getFlightNumber());
                          DLprice.add(al.getPricePerSeat());
                     }
                       
                        if("DL008".equals(al.getFlightNumber()))
                     {
                          DL008list.add(al.getFlightNumber());
                     }
                      
                        
                        if("UA188".equals(al.getFlightNumber()))
                     {
                          UA188list.add(al.getFlightNumber());
                          UAprice.add(al.getPricePerSeat());
                     }
                       
                        if("UA198".equals(al.getFlightNumber()))
                     {
                          UA198list.add(al.getFlightNumber());
                     }
                      
                        
                        
                        
                        if("AirCanada".equals(al.getAirLiners()))
                     {
                          AirCanadalist.add(al.getAirLiners());
                     }
                     
                        if("AirChina".equals(al.getAirLiners()))
                     {
                          AirChinalist.add(al.getAirLiners());
                     }
                        
                        if("AmericanAirlines".equals(al.getAirLiners()))
                     {
                          AmericanAirlineslist.add(al.getAirLiners());
                     }
                        
                        if("DeltaAirLines".equals(al.getAirLiners()))
                     {
                          DeltaAirlineslist.add(al.getAirLiners());
                     }
                     
                        if("UnitedAirlines".equals(al.getAirLiners()))
                     {
                          UnitedAirlineslist.add(al.getAirLiners());
                     }
                        
                        
                        
            }
            int aaprice=AAprice.get(1);
            int acprice=ACprice.get(1);
            int caprice=CAprice.get(1);
            int dlprice=DLprice.get(1);
            int uaprice=UAprice.get(1);
            
            int flaa193= AA193list.size();
            System.out.println("The number of Flight AA193 is\t"+flaa193);
            System.out.println("The price of Flight AA193 is\t"+aaprice+"$");
            System.out.println("The Total Revenue of Flight AA193 is\t"+flaa193*aaprice+"$");
       
            int flaa194= AA194list.size();
            System.out.println("The number of Flight AA194 is\t"+flaa194);
            System.out.println("The price of Flight AA194 is\t"+aaprice+"$");
            System.out.println("The Total Revenue of Flight AA194 is\t"+flaa194*aaprice+"$");
            
            int flac551= AC551list.size();
            System.out.println("The number of Flight AC551 is\t"+flac551);
            System.out.println("The price of Flight AC551 is\t"+acprice+"$");
            System.out.println("The Total Revenue of Flight AC551 is\t"+flac551*acprice+"$");
            
            int flac561= AC561list.size();
            System.out.println("The number of Flight AC561 is\t"+flac561);
            System.out.println("The price of Flight AC561 is\t"+acprice+"$");
            System.out.println("The Total Revenue of Flight AC561 is\t"+flac561*acprice+"$");
            
            int flca888= CA888list.size();
            System.out.println("The number of Flight CA888 is\t"+flca888);
            System.out.println("The price of Flight CA888 is\t"+caprice+"$");
            System.out.println("The Total Revenue of Flight CA888 is\t"+flca888*caprice+"$");
            
            int flca988= CA988list.size();
            System.out.println("The number of Flight CA988 is\t"+flca988);
            System.out.println("The price of Flight CA988 is\t"+caprice+"$");
            System.out.println("The Total Revenue of Flight CA988 is\t"+flca988*caprice+"$");
            
            int flca989= CA989list.size();
            System.out.println("The number of Flight CA989 is\t"+flca989);
            System.out.println("The price of Flight CA989 is\t"+caprice+"$");
            System.out.println("The Total Revenue of Flight CA989 is\t"+flca989*caprice+"$");
            
            int fldl007= DL007list.size();
            System.out.println("The number of Flight DL007 is\t"+fldl007);
            System.out.println("The price of Flight DL007 is\t"+dlprice+"$");
            System.out.println("The Total Revenue of Flight DL007 is\t"+fldl007*dlprice+"$");
            
            int fldl008= DL008list.size();
            System.out.println("The number of Flight DL008 is\t"+fldl008);
            System.out.println("The price of Flight DL008 is\t"+dlprice+"$");
            System.out.println("The Total Revenue of Flight DL008 is\t"+fldl008*dlprice+"$");
            
            int flua188= UA188list.size();
            System.out.println("The number of Flight UA188 is\t"+flua188);
            System.out.println("The price of Flight UA188 is\t"+uaprice+"$");
            System.out.println("The Total Revenue of Flight UA188 is\t"+flua188*uaprice+"$");
            
            int flua198= UA198list.size();
            System.out.println("The number of Flight UA198 is\t"+flua198);
            System.out.println("The price of Flight UA198 is\t"+uaprice+"$");
            System.out.println("The Total Revenue of Flight UA198 is\t"+flua198*uaprice+"$");
            
            
            int alAC= AirCanadalist.size();
            System.out.println("The number of AirCanada Airliner is\t"+alAC);
            System.out.println("The price of AirCanada Airliner is\t"+acprice+"$");
            System.out.println("The Total Revenue of AirCanada Airliner  is\t"+alAC*uaprice+"$");
            
            int alCA= AirChinalist.size();
            System.out.println("The number of AirChina Airliner is\t"+alCA);
            System.out.println("The price of AirChina Airliner is\t"+caprice+"$");
            System.out.println("The Total Revenue of AirChina Airliner  is\t"+alCA*caprice+"$");
            
            int alAA= AmericanAirlineslist.size();
            System.out.println("The number of AmericanAirlines Airliner is\t"+alAA);
            System.out.println("The price of AmericanAirlines Airliner is\t"+aaprice+"$");
            System.out.println("The Total Revenue of AmericanAirlines Airliner  is\t"+alAA*aaprice+"$");
            
            int alDA= DeltaAirlineslist.size();
            System.out.println("The number of DeltaAirlines Airliner is\t"+alDA);
            System.out.println("The price of DeltaAirlines Airliner is\t"+dlprice+"$");
            System.out.println("The Total Revenue of DeltaAirlines Airliner  is\t"+alDA*dlprice+"$");
            
            int alUA= UnitedAirlineslist.size();
            System.out.println("The number of UnitedAirlines Airliner is\t"+alUA);
            System.out.println("The price of UnitedAirlines Airliner is\t"+uaprice+"$");
            System.out.println("The Total Revenue of UnitedAirliness Airliner  is\t"+alUA*uaprice+"$");
            
            int totalRevenue=alUA*uaprice+alDA*dlprice+alAA*aaprice+alCA*caprice+alAC*uaprice;
            System.out.println("The Total Revenue of all flights by all airlines is\t"+totalRevenue+"$");
            
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
         }
     }
}






