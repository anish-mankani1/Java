package Section10_conditional_statement;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        if(number%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
