package Ex03_OperatorsAndCLI;

public class Pgm004_Max_of_three_numbers {
    public static void main(String[] args) {
        int a = 105 , b = 30 , c = 5;
        String result = ((a>b)&&(a>c)) ? "A is greater" : ((b>c) ? "B is greater" : "C is greater");
        System.out.println(result);
    }

}
