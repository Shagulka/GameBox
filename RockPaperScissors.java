import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  
  /**
   * Introduces the game. Takes user input and output.
   */
  public static void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Rock Paper Scissors! Please input your choice of rock paper or scissor. \nNote that you must type in EXACTLY either 'rock', 'paper', or 'scissors'");
    String choice = scan.next();
    System.out.println(rockPaperScissors(choice));
    scan.close();
  }

  /**
   * Play rock paper scissors with user input
   * @param choice "rock" "paper" or "scissors" 
   * @return output message -- "win" or "lose"
   */
  public static String rockPaperScissors(String choice) {
    Random rand = new Random();
    String[] choices = {"Rock", "Rock", "Paper", "Scissor"};
    String computer_choice = choices[(rand.nextInt(5))];
    String[] messages = {"Congratulations! You won!!", "You lost :(", "You tied..."};
    if (choice.equals("rock")) {
      if (computer_choice.equals("Rock")) {
        return messages[2];
      } else if (computer_choice.equals("Paper")) {
        return messages[1];
      } else {
        return messages[0];
      } // if-else (rock)
    } else if (choice.equals("paper")) {
      if (computer_choice.equals("Rock")) {
        return messages[0];
      } else if (computer_choice.equals("Paper")) {
        return messages[2];
      } else {
        return messages[1];
      } // if-else (paper)
    } else if (choice.equals("scissors")) {
      if (computer_choice.equals("Rock")) {
        return messages[1];
      } else if (computer_choice.equals("Paper")) {
        return messages[0];
      } else {
        return messages[2];
      } // if-else (scissors)
    } else {
      return "You did not type 'rock' 'paper' or 'scissors', so you automatically lose :(";
    }
  }

  /**
   * Plays rock paper scissors as a driver.
   * @return output message for the log
   */
  public static String driver() {
    return "";
  }
}
