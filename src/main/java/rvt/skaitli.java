package rvt;

import java.util.Scanner;

public class skaitli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while (true) {
            System.out.print("Ievadiet pozitivus skaitļus (0 vai negativs skaitlis beigs programmu): ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number <= 0) {
                    break;
            }
            
            count = count + 1;
            sum = sum + number;

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }   

            if (count > 0) {
            average = sum / count;
            
            System.out.println();
            System.out.println("Ievadito skaitlu skaits " + count);
            System.out.println("Skaitlu summa " + sum);
            System.out.println("Videja vertiba " + average);
            System.out.println("Lielakais skaitlis " + max);
            System.out.println("Mazakais skaitlis " + min);
            } else {
                System.out.println("Nebija ievadits neviens pozitivs skaitlis");
            }
    }
}
