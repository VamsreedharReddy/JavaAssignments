import java.util.Scanner;

public class AgesUsingIfElse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        byte age=sc.nextByte();
        if(age<0){
            System.out.println("Invalid Age");
        }
        else if(age>=0 && age<=2){
            System.out.println("Infant");
        }
        else if(age>2 && age<12){
            System.out.println("Small Kid");
        }
        else if(age>12 && age<=18){
            System.out.println("Teen Ager");
        }
        else if(age>18 && age<=60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Old People");
        }
        sc.close();
    }
}
