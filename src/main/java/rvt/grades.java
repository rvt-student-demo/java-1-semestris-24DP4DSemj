package rvt;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter points");
        int points = scanner.nextInt();

        if(points < 0 ) {
            System.out.println("impossible!");
        } else if(points<=49){
            System.out.println("failed");
        } else if(points <=59) {
            System.out.println("1");
        } else if(points <=59) {
            System.out.println("2");
        } else if(points <=79) {
            System.out.println("3");
        }else if(points <=89) {
            System.out.println("4");
        }else if(points <=100) {
            System.out.println("5");
        }else if(points >=100) {
            System.out.println("incredible");
        }
        scanner.close();
    }
}