package Kanemo.A01;

import java.util.Scanner;

public class A01Ex03 {
public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Quel est votre age :");
     int iAge1 = sc.nextInt();

     System.out.println("Quel est votre age :");
     int iAge2 = sc.nextInt();

     int moyenneage = (iAge1 + iAge2) / 2;
     if(iAge1 > iAge2){
            System.out.println("Le plus grand nombre est : " + iAge1);
        }
        else if (iAge1 < iAge2) {
            System.out.println("Le plus grand nombre est : " + iAge2);
        }
        else{
            System.out.println("Les deux nombres sont égaux.");
        }
       
      System.out.println("La moyenne d'age est de :" + moyenneage);
        sc.close();
    }
    
    
}
