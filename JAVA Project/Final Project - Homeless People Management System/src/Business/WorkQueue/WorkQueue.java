/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Disease.Disease;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author mengtingyang
 */
public class WorkQueue {
      private ArrayList<WorkRequest> workRequestList;
      private static final int AGELIMIT = 11;
      Map<Disease, Integer> allMap;
      Map<Disease, Integer> manMap;
      Map<Disease, Integer> womanMap;
      Map<Disease, Integer>[] ageMaps;
      
      

    public Map<Disease, Integer> getAllMap() {
        return allMap;
    }

    public Map<Disease, Integer> getManMap() {
        return manMap;
    }

    public Map<Disease, Integer> getWomanMap() {
        return womanMap;
    }

    public Map<Disease, Integer>[] getAgeMaps() {
        return ageMaps;
    }

    public WorkQueue() {
        workRequestList = new ArrayList<>();
        allMap = new HashMap<>();
        manMap = new HashMap<>();
        womanMap = new HashMap<>();
        ageMaps = new HashMap[AGELIMIT];
        for (int i = 0 ; i < AGELIMIT ; i++) {
            ageMaps[i] = new HashMap<>();
        }
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
     private void whatTheFuck() {
        allMap = new HashMap<>();
        manMap = new HashMap<>();
        womanMap = new HashMap<>();
        ageMaps = new HashMap[AGELIMIT];
        for (int i = 0 ; i < AGELIMIT ; i++) {
            ageMaps[i] = new HashMap<>();
        }
    }
    public void niubility() {
        whatTheFuck();
        for (WorkRequest wq : this.getWorkRequestList()) {
            if (wq instanceof WorkRequestPEToLab) {
                WorkRequestPEToLab temp = (WorkRequestPEToLab) wq;
                Disease disease = temp.getHomeless().getExaminationResult().getDisease();
                allMap.put(disease, allMap.getOrDefault(disease, 0)+1);
                if (temp.getHomeless().getGender().equals("man")) {
                    manMap.put(disease, manMap.getOrDefault(disease, 0)+1);
                } else {
                    womanMap.put(disease, womanMap.getOrDefault(disease, 0)+1);
                }
                int ageGroup = temp.getHomeless().getAge()/10;
                ageMaps[ageGroup].put(disease, ageMaps[ageGroup].getOrDefault(disease, 0)+1);
            }
        }
    }
    public List<String> getTopK(Map<Disease, Integer> map, int k) {
        PriorityQueue<Disease> heap = new PriorityQueue<>((a,b) -> (map.get(b) - map.get(a)));

        for (Disease s : map.keySet()) {
            heap.offer(s);
        }
        List<String> results = new ArrayList<>();
        while (k-- > 0) {
            if (heap.size() > 0) {
               results.add(heap.poll().getName());
            }
        }
        return results;
    }
}
