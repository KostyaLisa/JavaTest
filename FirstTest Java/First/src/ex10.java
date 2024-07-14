import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1>num2){
            int sum = num1-num2;
            System.out.println("First number is bigger: "+ sum);
        } else if (num1<num2) {
            int sum = num2-num1;
            System.out.println("Second number is bigger: "+ sum + " or first number is less:- "+ sum);
        }
        else {
            System.out.println("These number is equal");
        }
    }
}
