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
public class P3_27 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       final int THRIRTY_ONE = 31;
       final int THIRTY = 30;
       int days = 0;
       int month;
       
       System.out.print("Enter a month (1 for January, 2 for February, 3 for March etc): ");
       month = sc.nextInt();
       
       if(month == 1){
           days = THRIRTY_ONE;
       } else if(month == 2){
           System.out.println("28 or 29 days");
       } else if(month == 3){
           days = THRIRTY_ONE;
       } else if(month == 4){
           days = THIRTY;
       } else if( month == 5){
           days = THRIRTY_ONE;
       } else if(month == 6){
           days = THIRTY;
       } else if(month == 7){
           days = THRIRTY_ONE;
       } else if(month == 8){
           days = THRIRTY_ONE;
       } else if (month == 9){
           days = THIRTY;
       } else if(month == 10){
           days = THRIRTY_ONE;
       } else if(month == 11){
           days = THIRTY;
       } else if(month == 12){
           days = THRIRTY_ONE;
       } else {
           System.out.println("ERROR: month not available");
       }
       
       System.out.println(days + " days");
       sc.close();
   } 
}
