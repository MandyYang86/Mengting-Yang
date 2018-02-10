/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;
import Business.Enterprise.HospitalEnterprise;
import Business.Shelters.Shelters;
import java.util.ArrayList;
/**
 *
 * @author mengtingyang
 */
public class AppointmentDirectory {
     private ArrayList<Appointment> AppointmentDirectory;


    public AppointmentDirectory() {
        AppointmentDirectory=new ArrayList();
    }

    public ArrayList<Appointment> getAppointmentDirectory() {
        return AppointmentDirectory;
    }

    public void setAppointmentDirectory(ArrayList<Appointment> AppointmentDirectory) {
        this.AppointmentDirectory = AppointmentDirectory;
    }
       public Appointment addAppointment(){
        Appointment appointment = new Appointment();
        AppointmentDirectory.add(appointment);
        return appointment;
    }
       
       public void cancelAppointment(Appointment appointment ){
        AppointmentDirectory.remove(appointment);
    }
       
       
}
