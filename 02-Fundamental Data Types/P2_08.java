/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class P2_08 {

    public static void main(String[] args) {
        System.out.println("Please enter the length of the rectangle");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        System.out.println("Please enter the width of the rectangle");
        double width = sc.nextDouble();
        sc.close();

        double area = (length * width);
        double perimeter = ((2 * length) + (2 * width));
        double diagonal = (Math.sqrt((length * length) + (width * width)));
        
        System.out.println("The area of rectangle with length " + length + " and width " + width + " is " + area);
        System.out.println("The perimeter of rectangle with length " + length + " and width " + width + " is " + perimeter);
        System.out.println("The diagonal of rectangle with length " + length + " and width " + width + " is " + diagonal);
    }
}
