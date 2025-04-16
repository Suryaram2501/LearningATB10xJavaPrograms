package Ex03_OperatorsAndCLI;

public class Pgm005_print_using_CLI {
    public static void main(String[] args) {
        String name = args[0];
        String age = args[1];
        String salary = args[2];
        System.out.println(name);
        System.out.println("Her age is " + age);
        System.out.println("She is earning monthly " + salary);

    }
}
