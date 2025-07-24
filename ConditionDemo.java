import java.util.*;
public class ConditionDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=s.nextInt();
        if(age<0){
           System.out.println("Age Cannot Be Negative");
        }
        else{
            if(age>=0 && age<=2){
              System.out.println("Infant");
            }else if(age>2 && age<=13){
              System.out.println("Small Lad");
            }else if(age>13 && age<18){
              System.out.println("Teen");
            }else if(age>=18 && age<60){
              System.out.println("Adult");
            }else{
              System.out.println("Old");
            }

        }
    
    }
    
}
