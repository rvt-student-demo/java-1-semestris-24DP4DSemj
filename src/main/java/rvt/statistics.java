package rvt;

import java.util.Scanner;

public class statistics { 
    private int count;
    private int sum;

    public statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int num) {
        this.count++;
        this.sum += num;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
        statistics statistics = new statistics();
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Total count: " + statistics.getCount());
        System.out.println("Average: " + statistics.average());
    }
public class Statis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create the three Statistics objects in the required order
        statistics all = new statistics();
        statistics evens = new statistics();
        statistics odds = new statistics();

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
}