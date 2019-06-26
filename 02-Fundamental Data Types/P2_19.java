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
public class P2_19 {
    public static void main(String[] args){
        final String MONTH_ONE = "January";
        final String MONTH_TWO = "February";
        final String MONTH_THREE = "March";
        final String MONTH_FOUR = "April";
        final String MONTH_FIVE = "May";
        final String MONTH_SIX = "June";
        final String MONTH_SEVEN = "July";
        final String MONTH_EIGHT = "Augusts";
        final String MONTH_NINE = "September";
        final String MONTH_TEN = "October";
        final String MONTH_ELEVEN = "November";
        final String MONTH_TWELF = "December";
        
        System.out.println("Please enter month number: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        
        switch(month){
            case 1:
                System.out.println(MONTH_ONE);
                break;
            case 2:
                System.out.println(MONTH_TWO);
                break;
            case 3:
                System.out.println(MONTH_THREE);
                break;
            case 4:
                System.out.println(MONTH_FOUR);
                break;
            case 5:
                System.out.println(MONTH_FIVE);
                break;
            case 6:
                System.out.println(MONTH_SIX);
                break;
            case 7:
                System.out.println(MONTH_SEVEN);
                break;
            case 8:
                System.out.println(MONTH_EIGHT);
                break;
            case 9:
                System.out.println(MONTH_NINE);
                break;
            case 10:
                System.out.println(MONTH_TEN);
                break;
            case 11:
                System.out.println(MONTH_ELEVEN);
                break;
            case 12:
                System.out.println(MONTH_TWELF);
                break;
            default:
                System.out.println("Month does not exist");
        }
    }
}
