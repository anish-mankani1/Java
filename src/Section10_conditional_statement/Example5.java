package Section10_conditional_statement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the First number ");
        int number=input.nextInt();
        System.out.println("Enter the Second number ");
        int number2=input.nextInt();
        System.out.println("enter the case");
        int x = input.nextInt();

        // 0 ADD
        //

        switch(x)
        {
            case 0:
                System.out.println("the addition is "  + (number + number2));
                break;
            case 1:
                System.out.println("The substraction is" + (number - number2));
                break;
            case 2:
                System.out.println("The multiplication is" + (number*number2));
                break;
            case 3:
                System.out.println("The division is" + (number/number2));
                break;
        }


    }

}
