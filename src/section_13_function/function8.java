package section_13_function;
import java.util.Scanner;
public class function8{


    public static void width(int len,int bred){
        System.out.println(" the lenght is " + len  );
        System.out.println(" the  bred is " + bred  );
        int area=bred *len;
        System.out.println(" the area is " + area );

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the lenght");
        int len=input.nextInt();
        System.out.println("enter the breadth");
        int bred=input.nextInt();


        width(len,bred);

    }
}
