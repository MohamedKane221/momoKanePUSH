package Kanemo.A02;

import java.util.Scanner;

public class A02Ex02 {
    public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Un mot :");
     String sMots = sc.nextLine();
    
     int iNbcharactere = sMots.length();
     System.out.println("Votre phrase contient ce nombre de charactère :" + iNbcharactere);
     sc.close();
    }
}
