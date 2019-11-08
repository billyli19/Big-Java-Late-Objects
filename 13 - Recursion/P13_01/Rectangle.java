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
public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle(int aLength, int aWidth){
        length = aLength;
        width = aWidth;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getArea(){
        if(length == 0){
            return 0;
        } else {
            Rectangle square = new Rectangle(length - 1, width);
            int smallerArea = square.getArea();
            return smallerArea + width;
        }
    }
}
