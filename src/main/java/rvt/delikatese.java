package rvt;

import java.util.Scanner;

public class delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ievadiet preci: ");
        String prece = scanner.nextLine();

        System.out.println("Ievadiet preces cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Express piegade (0 - ne, 1 - ja): ");
        int express = Integer.valueOf(scanner.nextLine()); 

        double piegade = 0; 
        if (cena < 10) {
            piegade = 2.0;
        }  if (express == 1) {
            piegade += 3.0;
        }
        double kopa = cena + piegade;

        System.out.println("Rekins: ");
        System.out.println(); 
        System.out.println(prece + " " + cena);
        System.out.println(); 
        System.out.println("Piegade " + piegade);
        System.out.println(); 
        System.out.println("Kopa " + kopa);
    }
}