package section_13_function;
import java.util.Scanner;
public class function2 {

    public static int add(int a,int b){

        return a+b;
    }

    public static int sub(int c,int d){
        return c-d;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the values for additon");;
        int a=input.nextInt();
        int b=input.nextInt();

        int result=add(a,b);
        System.out.println("The result for additon is " + result);

        System.out.println("enter the values for substraction");;
        int c=input.nextInt();
        int d=input.nextInt();

        int result2=sub(c,d);
        System.out.println("The result for additon is " + result2);


    }
}
