package Loops;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int notEven= 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: "+ (i+1)+ " :");
            int number = scanner.nextInt();
            if (number %2==0){
                even+=1;

            }else{
                notEven+=1;
            }

        }
        System.out.println("even "+ even);
    }
}
