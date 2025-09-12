import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgSpeed {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the AVERAGE SPEED CALCULATOR!!!");
        System.out.println("Enter the distance you traveled (in kilometers): ");
        double distance = scan.nextDouble();
        System.out.println("Enter the time it took (in hours): ");
        double time = scan.nextDouble();
        String result = avgSpeed(distance, time);
        System.out.println(result);
        scan.close();
    }

    private static String avgSpeed(double distance, double time){
        double averageSpeed = distance / time;
        return "Your average speed was " + averageSpeed + " km/h!!!!";
    }

    public static void driver(BufferedWriter writer) throws IOException {
        System.out.println("TESTING 1");
        writer.write("TESTING 1 \n");
        writer.write(avgSpeed(1, 1));
        System.out.println("TESTING 100");
        writer.write("TESTING 100 \n");
        writer.write(avgSpeed(100, 2));
        System.out.println("TESTING 38");
        writer.write("TESTING 38 \n");
        writer.write(avgSpeed(38, 0.5));
    }
}
