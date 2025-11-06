package Kanemo.A02;

import java.util.Scanner;

public class A02Ex06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int iNombre;
        int iMax = Integer.MIN_VALUE;  
        int iMin = Integer.MAX_VALUE;  
        int iSomme = 0;
        int iCompteur = 0;

        do {
            System.out.print("Entrez un nombre entier (0 pour terminer) : ");
            iNombre = clavier.nextInt();

            if (iNombre != 0) {  
                
                if (iNombre > iMax) {
                    iMax = iNombre;
                }

                
                if (iNombre < iMin) {
                    iMin = iNombre;
                }

                
                iSomme += iNombre;

               
                iCompteur++;
            }

        } while (iNombre != 0);  

        
        if (iCompteur > 0) {
            double moyenne = (double) iSomme / iCompteur;
            System.out.println("\nLa plus grande valeur est : " + iMax);
            System.out.println("La plus petite valeur est : " + iMin);
            System.out.println("La moyenne des valeurs est : " + moyenne);
        } else {
            System.out.println("Aucune valeur saisie.");
        }

        clavier.close();
    }
}

