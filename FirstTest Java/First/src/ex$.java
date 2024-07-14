import java.util.Locale;
import java.util.Scanner;

public class ex$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        String upperCaseName = name.toUpperCase();
        System.out.println("Name in all capital letters: "+ upperCaseName);

        String lowerCaseName = name.toLowerCase();
        System.out.println("Name in all lowercase letters: "+ lowerCaseName);

        String nameWithoutSpaces = name.replace(" ", "");
        int numLetterWithOutSpase = nameWithoutSpaces.length();
        System.out.println("Number of letters without space: "+numLetterWithOutSpase);

        String [] nameParts = name.split(" ");
        int numLettersInFirstName = nameParts[0].length();
        System.out.println("Number of letters in the first name: "+ numLettersInFirstName);

        scanner.close();
    }
}
