/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_10;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @author billy
 */
public class Polygon {
    private ArrayList<Point2D.Double> corners;
    
    public Polygon(){
        corners = new ArrayList<>();
    }
    
    public void add(Point2D.Double p){
        corners.add(p);
    }
    
    public double getArea(){
        double area = Math.abs(corners.get(0).getX() * corners.get(1).getY() + 
                               corners.get(1).getX() * corners.get(2).getY() +
                               corners.get(2).getX() * corners.get(0).getY() -
                               corners.get(0).getY() * corners.get(1).getY() -
                               corners.get(1).getX() * corners.get(2).getY() -
                               corners.get(2).getX() * corners.get(0).getY()) / 2;
        
        if(corners.size() == 3){
            return 0;
        } else {
            area += area;
            
            corners.remove(0);
            
            return area + getArea();
        }
    }
}
