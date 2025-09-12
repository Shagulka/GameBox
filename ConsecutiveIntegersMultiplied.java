import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsecutiveIntegersMultiplied {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CONSECUTIVE INTEGERS MULTIPLIED!!!");
        System.out.println("Choose an integer!");
        int choice = scan.nextInt();
        String result = first_n(choice);
        System.out.println(result);
        scan.close();
    }

    private static String first_n(int n){
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (i * (i+1) * (i+2) == n) {
                return "yes, the provided number is the result of three consecutive integers multiplies " + i + " * " + (i+1) + " * " + (i+2) + " = " + n + "\n";
            }
        }
        return "no, the provided number is not the result of three consecutive integers multiplies\n";
    }

    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TESTING 5\n");
        writer.write("TESTING 5 \n");
        writer.write(first_n(5));
        System.out.println("TESTING 504\n");
        writer.write("TESTING 504 \n");
        writer.write(first_n(504));
        System.out.println("TESTING 30\n");
        writer.write("TESTING 30 \n");
        writer.write(first_n(30));
    }
}
