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
public class SelectionSorter {
    private Coin[] coins;
    
    public SelectionSorter(Coin[] coins){
        this.coins = coins;
    }
    
    public void sort(){
        for(int i = 0; i < coins.length - 1; i++){
            int minPos = minimumPosition(coins, i);
            ArrayUtil.swap(coins, minPos, i);
        }
    }
    
    private static int minimumPosition(Coin[] a, int from){
        int minPos = from;
        for(int i = from + 1; i < a.length; i++){
            if(a[i].getValue() < a[minPos].getValue()){
                minPos = i;
            }
        }
        return minPos;
    }
}
