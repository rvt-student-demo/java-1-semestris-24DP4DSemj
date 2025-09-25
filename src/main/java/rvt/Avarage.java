package rvt;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int num3 = Integer.valueOf(scanner.nextLine());

        System.out.println(
            (num1 + num2 + num3) / 3.0
        );
    }
}
