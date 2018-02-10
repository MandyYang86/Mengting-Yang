/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author 84690
 */
public class VaccineDirectory {
    private ArrayList<Vaccine> vaccineDirectory;
    public VaccineDirectory(){
        vaccineDirectory = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<Vaccine> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }
     public Vaccine addVaccine(){
        Vaccine vaccine = new Vaccine();
        vaccineDirectory.add(vaccine);
        return vaccine;
    }
}
