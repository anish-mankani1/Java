package TEST;
import java.util.Scanner;
public class loop4 {
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
        System.out.println("enter the number you want");
        int number=input.nextInt();
        for(int i=number;i>=0;i--){
            System.out.println(i);
        }

    }
}
