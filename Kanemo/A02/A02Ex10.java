package Kanemo.A02;

import java.util.Scanner;

public class A02Ex10 {
public class PlusGrandNombre {

    // 🔹 Méthode qui retourne le plus grand entre deux entiers
    public static int plusGrand(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // ou plus simplement : return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez le premier nombre entier : ");
        int nb1 = sc.nextInt();
        
        System.out.print("Entrez le deuxième nombre entier : ");
        int nb2 = sc.nextInt();
        
        // Appel de la méthode
        int resultat = plusGrand(nb1, nb2);
        
        // Affichage du résultat
        System.out.println("Le plus grand des deux nombres est : " + resultat);
        
        sc.close();
    }
}

}
