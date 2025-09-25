package rvt;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.valueOf(scanner.nextLine());
        String name = scanner.nextLine();

        if (age >= 18) {
            System.out.println("Tu esi pilngadigs");
        } else {
            System.out.println("Nav piekluves");
        }
    }
}
