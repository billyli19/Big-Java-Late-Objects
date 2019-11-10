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
public class Coin {
    private double value;
    private String name;
    
    public Coin(double aValue, String aName){
        value = aValue;
        name = aName;
    }
    
    public double getValue(){
        return value;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "\nvalue = " + value + " name = " + name;
    }
}
