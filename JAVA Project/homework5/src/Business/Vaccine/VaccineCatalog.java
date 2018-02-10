/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;


import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class VaccineCatalog {
    private ArrayList<Vaccine> vaccineList;
    private ArrayList<Vaccine> ClinicvaccineList;

    public VaccineCatalog() {
        vaccineList=new ArrayList();
        ClinicvaccineList=new ArrayList();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public ArrayList<Vaccine> getClinicvaccineList() {
        return ClinicvaccineList;
    }
    
    public Vaccine addClinicVaccine(String vaccineName,int number ){
       Vaccine vaccine2=new Vaccine();
       vaccine2.setVaccineNumber(number);
       vaccine2.setName(vaccineName);
       ClinicvaccineList.add(vaccine2);
       return vaccine2;
    }

    
     public Vaccine createVaccine(String name,int number,Disease disease) {
        Vaccine vaccine=new Vaccine();
        vaccine.setName(name);
        vaccine.setVaccineNumber(number);
        vaccine.setDisease(disease);
        vaccineList.add(vaccine);
        return vaccine;
    }
    
    
}
