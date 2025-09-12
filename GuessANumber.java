import java.util.Scanner;

public class GuessANumber {
    
  public static void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Guess a Number! The computer will try to guess your number using binary search!");
    guess(scan);
    scan.close();
  }

  private static void guess(Scanner scan) {
    System.out.println("Welcome to guess a number! Come up with a number between 0 and 100 RIGHT NOW. And don't change it.");
    System.out.println("Okay.... once you have your number, we will start making guesses! Hit enter to continue.");
    scan.nextLine();
    int lower = 0;
    int guess = 50;
    int upper = 100;
    String direction;
    int tries = 0;
    while (true) {
      System.out.println("Our guess is " + guess);
      System.out.println("Is your number higher, lower, or correct?");
      direction = scan.next();
      if (direction.equals("higher")) {
        lower = guess + 1;
        guess = midpoint(lower, upper);
        tries++;
      } else if (direction.equals("lower")) {
        upper = guess;
        guess = midpoint(lower, upper);
        tries++;
      } else if (direction.equals("correct")) {
        System.out.println("YAYYYY! We guessed your number in " + tries + " tries!!!");
        return;
      } else {
        System.out.println("Please either type 'higher', 'lower', or 'correct' :)");
      }
    }
  }

  private static int midpoint(int lower, int upper) {
    return (lower + upper)/2;
  }
}
