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
        String workingDir = System.getProperty("user.dir");
        String logfile = workingDir + "GameBox.logs";
        BufferedWriter writer = new BufferedWriter(new FileWriter(logfile));
        
        System.out.println("Welcome to Gamebox!");

        System.out.println("Press Enter To Start The Game");
        scan.nextLine();

        System.out.print("""
                           Game List:
                           1. Rock Paper Scissors
                           2. Guess a Number
                           3. Is it a palindrome?
                           4. Are you sure it is a palindrome?
                           5. Sum of first N digits
                           6. Factorial
                           7. Fibbonaci
                           8. Farenheit to Celcius
                           9. Average Speed
                           10. Remainder
                           11. Ascending order, the n first positive numbers that are multiples of i, or j.
                           12. Perfect number
                           13. Congruent modulo.
                           14. Three integers multiplied
                           15. Driver mode
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
                    //Fibonacci.main();
                    choiceMade = true;
                }
                case 8 -> {
                    //FarenheitToCelsius.main();
                    choiceMade = true;
                }
                case 9 -> {
                    //AvgSpeed.main();
                    choiceMade = true;
                }
                case 10 -> {
                    //Remainder.main();
                    choiceMade = true;
                }
                case 11 -> {
                    //FirstNAscending.main();
                    choiceMade = true;
                }
                case 12 -> {
                    PerfectNumber.main();
                    choiceMade = true;
                }
                case 13 -> {
                    //CongruentModulo.main();
                    choiceMade = true;
                }
                case 14 -> {
                    //ConsecutiveIntegersMultiplied.main();
                    choiceMade = true;
                }
                case 15 -> {
                    choiceMade = true;
                    writer.write("TESTING DRIVER MODE LOGS FILE\n");
                    System.out.println("Plaing Rock Paper Scissors");
                    writer.write("Plaing Rock Paper Scissors\n");
                    //RockPaperScissors.driver(writer);
                    System.out.println("Playing Guess A Number");
                    writer.write("Plaing Guess A Number\n");
                    //GuessANumber.driver(writer);
                    System.out.println("Playing Palindrome (No Arrays)");
                    writer.write("Plaing Palindrome (No Arrays)\n");
                    //PalindromicNoArrays.driver(writer);
                    System.out.println("Playing Palindrome 2 (Yes Arrays)");
                    writer.write("Plaing Palindrome 2 (Yes Arrays)\n");
                    //PalindromicWithArrays.driver(writer);
                    writer.close();
                    //System.out.println("log saved to " + logfile);
                }
                default -> {
                    System.out.print("Not a valid choice, please type an integer from 1 to 4");
                    choice = scan.nextInt();
                }
            }
        }

    }

}
