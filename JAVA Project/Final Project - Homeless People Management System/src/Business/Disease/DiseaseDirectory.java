/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author 84690
 */
public class DiseaseDirectory {
    private ArrayList<Disease> diseaseDirectory;
    public DiseaseDirectory(){
        diseaseDirectory = new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseDirectory() {
        return diseaseDirectory;
    }

    public void setDiseaseDirectory(ArrayList<Disease> diseaseDirectory) {
        this.diseaseDirectory = diseaseDirectory;
    }
    public Disease addDisease(){
        Disease disease = new Disease();
        diseaseDirectory.add(disease);
        return disease;
    }
}
