package Kanemo.A02;

import java.util.Scanner;

public class A02Ex05 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Alphabet à l'endroit:");
        for(char cChar ='A' ; cChar <= 'Z' ;cChar++){
            System.out.println(cChar);
        }
        
        System.out.print("Alphabet à l'endroit:");
        System.out.println();
        for(char cChar2='Z' ; cChar2 >= 'A' ;cChar2--){
            System.out.println(cChar2);
        }
        sc.close();

    }
}
