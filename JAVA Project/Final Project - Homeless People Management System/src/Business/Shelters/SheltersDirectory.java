/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelters;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class SheltersDirectory {
     private ArrayList<Shelters> sheltersList;

    public SheltersDirectory() {
        this.sheltersList = new ArrayList<>();
    }

    public ArrayList<Shelters> getSheltersList() {
        return sheltersList;
    }
    
    public Shelters createAndAddShelters(String name,int sheleterSpaceNumber,String sheleterStatus,Shelters.SheltersType type){
    Shelters shelters=null;
    
    if(type==Shelters.SheltersType.Church){
    shelters=new ChurchShelter();
    sheltersList.add(shelters);
    }
    
    if(type==Shelters.SheltersType.OtherPublicOrganization){
    shelters=new OtherPublicOrganizationShelter();
    sheltersList.add(shelters);
    }
    
    if(type==Shelters.SheltersType.PublicLibrary){
    shelters=new PublicLibraryShelter();
    sheltersList.add(shelters);
    }
    
    if(type==Shelters.SheltersType.University){
    shelters=new UniversityShelter();
    sheltersList.add(shelters);
    }
    
     return shelters;
    
    }
     
}
