/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_02;

/**
 *
 * @author billy
 */
public class ArrayUtil {
    public static void swap(Coin[] a, int i, int j){
        Coin temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
