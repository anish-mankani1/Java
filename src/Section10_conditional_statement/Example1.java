package Section10_conditional_statement;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=input.nextInt();
        System.out.println("enter the first number");
        int num2=input.nextInt();
        if(num1==num2)
        {
                System.out.println("Both number are same");
        }
        else{
            System.out.println("Both number are not same");
        }
    }
}
