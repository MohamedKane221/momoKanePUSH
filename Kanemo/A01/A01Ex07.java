package Kanemo.A01;

import java.util.Scanner;

public class A01Ex07 {
    public static void main(String[]args) {
        double d1 = 3 * 10 + 45 / 5 - 8 + 56 % 20;
        System.out.println("Réponce :" + d1);
        double d2 = 3 * 10 + 45 / 5 - (8 + 56) % 20;
        System.out.println("Réponce :" + d2);
        double d3 = 3 * 10 + 45 / (5 - 8 + 56) % 20;
        System.out.println("Réponce :" + d3);
        double d4 = 3 * 10 + 45 / (5 - 8) + 56 % 20;
        System.out.println("Réponce :" + d4);
        double d5 = 3 * (10 + 45) / 5 - 8 + 56 % 20;
        System.out.println("Réponce :" + d5);
        double d6 = 3 * (10 + 45 / 5) - 8 + 56 % 20;
        System.out.println("Réponce :" + d6);

        
    }
}
