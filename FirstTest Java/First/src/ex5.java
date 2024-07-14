import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        String upperCaseSentence = words.toUpperCase();
        int countA=0;

        for (int i = 0; i <upperCaseSentence.length() ; i++) {
            if (upperCaseSentence.charAt(i) == 'A' ){
                countA++;
            }
            
        }
        int firstPosition = upperCaseSentence.indexOf('A');
        int lastPosition = upperCaseSentence.lastIndexOf('A');


        System.out.println("Number of time 'A' appears: "+countA);
        System.out.println("");
    }
}
