/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_02;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        Square square = new Square(5);
        int area = square.getArea();

        System.out.println("Area: " + area);
        System.out.println("Expected: " + (square.getWidth() * square.getWidth()));
    }
}
