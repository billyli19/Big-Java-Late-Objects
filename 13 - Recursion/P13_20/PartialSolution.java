/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_20;

/**
 *
 * @author billy
 */
public interface PartialSolution {
    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;
    
    public int examine();
    public PartialSolution[] extend();
}
