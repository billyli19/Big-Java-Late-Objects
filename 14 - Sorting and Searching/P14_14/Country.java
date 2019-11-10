/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_14;

/**
 *
 * @author billy
 */
public class Country {

    private String name;
    private int population;
    private int area;

    public Country(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }
    
    public String toString(){
        return "Country[name = " + name + ", population = " + population + ",area = " + area + "]";
    }

}
