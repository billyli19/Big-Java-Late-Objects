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
public class Square {

    private int width;

    public Square(int aWidth) {
        width = aWidth;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        if (width == 1) {
            return 1;
        } else {
            Square square = new Square(width - 1);
            int smallerArea = square.getArea();
            return smallerArea + width + width - 1;
        }
    }

}
