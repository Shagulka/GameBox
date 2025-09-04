import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class FirstN {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the SUM OF FIRST N INTEGERS!!!");
        System.out.println("Choose an integer!");
        int choice = scan.nextInt();
        String result = first_n(choice);
        System.out.println(result);
        scan.close();
    }

    private static String first_n(int n){
        int result = (n*(n+1))/2;
        return "Your sum is " + Integer.toString(result) + "!";
    }

    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TESTING 1");
        writer.write("TESTING 1 \n");
        writer.write(first_n(1));
        System.out.println("TESTING 100");
        writer.write("TESTING 100 \n");
        writer.write(first_n(100));
        System.out.println("TESTING 38");
        writer.write("TESTING 38 \n");
        writer.write(first_n(38));
    }
}
