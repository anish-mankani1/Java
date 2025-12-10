package TEST;
import java.util.Scanner;
public class loops3 {
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        //Write a program that takes an integer as input from user as n and counts from 0
        //to n.

        System.out.println("enter the number you want");
        int number=input.nextInt();
        int count=-0;
        for(int i=0;i<=number;i++){
            count+=i;

        }
        System.out.println("the count is "  + count);
    }
}
