package Ex05_Conditions_and_loops;

public class Pgm010_Count_VowelsAndConsonants {
    public static void main(String[] args) {
    //  Scanner str = new Scanner(System.in);
    //  System.out.println("Enter the Name (String format only)");
    //  String name = str.next();
        String name = "Pramod";
        System.out.println("Given name is  " + name);
        name = name.toLowerCase();
        int vowelcounts = 0;
        int consonantcounts = 0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
            {
                vowelcounts = ++vowelcounts;
            }
            else
                consonantcounts = ++consonantcounts;
        }

        System.out.println("Number of vowels in the given name :" + vowelcounts );
        System.out.println("Number of consonants in the given name :" + consonantcounts );


    }
}
