import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String word = scanner.nextLine();

            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println(reversedWord);

    }
}
