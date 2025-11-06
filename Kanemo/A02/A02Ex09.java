package Kanemo.A02;

import java.util.Scanner;

public class A02Ex09 {

public class CirconferenceCercle {

    
    public static double circonference(int rayon) {
        return 2 * Math.PI * rayon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez le rayon du cercle (nombre entier) : ");
        int rayon = sc.nextInt();
        
        
        double resultat = circonference(rayon);
        
        
        System.out.println("La circonférence du cercle est : " + resultat);
        
        sc.close();
    }
}
}
