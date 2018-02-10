/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author mengtingyang
 */
public class Vaccine {

    private String name;
    private int vaccineNumber;
    private int id;
    private static int count = 1;
    private Disease disease;

    public Vaccine() {
        id = count;
        count++;
        disease=new Disease();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVaccineNumber() {
        return vaccineNumber;
    }

    public void setVaccineNumber(int vaccineNumber) {
        this.vaccineNumber = vaccineNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    
    @Override
    public String toString() {
        return name;
    }
}
