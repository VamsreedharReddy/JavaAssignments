import java.util.*;
public class AgeTagsIf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age of Human : ");
        int age = sc.nextInt();
        if(age>0 && age<=2){
            System.out.print("Infant ");
        }
        else if(age>2 && age<=13){
            System.out.print("Small kid ");
        }
        else if(age>13 && age<18){
            System.out.print("Teenager ");
        }
        else if(age>=18 && age<60){
            System.out.print("Adult ");
        }
        else{
            System.out.print("Old man ");
        }

    }
}
