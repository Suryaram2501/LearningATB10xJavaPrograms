package Task_Jan19_part1;

public class Pgm1_Gradecalculation_using_ifelse {
    public static void main(String[] args) {
        int marks = 99;
        if((marks >= 90) && (marks <= 100))
            System.out.println("Pranav has got Grade A with percentage " + marks);
        else if((marks >= 80) && (marks <= 89))
            System.out.println("Pranav has got Grade B with percentage " + marks);
        else if((marks >= 70) && (marks <= 79))
            System.out.println("Pranav has got Grade C with percentage " + marks);
        else if((marks >= 60) && (marks <= 69))
            System.out.println("Pranav has got Grade D with percentage " + marks);
        else
            System.out.println("Pranav has got Grade F with percentage " + marks);
    }

}
