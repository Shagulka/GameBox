import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class CongruentModulo {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CONGRUENT MODULO!!!");
        System.out.println("Choose the positive integers a, b, and n, your program will print if a and b are congruent modulo n.");
        System.out.println("Type a!");
        int a = scan.nextInt();
        System.out.println("Type b!");
        int b = scan.nextInt();
        System.out.println("Type n!");
        int n = scan.nextInt();
        String result = congruent_modulo(a, b, n);
        System.out.println(result);
        scan.close();
    }

    private static String congruent_modulo(int a, int b, int n) {
        if (n == 0) {
            return "Invalid input: n must be positive.";
        }
        if ((a % n) == (b % n)) {
            return a + " and " + b + " are congruent modulo of " + n + ".\n";
        } else {
            return a + " and " + b + " are not congruent modulo " + n + ".\n";
        }
    }

 
    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TEST 1: same number");
        writer.write("TEST 1: same number\n");
        writer.write("congruent_modulo(10, 10, 12)\n");
        writer.write(congruent_modulo(10, 10, 12));
        System.out.println("TEST 2: divisible by n");
        writer.write("TEST 2: divisible by n\n");
        writer.write("congruent_modulo(100, 250, 50)\n");
        writer.write(congruent_modulo(100, 250, 50));
        System.out.println("TEST 3: not congruent");
        writer.write("TEST 3: not congruent\n");
        writer.write("congruent_modulo(37, 20, 6)\n");
        writer.write(congruent_modulo(37, 20, 6));
        System.out.println("TEST 4: congruent");
        writer.write("TEST 4: congruent\n");
        writer.write("congruent_modulo(38, 20, 6)\n");
        writer.write(congruent_modulo(38, 20, 6));
    }
}
