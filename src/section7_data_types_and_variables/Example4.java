package section7_data_types_and_variables;

import java.util.Scanner;

public class Example4 {
    public static void print(String name ,int price,int age,int total)
    {
        System.out.println(name);
        System.out.println(price);
        System.out.println(age);
        System.out.println(total);

    }


    public static void main(String[] args){
        byte num1;
        int num2;
        short num3;
        Scanner input=new Scanner(System.in);
        System.out.println("enter bute number");
        num1=input.nextByte();
        System.out.println(num1);

        String  a="anish";
        int  b=210;
        int  c=12;
        int d=12000;
        print(a,b,c,d);

        String num4;
        System.out.println("enter word");
        num4=input.next();
        System.out.println(num4);
        String num5;
        System.out.println("eneter a sentence");
        num5=input.nextLine();
        System.out.println(num5);
        int number=Integer.parseInt("123456");
        float number2=Float.parseFloat("1.111111");
        Double number3=Double.parseDouble("1111111111111");
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
    }



}


//public class Example(name,age,salary,address)
//{
//    System.out.println(name);
//    System.out.println(age);
//    System.out.println(salary);
//    System.out.println(address);
//
//
//}
//a=new Example("Anish",12,120000,"india");
