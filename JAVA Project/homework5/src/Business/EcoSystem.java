/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.NetWork.NetWork;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.DiseaseCatalog;
import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<NetWork> netWorkList; 
    private VaccineCatalog vaccineCatalog;
    private DiseaseCatalog dieaseCatalog;

    public ArrayList<NetWork> getNetWorkList() {
        return netWorkList;
    }

    public void setNetWorkList(ArrayList<NetWork> netWorkList) {
        this.netWorkList = netWorkList;
    }
    
  public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    public NetWork AddAndCreateNetWork(){
    NetWork netWork=new NetWork();
    netWorkList.add(netWork);
    return netWork;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public DiseaseCatalog getDieaseCatalog() {
        return dieaseCatalog;
    }
    

    private EcoSystem() {
        super(null);
        netWorkList=new ArrayList();
        vaccineCatalog=new VaccineCatalog();
        dieaseCatalog=new DiseaseCatalog();
    }

}
