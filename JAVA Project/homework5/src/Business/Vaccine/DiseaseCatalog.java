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
public class DiseaseCatalog {

    private ArrayList<Disease> diseaseList;

    public DiseaseCatalog() {
        diseaseList = new ArrayList();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public Disease createDisease(String name) {
        Disease disease = new Disease();
        disease.setName(name);
        diseaseList.add(disease);
        return disease;

    }

}
