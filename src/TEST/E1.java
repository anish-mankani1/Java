package TEST;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("enter the string you want to replace");
        String obj=input.nextLine();
        String a="";
        for(int i=obj.length() - 1;i>=0;i--)
        {
            a+=obj.charAt(i);
        }
        System.out.println(a);
    }
}
