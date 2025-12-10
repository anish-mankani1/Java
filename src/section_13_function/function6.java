package section_13_function;
import java.util.Scanner;
public class function6 {


    public static void facto(int number){
          int result=1;
          for(int i=1;i<=number;i++){
              result*=i;
          }
        System.out.println("the factorial is " + result);


    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number that you want to factorial");

        int number=input.nextInt();
        facto(number);

    }
}
