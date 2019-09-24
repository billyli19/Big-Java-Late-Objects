
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
public class P5_09 {
    public static double sphereVolume(double r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        r = sc.nextDouble();
        
        double volume = ((4.0/3.0)*(Math.PI)*(Math.pow(r, 3)));     
        System.out.println("Volume of sphere is: " + volume);
        return r;
    }
    
    public static double sphereSurface(double r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        r = sc.nextDouble();
        
        double surface = ((4.0)*(Math.PI)*(Math.pow(r, 2)));
        System.out.println("Surface area of sphere is: " + surface);
        return r;
    }
    
    public static double cylinderVolume(double r, double h){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        r = sc.nextDouble();
        System.out.println("Please enter a height: ");
        h = sc.nextDouble();
        
        double volume = ((Math.PI)*(Math.pow(r, 2))*(h));
        System.out.println("Volume of cylinder is: " + volume);
        return r;
    }
    
    public static double cylinderSurface(double r, double h){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        r = sc.nextDouble();
        System.out.println("Please enter a height: ");
        h = sc.nextDouble();
        
        double surface = ((2)*(Math.PI)*(r)*(h)+(2)*(Math.PI)*(Math.pow(r , 2)));
        System.out.println("Surface area of cylinder is: " + surface);
        return r;
    }
    
    public static double coneVolume(double r, double h){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        r = sc.nextDouble();
        System.out.println("Please enter a height: ");
        h = sc.nextDouble();
        
        double volume = ((Math.PI)*(Math.pow(r, 2))*(h/3.0));
        System.out.println("Volume of cone is: " + volume);
        return r;
    }
    
    public static double coneSurface(double r, double h){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        r = sc.nextDouble();
        System.out.println("Please enter a height: ");
        h = sc.nextDouble();
        
        double surface = ((Math.PI)*(r)*((r)+(Math.sqrt((Math.pow(h,2)+(Math.pow(r, 2)))))));
        System.out.println("Surface of cone is: " + surface);
        return r;
    }
    
    public static void main(String args[]){
        sphereVolume(0);
        sphereSurface(0);
        cylinderVolume(0,0);
        cylinderSurface(0,0);
        coneVolume(0,0);
        coneSurface(0,0);
        
        System.exit(0);
    }
}
