package Task_Jan19_part2;

public class Pgm5_maxOfThreeNumbers_using_CLI {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println("Num1 = " + n1);
        System.out.println("Num2 = " + n2);
        String maxi = (n1>n2) ? "Num 1 is greater" : "Num2 is greater";
        if(n1>n2) {
            System.out.println(maxi);
        }
        else
        {
            System.out.println("Num2 = " +n2);
            System.out.println(maxi);
        }
    }
}
