package TEST;
import java.util.Scanner;
public class loop8{
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the number you want");
      //Write a program that takes an integer as input as n from user and compute the
        //factorial.

        int number=input.nextInt();
        int fact=1;

        for(int i=number;i>0;i--)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }

}

