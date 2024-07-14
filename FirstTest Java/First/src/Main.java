import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String userName = name.nextLine();
        System.out.println("Hello "+ userName);

    }
}