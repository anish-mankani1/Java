package TEST;
import java.util.Scanner;
public class Example5 {
    public static void addition(int num1,int num2){
   int result=num1 +num2;
   System.out.println(result);
    }
    public static void substraction(int num1,int num2){
        int result2=num1 - num2;
        System.out.println(result2);
    }
    public static void modulus(int num1,int num2){
        int result3=num1%num2;
        System.out.println(result3);
    }
    public static void division(int num1,int num2){
        int result4=num1/num2;
        System.out.println(result4);
    }
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the two number you want");
        int num1=input.nextInt();
       int  num2=input.nextInt();
         addition(num1,num2);
        substraction(num1,num2);
        modulus(num1,num2);
        division(num1,num2);


    }
}
