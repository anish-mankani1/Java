package TEST;
import java.sql.SQLOutput;
import java.util.Scanner;
public class loop9 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("enter the first number you want");
        //Write a program that takes two integer as input as x, n from user and you have
        //to compute the X^n.

        int number = input.nextInt();
        int result = 1;
        System.out.println("enter the second number");
        int b = input.nextInt();
        for (int i = 0; i < b; i++) {
            result = result * number;

        }
        System.out.println(result);
    }

}


