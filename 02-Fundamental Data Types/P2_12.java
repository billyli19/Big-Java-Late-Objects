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
public class P2_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String drive;
        String path;
        String fileName;
        String extension;
        String file;
        
        System.out.println("Please enter the Drive (e.g: (C)):");
        drive = sc.next();
        System.out.println("Please enter the path (e.g: (\\windows\\System): ");
        path = sc.next();
        System.out.println("Please enter the file name (e.g: (Readme): ");
        fileName = sc.next();
        System.out.println("Please enter the file extension (e.g: (txt): ");
        extension = sc.next();
        
        sc.close();
        
        file = (drive + ":\\" + path + "\\" + fileName + "." + extension);
        System.out.println(file);
    }
}
