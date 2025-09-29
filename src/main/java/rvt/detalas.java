package rvt;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int skruves_cena = 5;
        final int uzgrieznes_cena = 3;
        final int paplaksnes_cena = 1;

         System.out.println("Ievadiet skruvju skaitu: ");
         int skruves = Integer.valueOf(scanner.nextLine());

         System.out.println("Ievadiet uzgrieznu skaitu: ");
         int uzgrieznes = Integer.valueOf(scanner.nextLine());

         System.out.println("Ievadiet paplaksnes skaitu: ");
         int paplaksnes = Integer.valueOf(scanner.nextLine());

         int kopa = skruves * skruves_cena + uzgrieznes * uzgrieznes_cena + paplaksnes * paplaksnes_cena;       
         
         System.out.println("Skruvju skaits: " + skruves);
         System.out.println("Uzgriezbes skaits: " + uzgrieznes);
         System.out.println("Paplaksnes skaits: " + paplaksnes); 
         System.out.println(); 

         if (uzgrieznes < skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznes");
         } if (paplaksnes < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnes");
         } if (uzgrieznes >= skruves && paplaksnes >= 2 * skruves) {
            System.out.println("Pasutijuma nav kludu");
         }

         System.out.println(); 
         System.out.println("Kopeja cena " + kopa);
    
        }    
    }