/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_01;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        Rectangle rec = new Rectangle(5, 8);
        int area = rec.getArea();
        
        System.out.println("Area: " + area);
        System.out.println("Expcted: " + (rec.getLength() * rec.getWidth()));
    }
}
