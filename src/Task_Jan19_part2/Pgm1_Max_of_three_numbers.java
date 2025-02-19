package Task_Jan19_part2;

public class Pgm1_Max_of_three_numbers {
    public static void main(String[] args) {
        int a = 105 , b = 30 , c = 5;
        String result = ((a>b)&&(a>c)) ? "A is greater" : ((b>c) ? "B is greater" : "C is greater");
        System.out.println(result);
    }

}
