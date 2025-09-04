import java.util.Scanner;

public class PalindromicWithArrays {
    
  public static void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to 'IS THAT A PALINDROME'!!! (WITH arrays)");
    System.out.println("Please type a number, and we will determine if this is a palindrome");
    int num = scan.nextInt();
    System.out.println(palindrome(num));
    scan.close();
  }

  private static String palindrome(int num) {
    // strings are arrays of characters, so we will convert the number to a string and reverse the string
    String num2str = Integer.toString(num);
    StringBuilder sb = new StringBuilder(num2str);
    String reversed = sb.reverse().toString();
    if (reversed.equals(num2str)) {
      return "This number is a palindrome!";
    } else {
      return "This number is not a palindrome :(";
    }
  }
}
