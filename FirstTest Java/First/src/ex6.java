import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter you last name: ");
        String lastName = scanner.nextLine();

        String email = firstName.toLowerCase().charAt(0)+"."+ lastName.toLowerCase()+"@email.com";

        System.out.println("Hello "+ firstName+"you registration complete");

        System.out.println("Your email is "+email);

        scanner.close();
    }
}
