import java.util.*;
public class CricketerDetails {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     byte jerseyNo=sc.nextByte();
     short matchesPlayed=sc.nextShort();
     int totalRuns=sc.nextInt();
     long fansCount=sc.nextLong();
     float battingAverage=sc.nextFloat();
     double strikeRate=sc.nextDouble();
     char playerGrade=sc.next().charAt(0);
     boolean isActive=sc.nextBoolean();

     System.out.println("Jersey NO: "+jerseyNo);
     System.out.println("Matches Played; "+matchesPlayed);
     System.out.println("Total Runs: "+totalRuns);
     System.out.println("Fans Count: "+fansCount);
     System.out.println("Batting Average: "+battingAverage);
     System.out.println("Strike Rate: "+strikeRate);
     System.out.println("Player Grade: "+playerGrade);
     System.out.println("Is Active or No: "+isActive);


     
    }
    
}
