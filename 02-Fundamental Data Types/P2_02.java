/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P2_02 {

    public static void main(String[] args) {
        final double paperLength = 11;
        final double paperWidth = 8.5;

        double perimeter = (2 * paperLength) + (2 * paperWidth);
        double diagonal = Math.sqrt((paperLength * paperLength) + (paperWidth * paperWidth));
        
        System.out.println("The perimeter is : " + perimeter);
        System.out.println("The diagonal is : " + diagonal);

    }
}
