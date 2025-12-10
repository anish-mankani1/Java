package TEST;
import java.util.Scanner;
public class loop6 {
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the number you want");
        //Write a program that takes an integer as input as x from user and display the
        //multiplication table using for-loop.

        int number=input.nextInt();
        for(int i=1;i<=10;i++){
                System.out.println( i + " * " + number + "= " + i*number);
            }
        }

    }

