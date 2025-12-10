package TEST;
import java.util.Scanner;
public class loop7{
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the number you want");
        //Write a program that takes an integer as input as n from user and compute the
        //sum of first n natural numbers using for loop.
        int number=input.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;

        }
        System.out.println(sum);
    }

}

