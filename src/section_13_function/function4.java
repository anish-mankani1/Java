package section_13_function;
import java.util.Scanner;
public class function4 {


    public static void print(int number){

        for(int i=1;i<=10;i++) {


            System.out.println(number +  " * " + i  + " = " + number*i);
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the  number that you want  for table");
        int number=input.nextInt();


        print(number);


    }
}
