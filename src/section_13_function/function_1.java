package section_13_function;
import java.util.Scanner;
public class function_1 {

       public static int sayhello(int l,int b,int h){
           int v=l*b*h;
           return v;
       }





    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int b=sayhello(10,20,30);
        System.out.println("the result " + b);
    }
}
