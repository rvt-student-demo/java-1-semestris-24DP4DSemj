package rvt;

import java.util.Scanner;

public class Statis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create the three Statistics objects in the required order
        Statistics all = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();

        while (true) {
            System.out.print("Enter number (-1 to end): ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            all.addNumber(number);
            if (number % 2 == 0) {
                evens.addNumber(number);
            } else {
                odds.addNumber(number);
            }
        }

        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + evens.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());
        scanner.close();
    }
}