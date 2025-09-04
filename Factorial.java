import java.util.*;
import java.io.IOException;
import java.io.*;

public class Factorial {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the FACTROIAL!!!");
        System.out.println("Choose an integer! (=< 10)");
        int choice = scan.nextInt();
        String result = fact(choice);
        System.out.println(result);
        scan.close();
    }

    private static String fact(int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res*=i;
        }
        return "Your factorial is " + Integer.toString(res) + "!";
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