import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();
        int threeNumber = scanner.nextInt();
        int fourNumber = scanner.nextInt();
        int fiveNumder = scanner.nextInt();

        double sum = (oneNumber+twoNumber+threeNumber+fourNumber+fiveNumder)/5;

        if (sum>=9.5){
            System.out.println("passed");
        }
        else if (sum > 8 &&  sum < 9.5){
            System.out.println("in recovery");
        } else {
            System.out.println("disapproved");
        }
        }

}
