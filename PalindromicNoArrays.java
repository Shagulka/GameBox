import java.util.Scanner;

public class PalindromicNoArrays {
    
  public static void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to 'IS THAT A PALINDROME'!!! (with no arrays)");
    System.out.println("Please type a number, and we will determine (with NO ARRAYS) if this is a palindrome");
    int num = scan.nextInt();
    System.out.println(palindrome(num));
    scan.close();
  }

  private static String palindrome(int num) {
    // create a reversed version of num
    int reversed = 0;
    // we will divide i by 10 every time
    int i = num;
    // we will use this while loop to create reversed
    while (i > 0) {
      reversed += i % 10;
      reversed *= 10;
      i /= 10;
    } // while
    if (reversed == num) {
      return "This number is a palindrome!";
    } else {
      return "This number is not a palindrome :(";
    }
  }
}
