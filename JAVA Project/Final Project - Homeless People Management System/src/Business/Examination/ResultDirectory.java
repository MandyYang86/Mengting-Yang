/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Examination;

import java.util.ArrayList;

/**
 *
 * @author butte
 */
public class ResultDirectory {
    private ArrayList<ExaminationResult> resultList;
    
    public ResultDirectory(){
        resultList = new ArrayList<>();
    }

    public ArrayList<ExaminationResult> getResultList() {
        return resultList;
    }
    
    public ExaminationResult addResult(){
        ExaminationResult examinationResult = new ExaminationResult();
        resultList.add(examinationResult);
        return examinationResult;
    }
    
    
}
