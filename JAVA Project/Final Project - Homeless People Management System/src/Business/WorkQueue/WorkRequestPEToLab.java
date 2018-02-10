/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Examination.ExaminationResult;
import Business.Homeless.Homeless;
import java.util.ArrayList;

/**
 *
 * @author butte
 */
public class WorkRequestPEToLab extends WorkRequest{
   private Homeless homeless;
   //private ExaminationResult examinationResult;
   
//   public WorkRequestPEToLab(){
////       homeless = new Homeless();
//      // examinationResult = new  ExaminationResult();
//   }

    public Homeless getHomeless() {
        return homeless;
    }

    public void setHomeless(Homeless homeless) {
        this.homeless = homeless;
    }
   
   
}
