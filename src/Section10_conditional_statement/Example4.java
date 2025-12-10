package Section10_conditional_statement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the temperature ");
        int number=input.nextInt();
        if(number>=71 && number<=100)
        {
            System.out.println("Turn on AC");
        }
        else if(number>=51 && number<=70)
        {
            System.out.println("Turn on cooler");
        }
        else if( number >=31 && number<=50)
        {
            System.out.println("Turn on fan");
        }
        else if( number >=11 && number<=30)
        {
            System.out.println("Drink coffe");
        }
        else if( number<=10 )
        {
            System.out.println("Drink beer");
        }
        else{
            System.out.println("Invalid input");
        }

    }

}
