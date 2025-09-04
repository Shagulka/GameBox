import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the FIBONACCI!!!");
        System.out.println("Give an integer and get the Nth Fibonacci number!");
        System.out.println("Choose an integer!");
        int choice = scan.nextInt();
        String result = fact(choice);
        System.out.println(result);
        scan.close();
    }

    private static String fact(int n){
        int[] fib;
        fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return "Your fibbonacci number is " + Integer.toString(fib[n-1]) + "!";
    }

    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TESTING 1");
        writer.write("TESTING 1 \n");
        writer.write(fact(1));
        System.out.println("TESTING 100");
        writer.write("TESTING 100 \n");
        writer.write(fact(100));
        System.out.println("TESTING 38");
        writer.write("TESTING 38 \n");
        writer.write(fact(38));
    }
}
