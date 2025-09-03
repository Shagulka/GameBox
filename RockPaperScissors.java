import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    
  public static void main() {
    Scanner scan = new Scanner(System.in);


  }

  public static String rockPaperScissors(int player) {

    Random rand = new Random();
    String[] choices = {"Rock", "Rock", "Paper", "Scissor"};
    String choice = choices[(rand.nextInt(5))];
    return "";
  }
}
