package TEST;
import java.util.Scanner;
public class Example4 {
    public static void println(String id,String credit,String amount,String status,String date){
        System.out.println(id);
        System.out.println(credit);
        System.out.println(amount);
        System.out.println(status);
        System.out.println(date);
        System.out.println("-----------------------------");


    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println(" enter Transaction ID: e.g. TXN1004");
        String id =input.nextLine();
        System.out.println(" enter Type: e.g. Credit");
        String credit =input.nextLine();
        System.out.println("enter Amount:  e.g.  $300");
        String amount =input.nextLine();
        System.out.println("enter Status:  e.g.  Pending");
        String status =input.nextLine();
        System.out.println(" enter Date:  e.g.  2024-12-04");
        String date =input.nextLine();
        System.out.println("-----------------------------");
        println(id,credit,amount,status,date);
    }
}
