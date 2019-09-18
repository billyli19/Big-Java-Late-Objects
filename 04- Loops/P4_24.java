
import java.util.Random;
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
public class P4_24 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        int user_door, open_door, other_door, prize_door;

        prize_door = generator.nextInt(3) + 1;
        other_door = prize_door;

        System.out.println("*** Welcome to the game show! ***");

        do{
            System.out.println("Select the door (1, 2, or 3): ");
            user_door = scan.nextInt();
        }while(user_door > 3 || user_door < 0);
        do{
            open_door = generator.nextInt(3)+1;
        }while(open_door == prize_door || open_door == user_door);

        System.out.println("\nIn a moment, I will show you where the prize is located,");
        System.out.println("but first I will show you what is behind one of the other doors");
        System.out.println("\nBehind door number " + open_door+ " are goats!");
        System.out.println("You selected door number " + user_door);
        char userReply;
        do{
            System.out.println("\nWould you like to switch your door(y/n)? ");
            userReply = scan.next().charAt(0);
        }while(userReply!='y' && userReply!='n');       

        int user_duplicate = user_door;
        if (userReply == 'y') {
            do{
                user_door = generator.nextInt(3)+1;
            }while(user_door == open_door || user_door == user_duplicate);
        }

        System.out.println("The prize is behind door number: " + prize_door);

        if (user_door == prize_door) {
            System.out.println("Congratulations! You won the prize!");
        } else {
            System.out.println("Sorry. You lost.");
        }
    }
}
