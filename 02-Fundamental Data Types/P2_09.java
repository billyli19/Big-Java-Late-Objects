
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
public class P2_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billValue;
        int quarterValue;
        int itemPrice;
        int valueInPennies;
        int changeInPennies;
        int dollarCoins;
        int quarterCoins;
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        System.out.println("Enter item price in pennies: ");
        itemPrice = sc.nextInt();
        System.out.println("Enter bill value (1 = $1 bill, 5 = $5 bill, etc):");
        billValue = sc.nextInt();
        System.out.println("Enter quarter value (1 = $0,25, 2 = $0,50, etc):");
        quarterValue = sc.nextInt();
        sc.close();

        valueInPennies = PENNIES_PER_DOLLAR * billValue + PENNIES_PER_QUARTER * quarterValue;
        changeInPennies = valueInPennies - itemPrice;

        dollarCoins = changeInPennies / PENNIES_PER_DOLLAR;
        changeInPennies = changeInPennies % PENNIES_PER_DOLLAR;
        quarterCoins = changeInPennies / PENNIES_PER_QUARTER;
        
        if(valueInPennies < itemPrice){
            System.out.println("Not enough amount");
        } else {
            System.out.printf("Dollar coins: %6d \n", dollarCoins);
        System.out.printf("Quarters:     %6d \n", quarterCoins);
        }
    }
}
