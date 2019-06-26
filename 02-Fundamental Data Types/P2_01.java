/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P2_01 {

    public static void main(String[] args) {
        final double PAPERLENGTH = 11;  //11 inch 
        final double PAPERWIDTH = 8.5;  //8.5 inch

        final double INCHTOMILIMETER = 25.4;    //25.4 milimeter in 1 inch

        double paperLength = PAPERLENGTH * INCHTOMILIMETER;
        double paperWidth = PAPERWIDTH * INCHTOMILIMETER;

        System.out.println("paper with size ( " + PAPERWIDTH + " x " + PAPERLENGTH + " ) inches is ( " + paperWidth + " x " + paperLength + " ) milimeter ");

    }
}
