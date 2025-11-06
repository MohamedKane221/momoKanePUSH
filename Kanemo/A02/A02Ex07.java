package Kanemo.A02;

import java.util.Scanner;

public class A02Ex07 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();
        
        int iVoyelles = 0;
        int iConsonnes = 0;
        
        phrase = phrase.toLowerCase(); 
        
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            
            if (c >= 'a' && c <= 'z') { 
                if ("aeiouy".indexOf(c) != -1) {
                    iVoyelles++;
                } else {
                    iConsonnes++;
                }
            }
        }
        
        System.out.println("Nombre de voyelles : " + iVoyelles);
        System.out.println("Nombre de consonnes : " + iConsonnes);
        
        sc.close();
    }
}

 

