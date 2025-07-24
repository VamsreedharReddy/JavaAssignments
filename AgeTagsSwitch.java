import java.util.*;
public class AgeTagsSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        int grp = 0;
        if(age<0){
            grp=1;
        }
        if(age>=0 && age<=2){
            grp=2;
        }
        else if(age<=13){
            grp=3;
        }
        else if(age<=18){
            grp=4;
        }
        else if(age<60){
            grp=5;
        }
        else if(age>=60){
            grp=6;
        }
        switch (grp) {
            case 1:
                System.out.println("Age Cannot Be Negative");
                break;
            case 2:
                System.out.println("Infant");
                break;
            case 3:
                System.out.println("Small kid");
                break;
            case 4:
                System.out.println("Teen");
                break;
            case 5:
                System.out.println("Adult");
                break;
            case 6:
                System.out.println("Old");
                break;
            default :
                System.out.println("Invalid age ");
                break;
                 
        }
    }
}

