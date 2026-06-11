package chapter1.Variable_and_datatype;
import java.util.Scanner;
public class exercise_1 {
   public static void main(String[] args) {
       System.out.println("enter your subject marks here");
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the marks of math");
       float math =sc.nextFloat();
       System.out.println("enter the marks of english");
       float english = sc.nextFloat();
       System.out.println("enter the marks of hindi");
       float hindi = sc.nextFloat();
       System.out.println("enter the marks of science");
       float science = sc.nextFloat();
       System.out.println("enter the marks of social_science");
       float social_science = sc.nextFloat();
       //s
       float sum = math+english+hindi+science+social_science;
       System.out.println("total marks="+sum);
       //d
       float percentage = (sum/ 500.0F)*100;
       System.out.println("percentage is ="+percentage+"%");
    }
}
