package rvt;

import java.util.Scanner;

public class exuzdevums {
    public static void main(String[] args) {
        ex7();
    }


    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start: ");
        int min = Integer.valueOf(scanner.nextLine());
        System.out.println("End: ");
        int max = Integer.valueOf(scanner.nextLine());

        for (int i = min; i <= max; i++) { 
           System.out.println(i);     
        }
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet N: ");
        int N = Integer.valueOf(scanner.nextLine());

        int loopsum = 0;

        for(int i = 1; i <= N; i++) {
            loopsum += i;
        }
        int formulasum = (N*(N+1))/2;

        System.out.println("loopsum: " + loopsum);
        System.out.println("formulasum: " + formulasum);
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet N: ");
        int N = Integer.valueOf(scanner.nextLine());

        int loopsum = 0;

        for(int i = 1; i <= N; i++) {
            loopsum += i * i;
        }
        int formulasum = (N*(N+1)*(2*N+1))/6;

        System.out.println("loopsum: " + loopsum);
        System.out.println("formulasum: " + formulasum);
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Low: ");
        int L = Integer.valueOf(scanner.nextLine());
        System.out.println("High: ");
        int H = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for(int i = L; i <= H; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write word: ");
        String inpuString = scanner.nextLine();

        System.out.println();

        int times = inpuString.length();
        
        for(int i = 0; i < times; i++) {
            System.out.println(inpuString);
        }
    }
    
     public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First word: ");
        String F = scanner.nextLine();
        System.out.println("Second word: ");
        String S= scanner.nextLine();

         int totalLength = 30;
         int count = totalLength - (F.length() + S.length());

        System.out.print(F);

        for(int i = 0; i < count; i++) {
            System.out.print(".");
        }
       System.out.print(S); 
     }    
     public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String W = scanner.nextLine();

        for(int i = 0; i < W.length(); i++) {
            System.out.println(W.charAt(i));
        }
    }   
}