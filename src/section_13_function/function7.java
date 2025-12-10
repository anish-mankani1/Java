package section_13_function;
import java.util.Scanner;
public class function7 {


    public static void count(int number){


        int count=0;
        while(number!=0){
            count++;
            number=number/10;

        }
        System.out.println("the count is " + count);
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number that you want to count");

        int number=input.nextInt();
        count(number);

    }
}
