import java.util.Scanner;

public class FirstNAscending {
    // we will print the first n ascending numbers that are multiples of i, j, or both.
    public static void main() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to 'finding the first n ascending integers that are multiples of i j or both'!!!");
      System.out.println("(everyones FAVORITE game!!!)");
      System.out.print("Enter your 'n' (how many numbers in the sequence): ");
      int n = scan.nextInt();
      System.out.print("\nEnter your 'i': ");
      int i = scan.nextInt();
      System.out.print("\nEnter your 'j': ");
      int j = scan.nextInt();
      System.out.println();
      System.out.println(firstn(n, i, j));
      scan.close();
    }

    private static String firstn(int n, int i, int j) {
      // we want i < j. if that's not the case, we will switch them here.
      if (i > j) {
        int curr = i;
        i = j;
        j = curr;
      }
      int[] first_n = new int[n];
      if (n < 1) {
        return "There are no elements in this list";
      }
      //while (true) {
        
      //}
      first_n[0] = 0;
      for (int idx = 1; idx*2 < n; idx++) {

      }
      return "";
    }
}
