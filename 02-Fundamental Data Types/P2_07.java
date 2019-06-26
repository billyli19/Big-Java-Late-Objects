
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class P2_07 {

    public static void main(String[] args) {
        System.out.println("Please enter a radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        sc.close();
        
        double area = ((Math.PI) * (radius*radius));
        double circumference = ((2) * (Math.PI) * (radius));
        double volume = ((4/3) * (Math.PI) * (Math.pow(radius, 3)));
        double surfaceArea = ((4) * (Math.PI) * (radius * radius));
        
        System.out.println("The area of a circle with radius: " + radius + " is " + area);
        System.out.println("The circumference of a circle with radius: " + radius + " is " + circumference);
        System.out.println("The volume of a sphere with radius: " + radius + " is " + volume);
        System.out.println("The surface area of a sphere with radius: " + radius + " is " + surfaceArea);
        
    }
}
