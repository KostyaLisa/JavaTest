import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] options = {"rock", "paper"," scissors"};

        System.out.println("Welcome to game: Rock, Paper, Scissors ");

        while (true){
            System.out.println("Choose an options: [rock, paper, scissors] ");
            String userChoose = scanner.next().toLowerCase();

            if (userChoose.equals("exit")){
                System.out.println("You exit this game");
                break;
            }
            if (!userChoose.equals("rock")&&!userChoose.equals("paper")&&!userChoose.equals("scissors")){
                System.out.println("Invalid choice. Please choose 'rock', 'paper', or 'scissors'");
                continue;
            }
            int computorIndex = random.nextInt(3);
            String computorChoice = options[computorIndex];

            if (userChoose.equals(computorChoice)){
                System.out.println("Its a tie!");
            } else if ((userChoose.equals("rock")&&computorChoice.equals("scissors"))||
                    (userChoose.equals("paper")&&computorChoice.equals("rock"))||
                            (userChoose.equals("scissors")&& computorChoice.equals("paper"))) {
                System.out.println("You win!");
            }else {
                System.out.println("You lose!");
            }
        }
        scanner.close();
    }
}
