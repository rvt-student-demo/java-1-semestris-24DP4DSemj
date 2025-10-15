package rvt;

public class From_one_to_parameter {
    public static void main(String[ ] args) {
        printUntilNumber(5);;
        
 }

    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i = i + 1;
        }
    }
}

