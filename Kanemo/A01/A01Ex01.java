package Kanemo.A01;

import java.util.Scanner;

public class A01Ex01 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier nombre :");
        double dMb1 = sc.nextDouble();

        System.out.print("Entrez le deuxième nombre :");
        double dMb2 = sc.nextDouble();

        if(dMb1 > dMb2){
            System.out.print("Le plus grand nombre est :" + dMb1);
        }
        else if (dMb1 < dMb2) {
            System.out.print("Le plus grand nombre est :" + dMb2);
        }
        else{
            System.out.print("Les deux nombres sont égaux.");
        }

        sc.close();
    }
}
