package Ex05_Conditions_and_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pgm011_PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string...");
        String str1 = sc.next();
        String revstr = "";
        for(int i=str1.length()-1;i>=0;i--)
        {
            revstr = revstr + str1.charAt(i);

        }
        //System.out.println("Reverse of the given string " + str1 + " is " + revstr);
        if(revstr.equalsIgnoreCase(str1))
            System.out.println(str1 + " is a Palindrome");
        else
            System.out.println(str1 + " is not a Palindrome");
    }


}
