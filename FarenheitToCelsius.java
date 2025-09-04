import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the FtoC!!!");
        System.out.println("Give a Farenheit temperature and get Celcius");
        System.out.println("Choose a number!");
        Double choice = scan.nextDouble();
        String result = ftc(choice);
        System.out.println(result);
        scan.close();
    }

    private static String ftc(Double n){
        Double res = (n - 32) * 5 / 9;
        return "Your Celcius Temperature is " + Double.toString(res) + "!";
    }

    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TESTING 1");
        writer.write("TESTING 1 \n");
        writer.write(ftc(1.0));
        System.out.println("TESTING 100");
        writer.write("TESTING 100 \n");
        writer.write(ftc(100.0));
        System.out.println("TESTING 38.5");
        writer.write("TESTING 38 \n");
        writer.write(ftc(38.5));
    }
}
