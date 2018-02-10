/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Comparator;

/**
 *
 * @author butte
 */
    public class SortProduct  implements Comparator<Product>  {
        @Override
        public int compare(Product sp, Product sp1){
        return Integer.toString(sp1.getProductRevenue()).compareTo(Integer.toString(sp.getProductRevenue()));
     }
}

