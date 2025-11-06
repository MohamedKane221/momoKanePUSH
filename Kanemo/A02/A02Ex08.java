package Kanemo.A02;

import java.util.Scanner;

public class A02Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mot;
        String premier = null;
        String dernier = null;
        
        System.out.println("Entrez des mots (tapez 'stop' pour terminer) :");
        
        while (true) {
            mot = sc.nextLine();
            
            // Si l'utilisateur entre "stop", on sort de la boucle
            if (mot.equalsIgnoreCase("stop")) {
                break;
            }
            
            // Si c’est le premier mot, on l’assigne aux deux variables
            if (premier == null || dernier == null) {
                premier = mot;
                dernier = mot;
            } else {
                // Comparaison sans tenir compte de la casse
                if (mot.compareToIgnoreCase(premier) < 0) {
                    premier = mot;
                }
                if (mot.compareToIgnoreCase(dernier) > 0) {
                    dernier = mot;
                }
            }
        }
        
        if (premier == null) {
            System.out.println("Aucun mot saisi.");
        } else {
            System.out.println("Premier mot (ordre alphabétique) : " + premier);
            System.out.println("Dernier mot (ordre alphabétique) : " + dernier);
        }
        
        sc.close();
    }
}

