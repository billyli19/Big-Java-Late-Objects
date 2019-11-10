/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_14;

import java.util.*;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Canada", 37_411_047, 9_093_510));
        countries.add(new Country("China", 1_433_783_686, 9_388_211));
        countries.add(new Country("Russia", 145_872_256, 16_376_870));
        countries.add(new Country("USA", 329_064_917, 9_147_420));
        countries.add(new Country("Japan", 126_860_301, 364_555));
        countries.add(new Country("Turkey", 83_429_615, 769_630));

        System.out.println("Before sort: ");
        System.out.printf("%-20s%-15s%-18s%n", "Country", "Area", "Population");
        for (Country C : countries) {
            System.out.printf("%-20s%,-15d", C.getName(), C.getArea());
            System.out.printf("%,-15d%n", C.getPopulation());
        }
        System.out.println();

        Collections.sort(countries, (first, second) -> second.getArea() - first.getArea());
        System.out.println("Sorted by area: ");
        System.out.printf("%-20s%-15s%-18s%n", "Country", "Area", "Population");

        for (Country C : countries) {
            System.out.printf("%-20s%,-15d", C.getName(), C.getArea());
            System.out.printf("%,-15d%n", C.getPopulation());
        }
        System.out.println();

        Collections.sort(countries, (first, second) -> second.getPopulation() - first.getPopulation());
        System.out.println("Sorted by population: ");
        System.out.printf("%-20s%-15s%-18s%n", "Country", "Area", "Population");

        for (Country C : countries) {
            System.out.printf("%-20s%,-15d", C.getName(), C.getArea());
            System.out.printf("%,-15d%n", C.getPopulation());
        }
    }
}
