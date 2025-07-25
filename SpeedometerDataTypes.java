import java.util.Scanner;

public class SpeedometerDataTypes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance (in meters):");
        int distance=sc.nextInt();
        System.out.println("Enter Time (in minutes):");
        float timeMinutes = sc.nextFloat();
        double timeHours = timeMinutes / 60.0;
        double speed = (distance / 1000.0) / timeHours;
         byte gear = 4;                          
        short rpm = 65;                         
        long tripId = 2025240700L;             
        char mode = 'S';                        // 'E' for Eco, 'S' for Sport
        boolean isSpeeding = speed > 80;  

        System.out.println("\n----- Bike Speedometer -----");
        System.out.println("Gear            : " + gear);
        System.out.println("Engine RPM      : " + (rpm * 100));
        System.out.println("Distance        : " + distance + " meters");
        System.out.println("Trip ID         : " + tripId);
        System.out.println("Time            : " + timeMinutes + " minutes");
        System.out.printf("Speed     : %.2f km/h\n", speed);
        System.out.println("Mode            : " + (mode == 'E' ? "Eco" : "Sport"));
        System.out.println("Over Speeding?  : " + isSpeeding);

        sc.close();
    }
}
