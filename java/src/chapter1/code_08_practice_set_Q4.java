package chapter1;
//Q4. write a program to convert kilometer to miles..
import java.util.Scanner;
public class code_08_practice_set_Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(".......convert kilometer into miles........");
        System.out.println("enter kilometer here..");
        //miles = kilometer * 0.621371
        float kilometer = sc.nextFloat();
        System.out.println("your entered value is..="+kilometer+" km");
        double miles=kilometer*0.621371;
        System.out.println(kilometer+" km is "+miles+" miles");



    }
}
