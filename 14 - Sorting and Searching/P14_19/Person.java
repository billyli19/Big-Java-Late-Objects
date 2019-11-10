/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_19;

/**
 *
 * @author billy
 */
import java.util.*;

public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
