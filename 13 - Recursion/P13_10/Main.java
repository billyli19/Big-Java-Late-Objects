/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_10;

import java.awt.geom.Point2D;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        Polygon p = new Polygon();
        p.add(new Point2D.Double(10, 20));
        p.add(new Point2D.Double(20, 20));
        p.add(new Point2D.Double(20, 20));
        p.add(new Point2D.Double(10, 20));
        
        System.out.println("Area: " + p.getArea());
        System.out.println("Expected: 100");
        
        p = new Polygon();
        for(int i = 0; i < 6; i++){
            p.add(new Point2D.Double(Math.sin(i * Math.PI / 3), Math.cos(i * Math.PI / 3)));
        }
        System.out.println("Area: " + p.getArea());
        System.out.println("Expected: " + 3 * Math.sqrt(3)/2);
    }
}
