package section19_static_And_final_keyworda;
import java.util.Scanner;

class ageexception extends Exception{
    public ageexception(String message)
    {
        super(message);
    }
}
public class cexample456 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age you want to check");
        int age= input.nextInt();
                try {
                    if (age < 18)
                    {
                        throw new ageexception("age should be greater then 18");
                    }

                    else
                    {
                        System.out.println("you are allowed");
                    }
                }catch (Exception e)
        {
            System.out.println("the exception is this " +e.getMessage());
        }
    }
}
