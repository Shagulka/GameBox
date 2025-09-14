import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Remainder {
    public static void main() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to REMAINDER CALCULATOR!!!");
      System.out.println("Please type a three digit number!");
      String num = scan.nextLine();
      System.out.println(remainder(num));
      scan.close();
    }

    private static String remainder(String num) {
      String rem = num.substring(2);
      String leftover =  num.substring(0, 2);
      return "The remainder of " + num + " divided by 10 is " + rem + ". The quotient is " + leftover + "!\n";
    }

    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TEST 1: zeroes at the end \n");
        writer.write("TEST 1: zeroes at the end \n");
        writer.write(remainder("100"));
        System.out.println("TEST 2: 456\n");
        writer.write("TEST 2: 456 \n");
        writer.write(remainder("456"));
        System.out.println("TEST 3: 789\n");
        writer.write("TEST 3: 789 \n");
        writer.write(remainder("789"));
    }
}
