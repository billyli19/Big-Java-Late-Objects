/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_19;

import java.util.*;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        ArrayList<Person> persons = new ArrayList<>(10);
        
        System.out.println("Enter 10 persons names: ");
        Scanner sc = new Scanner(System.in);
        String name = null;
        int count = 1;
        while ((count <= 10)) {
            name = sc.next();
            persons.add(new Person(name));
            count++;
        }
        sc.close();

        System.out.println("Before sort: ");
        for(Person p : persons){
            System.out.printf("%10s" , p.getName());
        }
        System.out.println();
        
        Collections.sort(persons);
        
        System.out.println("After sort: ");
        for(Person p : persons){
            System.out.printf("%10s" , p.getName());
        }
        
    }
}
