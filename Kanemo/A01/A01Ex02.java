package Kanemo.A01;

import java.util.Scanner;

public class A01Ex02 {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Entrez votre salaire :");
      double dSalaire = sc.nextDouble();

      System.out.print("Entrez votre nombre d'heure :");
      double dNbHeure = sc.nextDouble();

      double dSommeSalaire = dSalaire * dNbHeure * 2;
      System.out.println("Votre salaire est de :" + dSommeSalaire);
       sc.close();
    }
}
