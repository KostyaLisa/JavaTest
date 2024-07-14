package Loops;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < 10+1; i++) {
           int  result = num* i;
            System.out.println(result);

        }
    }
}
