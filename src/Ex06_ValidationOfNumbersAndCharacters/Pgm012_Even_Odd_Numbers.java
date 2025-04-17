package Ex06_ValidationOfNumbersAndCharacters;

import java.util.Scanner;

public class Pgm012_Even_Odd_Numbers {
    public static void main(String[] args) {
        int a;
        System.out.println("Please enter the number!");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2 ==0)
            System.out.println("Entered number is Even number");
        else
            System.out.println("Entered number is a Odd number");
    }
}
