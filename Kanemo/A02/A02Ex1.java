package Kanemo.A02;

import java.util.Scanner;

public class A02Ex1 {
public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Écrit quelque chose :");
     String sMot = sc.nextLine().toUpperCase();
     System.out.println("le mot en majuscule :" + sMot);
     sc.close();
}
}
