/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Shelters.ChurchShelter;
import Business.Shelters.OtherPublicOrganizationShelter;
import Business.Shelters.PublicLibraryShelter;
import Business.Shelters.Shelters;
import Business.Shelters.SheltersDirectory;
import Business.Shelters.UniversityShelter;
import java.util.ArrayList;

/**
 *
 * @author 84690
 */
public class AdministrativeWorkRequest extends WorkRequest {

    private String Result;
    //private SheltersDirectory sheltersDirectory;
    private int chooseNumber;
    private ArrayList<Shelters> request_Shelters;

    public AdministrativeWorkRequest() {
        //sheltersDirectory =new SheltersDirectory();
        this.request_Shelters = new ArrayList<>();
    }


    public int getChooseNumber() {
        return chooseNumber;
    }

    public void setChooseNumber(int chooseNumber) {
        this.chooseNumber = chooseNumber;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public ArrayList<Shelters> getRequest_Shelters() {
        return request_Shelters;
    }

    public void setRequest_Shelters(ArrayList<Shelters> request_Shelters) {
        this.request_Shelters = request_Shelters;
    }
    
    

    public Shelters addShelters(String name,int sheleterSpaceNumber,String sheleterStatus,Shelters.SheltersType type) {
        Shelters shelters = null;

        if (type == Shelters.SheltersType.Church) {
           shelters = new ChurchShelter();
           shelters.setSheleterSpaceNumber(sheleterSpaceNumber);
           shelters.setSheleterStatus(sheleterStatus);
           shelters.setSheltersName(name);
           shelters.setSheltersType(type);
            request_Shelters.add(shelters);
        }

        if (type == Shelters.SheltersType.OtherPublicOrganization) {
            shelters = new OtherPublicOrganizationShelter();
            shelters.setSheleterSpaceNumber(sheleterSpaceNumber);
           shelters.setSheleterStatus(sheleterStatus);
           shelters.setSheltersName(name);
           shelters.setSheltersType(type);
            request_Shelters.add(shelters);
        }

        if (type == Shelters.SheltersType.PublicLibrary) {
            shelters = new PublicLibraryShelter();
            shelters.setSheleterSpaceNumber(sheleterSpaceNumber);
           shelters.setSheleterStatus(sheleterStatus);
           shelters.setSheltersName(name);
           shelters.setSheltersType(type);
            request_Shelters.add(shelters);
        }

        if (type == Shelters.SheltersType.University) {
            shelters = new UniversityShelter();
            shelters.setSheleterSpaceNumber(sheleterSpaceNumber);
           shelters.setSheleterStatus(sheleterStatus);
           shelters.setSheltersName(name);
           shelters.setSheltersType(type);
            request_Shelters.add(shelters);
        }
     
//           shelters.setSheleterSpaceNumber(sheleterSpaceNumber);
//           shelters.setSheleterStatus(sheleterStatus);
//           shelters.setSheltersName(sheleterStatus);
//           shelters.setSheltersType(type);
     
        return shelters;
    }
}
