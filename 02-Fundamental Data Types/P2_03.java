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
public class P2_03 {
    public static void main(String[] args){
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);
        
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("fourth power: " + fourthPower);
        sc.close();
    }
}
