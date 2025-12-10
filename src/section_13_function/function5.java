package section_13_function;
import java.util.Scanner;
public class function5 {


    public static void reverse(int number){

       int original=number;
        int rev=0;
       while(number!=0){
          int  d=number%10;
          rev=rev*10 + d;
         number=number/10;

       }
        System.out.println("the origignal number is " + original + " the reverse number is " + rev);
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number that you want to reverse");

        int number=input.nextInt();
        reverse(number);

    }
}
