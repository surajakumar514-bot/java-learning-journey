package chapter1;
import java.util.Scanner;
public class code_04_taking_input {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any random number first");
        int a =sc.nextInt();
        //float a =sc.nextFloat();
        System.out.println("enter any random number second");
        int b= sc.nextInt();
        //float b =sc.nextFloat();
        int sum =a + b;
        System.out.println("sum of your entered number is = "+sum);
        System.out.println("you can tall me your name");
       // String name = sc.next();
        sc.nextLine();
        String name =sc.nextLine();
        System.out.println("hellO " + name + " how are you ");
        System.out.println("can you tall me your mobile number");
        long number =sc.nextLong();
        System.out.println("your name is = "+name);
        System.out.println("your mobile number = "+number);
     }
}
