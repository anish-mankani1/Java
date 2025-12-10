package TEST;
import java.util.Scanner;
public class Example3 {
    public static void println(String name,String object,int marks,String grade,String remarks){
        System.out.println("name is "+ name);
        System.out.println("object is " + object);
        System.out.println("marks is "+ marks);
        System.out.println("grade is "+ grade);
        System.out.println("remarks is "+ remarks);


    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
      System.out.println("Name:  e.g Sneha");
        String name=input.nextLine();
        System.out.println("Subject: e.g. Computers");
        String object=input.nextLine();
        System.out.println("Marks: e.g. 95");
        int  marks=input.nextInt();
        System.out.println("Grade: e.g A+");
        String grade=input.next();
        System.out.println("Remarks: e.g.Outstanding");
        input.nextLine();
        String remarks=input.nextLine();
        println(name,object,marks,grade,remarks);
    }
}
