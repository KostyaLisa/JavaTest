package Loops;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
    /*    int num1 = 2;
        int num2 = 3;
        int num3 = 5;
        int num4 = 1;
        int num5 = 8;

        int sum = num1+num2+num3+num4+num5;
        System.out.println(sum);*/

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter five integers: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Number " +(i+1)+ " :");
            int number = scanner.nextInt();
            sum+=number;
        }
        System.out.println("The sum of the number is: "+sum);
        scanner.close();
    }
}
