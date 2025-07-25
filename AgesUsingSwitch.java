import java.util.Scanner;

public class AgesUsingSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        byte age = sc.nextByte();
        
        String category = "";

        if(age < 0) {
            category = "invalid";
        } else if(age>=0 && age<=2) {
            category = "infant";
        } else if(age>2 && age<=12) {
            category = "kid";
        } else if(age>12 && age<=18) {
            category = "teen";
        } else if(age>18 && age <= 60) {
            category = "adult";
        } else {
            category = "old";
        }

        switch(category) {
            case "invalid":
                System.out.println("Invalid Age");
                break;
            case "infant":
                System.out.println("Infant");
                break;
            case "kid":
                System.out.println("Small Kid");
                break;
            case "teen":
                System.out.println("Teen Ager");
                break;
            case "adult":
                System.out.println("Adult");
                break;
            case "old":
                System.out.println("Old People");
                break;
            default:
                System.out.println("Unknown category");
        }
        sc.close();
    }
}
