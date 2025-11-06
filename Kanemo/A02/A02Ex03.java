package Kanemo.A02;

import java.util.Scanner;

public class A02Ex03 {
    public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Phrase :");
     String sPhrase = sc.nextLine();

     String sMaj = sPhrase.toUpperCase();
     System.out.println("Texte en majuscule :" + sMaj);
     int Icompteur=0;
    
    for (int iChiffre = 0; iChiffre < sPhrase.length(); iChiffre++) {
        if (sPhrase.charAt(iChiffre) == 'a') {
            
           Icompteur++;
        }   
    }
        System.out.println("Nombre de A :"+ Icompteur);
 
        //Remplace les A par des $
 
        String texteModifie = sPhrase.replace("a", "$");
        System.out.println("Voici le txte qunad on remplace les a -> $ :" + texteModifie);


     sc.close();
     
   

    }
     
    
}
