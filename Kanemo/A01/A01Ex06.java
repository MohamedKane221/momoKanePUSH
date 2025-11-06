package Kanemo.A01;

import java.util.Scanner;

public class A01Ex06 {
public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enrez votre nom :");
            String sNom = sc.nextLine();
            System.out.println("Choisie ton type de plancher :");
            System.out.println("1-Chêne");
            System.out.println("2-Érable");
            System.out.println("3-Pin");
            int iChoixplancher = sc.nextInt();

            if (iChoixplancher == 1) {
               System.out.println("Longeur :");
               double dLongeur = sc.nextDouble();
               System.out.println("Largeur :");
               double dLargeur = sc.nextDouble();
                double dAir = dLongeur * dLargeur;
                double dPrixfinaux = dAir*5;
                System.out.println("Nom client " + sNom);
                System.out.println("surface total " + dAir);
                System.out.println("Prix " + dPrixfinaux);


            }
            else if (iChoixplancher == 2) {
                System.out.println("Longeur :");
               double dLongeur = sc.nextDouble();
               System.out.println("Largeur :");
               double dLargeur = sc.nextDouble();
                double dAir = dLongeur * dLargeur;
                double dPrixfinaux = dAir*12;
                System.out.println("Nom client " + sNom);
                System.out.println("surface total " + dAir);
                System.out.println("Prix " + dPrixfinaux);
            }
            else if (iChoixplancher == 3) {
                System.out.println("Longeur :");
               double dLongeur = sc.nextDouble();
               System.out.println("Largeur :");
               double dLargeur = sc.nextDouble();
                double dAir = dLongeur * dLargeur;
                double dPrixfinaux = dAir*10;
                System.out.println("Nom client " + sNom);
                System.out.println("surface total " + dAir);
                System.out.println("Prix " + dPrixfinaux);
            }
            else{
                System.out.println("Vous n'avez pas choisit le bon type de plancher");
            }
            sc.close();
        }
}
