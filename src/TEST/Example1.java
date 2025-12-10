package TEST;
import java.util.Scanner;


public class Example1 {

    public static void println(String name,int age,int  salary,String address){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("salary is " + salary);
        System.out.println("Address is " + address);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args){

        int age,salary;
        String name,address;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.println("Enter your age");
        age=input.nextInt();
        System.out.println("Enter your salary");
        salary=input.nextInt();
        System.out.println("Enter your address");
        input.nextLine();
        address=input.nextLine();
        println(name,age,salary,address);

    }
}
