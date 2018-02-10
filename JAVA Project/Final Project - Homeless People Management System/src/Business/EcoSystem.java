/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.NetWork;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import java.util.ArrayList;

/**
 *
 * @author mengtingyang
 */
public class EcoSystem extends Organization {
    private static EcoSystem business;
   
    private ArrayList<NetWork> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<NetWork> getNetworkList() {
        return networkList;
    }

    public NetWork createAndAddNetwork() {
        NetWork network = new NetWork();
        networkList.add(network);
        return network;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

    
}
