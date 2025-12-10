package TEST;
import java.util.Scanner;
public class Example2 {


    public static void calculation(String name,int price,int Quantity){
        System.out.println("name is "+ name);
        System.out.println("Price is "+ price);
        System.out.println("Quantity is " + Quantity);
        int total=price * Quantity;
        System.out.println("Total is "+ total);
        System.out.println("-----------------------------");

    }
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        System.out.println("Enter Item:  like - Monitor");
        String name=input.nextLine();
        System.out.println("Enter Price: e.g $200");
        int  price=input.nextInt();
        System.out.println("Enter Quantity: e.g 2");
        int  quantity=input.nextInt();
        calculation(name,price,quantity);




    }
}
