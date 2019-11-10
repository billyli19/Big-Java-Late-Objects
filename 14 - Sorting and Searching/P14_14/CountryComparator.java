/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_14;

import java.util.Comparator;

/**
 *
 * @author billy
 */
public class CountryComparator implements Comparator<Country>{
    public int compare(Country a, Country b){
        return b.getArea() - a.getArea();
    }
}
