package chapter1.Variable_and_datatype;
//Q3. write a program which ask the user to enter his / her name and
// greet them with "hello <name> have a good day"text
import java.util.Scanner;
public class code_07_practice_set_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        // suraj
        // surajkumar
       // String name =sc.next();
        //to write full name eg.. suraj kumar
        sc.nextLine();
        String Name =sc.nextLine();
        System.out.println("hello "+Name+" have a good day");

    }
}
