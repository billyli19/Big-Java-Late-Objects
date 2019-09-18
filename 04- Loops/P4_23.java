
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class P4_23 {

    public static void main(String args[]) {

        System.out.println("If a drunk person at location (x,y) randomyl travels various directions in a grid city. ");
        
        Random rand = new Random();
        int x = 0;
        int y = 0;
        double distance = 0;
        
        for(int decisionCounter = 0; decisionCounter < 100; decisionCounter++){
            int direction = rand.nextInt(4) + 1;
            
            switch(direction){
                case 1:
                    x = x + 1;
                    break;
                case 2:
                    x = x - 1;
                    break;
                case 3:
                    y = y + 1;
                    break;
                case 4:
                    y = y -1;
                    break;
            }
        }
        
        distance = Math.sqrt((((x * x) + (y*y))));
        
        System.out.println("If the city blockes are 1000 meter by 1000 miles then the drunk person has traveled: " + distance);
        System.out.println(" meters away from his original location by walking 100 meters");
    }
}
