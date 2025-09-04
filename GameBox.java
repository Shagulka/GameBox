import java.util.*;
import java.io.*;

/**
 *
 * @author khesinbo
 * @author sidesch
 */
public class GameBox {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Gamebox!");

        System.out.println("Press Enter To Start The Game");
        scan.nextLine();

        System.out.print("""
                           Game List:
                           1. ROCK PAPER SCISSORS
                           2. GUESS A NUMBER
                           3. PALINDROMIC 1
                           4. PALINDROMIC 2: RETURN OF THE ARRAY
                           5. DRIVER MODE
                           Type your choice (a number):""");

        int choice = scan.nextInt();
        boolean choiceMade = false;
        while (!choiceMade) {
            switch (choice) {
                case 1 -> {
                    RockPaperScissors.main();
                    choiceMade = true;
                }
                case 2 -> {
                    GuessANumber.main();
                    choiceMade = true;
                }
                case 3 -> {
                    PalindromicNoArrays.main();
                    choiceMade = true;
                }
                case 4 -> {
                    PalindromicWithArrays.main();
                    choiceMade = true;
                }
                case 5 -> {
                    FirstN.main();
                    choiceMade = true;
                }
                case 6 -> {
                    Factorial.main();
                    choiceMade = true;
                }
                case 7 -> {
                    Fibonacci.main();
                    choiceMade = true;
                }
                case 8 -> {
                    FarenheitToCelsius.main();
                    choiceMade = true;
                }
                case 9 -> {
                    AvgSpeed.main();
                    choiceMade = true;
                }
                case 10 -> {
                    Remainder.main();
                    choiceMade = true;
                }
                case 11 -> {
                    FirstN.main();
                }
                case 15 -> {
                    choiceMade = true;
                    writer.write("TESTING DRIVER MODE LOGS FILE\n");
                    System.out.println("Plaing Rock Paper Scissors");
                    writer.write("Plaing Rock Paper Scissors\n");
                    RockPaperScissors.driver(writer);
                    System.out.println("Playing Guess A Number");
                    writer.write("Plaing Guess A Number\n");
                    GuessANumber.driver(writer);
                    System.out.println("Playing Palindrome (No Arrays)");
                    writer.write("Plaing Palindrome (No Arrays)\n");
                    PalindromicNoArrays.driver(writer);
                    System.out.println("Playing Palindrome 2 (Yes Arrays)");
                    writer.write("Plaing Palindrome 2 (Yes Arrays)\n");
                    PalindromicWithArrays.driver(writer);
                    writer.close();
                    System.out.println("log saved to " + log_path);
                }
                default -> {
                    System.out.print("Not a valid choice, please type an integer from 1 to 4");
                    choice = scan.nextInt();
                }
            }
        }

    }

}
