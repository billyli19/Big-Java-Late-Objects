/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_05;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        String fileName = "phonebook";

        LookUpTable names = new LookUpTable(1050);

        try{
            FileReader sc = new FileReader("src\\P14_05\\" + fileName + ".txt");
            names.read(new BufferedReader(sc));
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        LookUpTable numbers = new LookUpTable(1050);
        numbers.reverse(names);

        boolean more = true;

        while (more) {
            String cmd = JOptionPane.showInputDialog("Look up N)ame, P)hone, Q)uit?");

            if (cmd == null) {
                more = false;
            } else if (cmd.equalsIgnoreCase("Q")) {
                more = false;
            } else if (cmd.equalsIgnoreCase("N")) {
                String n = JOptionPane.showInputDialog("Enter name: ");
                System.out.println("phone number: " + names.lookup(n));
            } else if (cmd.equalsIgnoreCase("P")) {
                String n = JOptionPane.showInputDialog("Enter phone number: ");
                System.out.println("Name: " + numbers.lookup(n));
            }
        }
        System.exit(0);
    }
}
