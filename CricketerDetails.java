import java.util.*;

public class CricketerDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Jersey Number: ");
        byte jerseyNo = sc.nextByte();

        System.out.print("Enter Number of Matches Played: ");
        short matchesPlayed = sc.nextShort();

        System.out.print("Enter Total Runs Scored: ");
        int totalRuns = sc.nextInt();

        System.out.print("Enter Total Fans Count: ");
        long fansCount = sc.nextLong();

        System.out.print("Enter Batting Average : ");
        float battingAverage = sc.nextFloat();

        System.out.print("Enter Strike Rate: ");
        double strikeRate = sc.nextDouble();

        System.out.print("Enter Player Grade (A or B or C): ");
        char playerGrade = sc.next().charAt(0);

        System.out.print("Is the player currently active? (true/false): ");
        boolean isActive = sc.nextBoolean();

        
        System.out.println("\n--- Cricketer Details ---");
        System.out.println("Jersey Number: " + jerseyNo);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Fans Count: " + fansCount);
        System.out.println("Batting Average: " + battingAverage);
        System.out.println("Strike Rate: " + strikeRate);
        System.out.println("Player Grade: " + playerGrade);
        System.out.println("Is Currently Active: " + isActive);

        
    }
}
