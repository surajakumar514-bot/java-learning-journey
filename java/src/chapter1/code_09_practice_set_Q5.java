package chapter1;
//Q5. write a java program to detcet whether a number is entered by user is integer or not.
import java.util.Scanner;
public class code_09_practice_set_Q5 {
    public static void main(String[] args) {
        System.out.println("enter a number here..");
        Scanner sc = new  Scanner(System.in);
       // int num = sc.nextInt();
        //System.out.println(num);
        System.out.println(sc.hasNextInt());

    }
}
