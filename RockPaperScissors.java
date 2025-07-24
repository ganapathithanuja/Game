import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Enter your choice: Rock, Paper or Scissors.");
        
        System.out.print("Your choice: ");
        String userChoice = scanner.nextLine();
        

        while (!userChoice.equalsIgnoreCase("Rock") && 
               !userChoice.equalsIgnoreCase("Paper") && 
               !userChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("Invalid input. Please choose Rock, Paper, or Scissors.");
            System.out.print("Your choice: ");
            userChoice = scanner.nextLine();
        }

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];
        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
