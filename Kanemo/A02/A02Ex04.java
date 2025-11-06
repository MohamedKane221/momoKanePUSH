package Kanemo.A02;

import java.util.Scanner;

public class A02Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNombre;

        do {
            System.out.print("Entrez une valeur comprise entre 0 et 100 : ");
            iNombre = sc.nextInt();

            if (iNombre < 0 || iNombre > 100) {
                System.out.println("Valeur invalide ! Veuillez réessayer.");
            }

        } while (iNombre < 0 || iNombre > 100);

        System.out.println("Valeur acceptée : " + iNombre);

        sc.close();
    }
}

