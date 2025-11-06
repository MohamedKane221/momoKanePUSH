package Kanemo.A01;

import java.util.Scanner;

public class A01Ex05 {
public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le prix de l'article :");
        double dPrix = sc.nextDouble();
        
        double dReduction = dPrix *0.25;
        double dPrixfinaux = dPrix - dReduction;
        System.out.println("Le prix après réduction est de  :" + dPrixfinaux);
        sc.close();
}

}

