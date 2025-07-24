import java.util.*;

public class ConditionSwitchDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = s.nextInt();
        int code;

        if (age < 0) {
            code = -1;  
        } else if (age <= 2) {
            code = 0;
        } else if (age <= 13) {
            code = 1;
        } else if (age < 18) {
            code = 2;
        } else if (age < 60) {
            code = 3;
        } else {
            code = 4;
        }

        switch (code) {
            case -1:
                System.out.println("Age Cannot Be Negative");
                break;
            case 0:
                System.out.println("Infant");
                break;
            case 1:
                System.out.println("Small Lad");
                break;
            case 2:
                System.out.println("Teen");
                break;
            case 3:
                System.out.println("Adult");
                break;
            case 4:
                System.out.println("Old");
                break;
            default:
                System.out.println("Unkown Age Category");
                break;
        }
    }
}
