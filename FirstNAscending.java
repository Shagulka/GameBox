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
      first_n[0] = 0;
      int i_multiplier = 1;
      int j_multiplier = 1;
      for (int idx = 1; idx < n; idx++) {
        if (i*i_multiplier < j*j_multiplier) {
          first_n[idx] = i*i_multiplier;
          i_multiplier++;
        } else if (i*i_multiplier > j*j_multiplier) {
          first_n[idx] = j*j_multiplier;
          j_multiplier++;
        } else {
          first_n[idx] = i*i_multiplier;
          i_multiplier++;
          j_multiplier++;
        }
      }
      return first_n.toString();
    }
}
