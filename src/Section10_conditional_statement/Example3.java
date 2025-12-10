package Section10_conditional_statement;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the marks of student single subject");
        int number=input.nextInt();
        if(number>=91 && number<=100)
        {
            System.out.println("The grade of student is A+");
        }
        else if(number>=81 && number<=90)
        {
            System.out.println("The grade of student is A");
        }
        else if( number >=71 && number<80)
        {
            System.out.println("The grade of student is B+");
        }
        else if( number >=61 && number<70)
        {
            System.out.println("The grade of student is B");
        }
        else if( number >=51 && number<60)
        {
            System.out.println("The grade of student is c");
        }
        else if( number >=45 && number<50)
        {
            System.out.println("The grade of student is D");
        }
        else if(number<=44 && number>0){
            System.out.println("fail");
        }

        else{
            System.out.println("Invalid input");
        }
    }
}
