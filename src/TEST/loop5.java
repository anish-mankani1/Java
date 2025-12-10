package TEST;
import java.util.Scanner;
public class loop5 {
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the number you want");
        //Write a program that takes an integer as input as n and print even numbers
        //from 2 to N.
        int number=input.nextInt();
        for(int i=0;i<number;i++){
            if(i%2==0){
                System.out.println("the number is even "+ i);
            }
        }

    }
}
