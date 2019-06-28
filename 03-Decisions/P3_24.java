
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
public class P3_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unitFrom;
        String unitTo;
        double value;
        double result = 0.0;

        System.out.println("Convert from?: ");
        System.out.println("fl.oz, gal, oz, lb, in, ft, mi");
        unitFrom = sc.next();
        System.out.println("Convert to: ");
        System.out.println("ml, l, g, kg, mm, cm, m, km");
        unitTo = sc.next();
        System.out.println("Value?: ");
        value = sc.nextDouble();

        switch (unitFrom) {
            case "fl.oz":
                if (unitTo.equals("ml")) {
                    result = value * 29.574;
                } else if (unitTo.equals("l")) {
                    result = value / 33.814;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            case "gal":
                if (unitTo.equals("ml")) {
                    result = value * 3785.412;
                } else if (unitTo.equals("l")) {
                    result = value * 3.785;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            case "oz":
                if (unitTo.equals("g")) {
                    result = value * 28.35;
                } else if (unitTo.equals("kg")) {
                    result = value / 35.274;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            case "lb":
                if (unitTo.equals("g")) {
                    result = value * 453.592;
                } else if (unitTo.equals("kg")) {
                    result = value / 2.205;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            case "in":
                if (unitTo.equals("mm")) {
                    result = value * 25.4;
                } else if (unitTo.equals("cm")) {
                    result = value * 2.54;
                } else if (unitTo.equals("m")) {
                    result = value / 39.37;
                } else if (unitTo.equals("km")) {
                    result = value / 39370.079;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            case "ft":
                if (unitTo.equals("mm")) {
                    result = value * 304.8;
                } else if (unitTo.equals("cm")) {
                    result = value * 30.48;
                } else if (unitTo.equals("m")) {
                    result = value / 3.281;
                } else if (unitTo.equals("km")) {
                    result = value / 3280.84;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            case "mi":
                if (unitTo.equals("mm")) {
                    result = value * 1609344;
                } else if (unitTo.equals("cm")) {
                    result = value * 160934.4;
                } else if (unitTo.equals("m")) {
                    result = value * 1609.344;
                } else if (unitTo.equals("km")) {
                    result = value * 1.609344;
                } else {
                    System.out.println("Incompatible conversion");
                }
                break;
            default:
                System.out.println("ERROR: incompatible conversion");

        }
        System.out.println(value + " " + unitFrom + " = " + result + " " + unitTo);
        sc.close();
    }
}
