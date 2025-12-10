package TEST;
import java.sql.SQLOutput;
import java.util.Scanner;
public class loop12{
    public static void main(String[] args){
        Scanner input=new Scanner((System.in));
      System.out.print("enter the first number");
      int m=input.nextInt();
        System.out.print("enter the second number");
        int n=input.nextInt();
        while(m!=n){
            if(m>n){
                m=m-n;

            }
            else{
                n=n-m;
            }

        }
        System.out.println(m + " " +  n);
    }

}

