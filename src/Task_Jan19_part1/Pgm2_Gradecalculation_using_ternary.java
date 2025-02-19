package Task_Jan19_part1;

public class Pgm2_Gradecalculation_using_ternary {
    public static void main(String[] args) {
        int marks = 77;
        System.out.printf("Pranav has scored %d percent and his ", marks);
        boolean G1 = ((marks >= 90) && (marks <= 100));
        boolean G2 = ((marks >= 80) && (marks <= 89));
        boolean G3 = ((marks >= 70) && (marks <= 79));
        boolean G4 = ((marks >= 60) && (marks <= 69));
        String result = G1 ? "grade is A" : G2 ? "grade is B" : G3 ? "grade is C" : G4 ? "grade is D" : "grade is F";
        System.out.println(result);

    }

}
