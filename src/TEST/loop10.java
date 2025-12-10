package TEST;
import java.sql.SQLOutput;
import java.util.Scanner;
public class loop10{
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the number you want");
        //Write a program that takes an integer as input as n from user and compute the
        //factorial.

        int number=input.nextInt();
        int reverse=0;
      while (number > 0){
          int digit=number%10;
          reverse=reverse*10 + digit;
          number=number/10;
      }
        System.out.println("the number is " + reverse);
    }

}

