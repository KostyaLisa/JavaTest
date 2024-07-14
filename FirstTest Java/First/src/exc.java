import java.util.Scanner;

public class exc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you speed: ");

        int speed = scanner.nextInt();

        if (speed>80){
            int fine = ((speed-80)*7)+100;
            System.out.println("You to have the fine: " + fine );
        }

        else if (speed<80){
            System.out.println("Normal speed");
        }
        else if (speed==80){
            System.out.println("Warning, look at your speed");
        }
        else {
            System.out.println("Not detecting car");
        }
    }
}
