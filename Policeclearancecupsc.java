import java.util.Scanner;

public class Policeclearancecupsc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Police clearance form for upsc ");
        System.out.println("Name of aspirant: ");
        String name = sc.nextLine();
        System.out.println("Age of aspirant: ");
        byte age = sc.nextByte();
        System.out.println("Gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.println("Height : ");
        float height = sc.nextFloat();
        System.out.println("Phone Number: ");
        int phn = sc.nextInt();
        System.out.println("Enter Aadhar Number: ");
        Long Aadhar_number = sc.nextLong();
        System.out.println("Year of Graduation : ");
        short yod = sc.nextShort();
        System.out.println("Is Married (true/false): ");
        boolean married  = sc.nextBoolean();
        System.out.println("No . of cases registered: ");
        int cases = sc.nextInt();
        sc.nextLine();
        System.out.println("Is there any Criminal Background (Yes/No): ");
        String crim_bg = sc.nextLine();
        System.out.println("Family Background(Good/Bad): ");
        String fam_bg = sc.nextLine();
        System.out.println("Name of Aspirant: "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Height : "+height);
        System.out.println("phone number : "+phn);
        System.out.println("Aadhar number : "+Aadhar_number);
        System.out.println("Year of Graduation : "+yod);
        System.out.println("Married status : "+married);
        System.out.println("Number of cases registered : "+cases);
        System.out.println("Criminal Backgroung Verification: "+crim_bg);
        System.out.println("Family Background Verification : "+fam_bg);
        System.out.println("Successfully Passed Police Clearance ");
        
        

    }
}
