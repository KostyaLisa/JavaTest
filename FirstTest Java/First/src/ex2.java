import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi,Im a BOT,whats yors name? ");
        String name = scanner.nextLine();
        System.out.println("I welcome "+ name +". How old are you?");
        int age = scanner.nextInt();
        System.out.println("Fantastic, you are already "+ age + "years old.Where are you city from?");
        String city = scanner.next();
        System.out.println("Wow,"+ city+" Ive never visited!");
    }
}
