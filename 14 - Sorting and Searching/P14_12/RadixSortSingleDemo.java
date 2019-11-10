package P14_12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author billy
 */
public class RadixSortSingleDemo {
    private ArrayList list = new ArrayList();
    
    public static void main(String args[]){
        RadixSortSingleDemo rsd = new RadixSortSingleDemo();
        
        Integer[] a = {0,123,764,239,588,77,5,55,56,4,999};
        
        int n = 0;
        
        boolean check = true;
        boolean finalcheck = true;
        
        System.out.println("Before sort: " + Arrays.toString(a));
        int count = 0;
        int round = 1;
        
        while(finalcheck){
            check = true;
            while(check){
                for(int i = 0; i < a.length; i++){
                    if(round == 1){
                        n = a[i] % 10;
                    } else if(round == 2){
                        n = a[i] / 10;
                        n = n % 10;
                    } else if(round == 3){
                        n = a[i] / 100;
                        n = n % 10;
                    }
                    if(n == count){
                        rsd.list.add(a[i]);
                    }
                }
                if(count == 9){
                    check = false;
                    count = -1;
                }
                count++;
            }
            a = (Integer[]) (rsd.list.toArray(new Integer[rsd.list.size()]));
            
            System.out.println("Round = " + round + " Array = " + Arrays.toString(a));
            if(round == 3){
                finalcheck = false;
            }
            rsd.list.clear();
            round++;
        }
    }
}
