
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
public class P3_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        String degrees;

        System.out.println("Please enter temperature: ");
        temp = sc.nextDouble();

        System.out.println("Please enter (C) for Celcius or (F) for Fahrenheit ");
        degrees = sc.next();

        System.out.println("Water at " + temp + "°" + degrees + " is");

        if (degrees.equalsIgnoreCase("C")) {
            if (temp < 0) {
                System.out.println("solid");
            } else if(temp > 0 && temp < 100){
                System.out.println("liquid");
            } else {
                System.out.println("gaseous");
            }
        }
        else if(degrees.equalsIgnoreCase("F")){
            if(temp <= 32){
                System.out.println("solid");
            } else if( temp > 32 && temp < 212){
                System.out.println("liquid");
            } else {
                System.out.println("gaseous");
            }
        }
        sc.close();
    }
}
