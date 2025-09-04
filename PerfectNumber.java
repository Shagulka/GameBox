import java.util.Scanner;

public class PerfectNumber {
    public static void main() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to IS THAT A PERFECT NUMBER?!?");
      System.out.println("Please type a number so we can determine if this is a perfect number!");
      int num = scan.nextInt();
      System.out.println(perfectnum(num));
      scan.close();
    }

    private static String perfectnum(int num) {
      int curr = 0;
      for (int i = 1; i < num; i++) {
        if (curr == num) {
          return "This is a perfect number!";
        } else if (curr < num) {
          curr += i;
        } else {
          return "This is not a perfect number :(";
        }
      }
      return "This is not a perfect number :(";
    }
}
