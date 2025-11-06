package Kanemo.A01;

import java.util.Scanner;

public class A01Ex04 {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Rentrez votre note :");
    double dNote = sc.nextDouble();
    if (dNote <60) {
        System.out.println("Échec");
    }
    else{
        System.out.println("Réussite");
    }
    sc.close();
}

}
