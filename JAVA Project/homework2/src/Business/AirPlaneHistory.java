/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author mengtingyang
 */
public class AirPlaneHistory {
    private ArrayList<AirPlane> airPlaneHistory;
    
    public AirPlaneHistory()
    {
    airPlaneHistory=new ArrayList<AirPlane>();
    }

    public ArrayList<AirPlane> getAirPlaneHistory() {
        return airPlaneHistory;
    }

    public void setAirPlaneHistory(ArrayList<AirPlane> airPlaneHistory) {
        this.airPlaneHistory = airPlaneHistory;
    }
    
     public AirPlane addPlanes()
     {
     AirPlane ap=new AirPlane();
     airPlaneHistory.add(ap);
     return ap;
     }
     
      public void deleteAirPlane(AirPlane a)
      {
        airPlaneHistory.remove(a);
      }
      
      public void updateAva(AirPlane a)
      {
         AirPlane ap=new AirPlane();
         if(ap.getWhetherAvailable()=="YES")
             ap.setWhetherAvailable("No");
           if(ap.getWhetherAvailable()=="No")
               ap.setWhetherAvailable("Yes");           
      }
      
      
      
     
}
