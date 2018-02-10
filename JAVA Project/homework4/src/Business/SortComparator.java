 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Comparator;
//import Business.SalesPerson;

/**
 *
 * @author butte
 */
public class SortComparator implements Comparator<SalesPerson> {
    @Override
    public int compare(SalesPerson sp, SalesPerson sp1){
        return Integer.toString(sp1.getRevenue()).compareTo(Integer.toString(sp.getRevenue()));
                
//        if(o1.revenue<o2.revenue){
//            return o2.revenue - o1.revenue;
//        }
//        return o2.revenue - o1.revenue;
    }
}
