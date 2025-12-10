package TEST;
import java.util.Scanner;
public class loop11 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the nuber");
        int number=input.nextInt();
        int count=0;
        while(number>0){
            count++;
            number=number%10;
            number=number/10;
        }
        System.out.println(count);

    }
}
