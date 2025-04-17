package Ex06_ValidationOfNumbersAndCharacters;

import java.util.Scanner;

public class Pgm011_PositiveAndNegativeValidationOfNumbers {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the integer");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a >= 0)
            System.out.println("Entered number is a Positive number!");
        else
            System.out.println("Entered number is a Negative number!");



    }
}
