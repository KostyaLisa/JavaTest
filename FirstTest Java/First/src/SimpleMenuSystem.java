import java.util.Scanner;

public class SimpleMenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("-----Calculator-----");
        System.out.println("[1] - Time Tables ");
        System.out.println("[2] - Calculator");
        System.out.println("[3] - Even Numbers");
        System.out.println("[4] - Exit");
        System.out.println("Chose is optional");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                timesTabels(scanner);
                break;
            case 2:
                calculator(scanner);
                break;
            case 3:
                evenNumbers(scanner);
                break;
            case 4:
                System.out.println("Exiting the program. ");
                break;
            default:
                System.out.println("Invalid chose. Please choose again");

        }
        while (choice != 4) ;
        scanner.close();
    }

    public static void timesTabels(Scanner scanner) {
        System.out.println("Enter the number for the time table: ");
        int number = scanner.nextInt();
        System.out.println("Time Tabel of " + number + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
    public static void calculator(Scanner scanner){
        System.out.println("Enter first number: ");
        double num1= scanner.nextDouble();
        System.out.println("Enter operator (+,-,*,/)");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1* num2;
            case'/':
                if (num1 !=0){
                    result = num1/num2;
                }else {
                    System.out.println("Error.Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("Result: "+ result);
    }
    public static void evenNumbers(Scanner scanner){
        System.out.println("Enter the number up to which you want event numbers:");
        int limit = scanner.nextInt();
        System.out.println("Event number up to "+ limit+" :");
        for (int i = 2; i<limit;i++){
            System.out.println(i+ " ");
        }
        System.out.println();
        scanner.close();
    }

}
