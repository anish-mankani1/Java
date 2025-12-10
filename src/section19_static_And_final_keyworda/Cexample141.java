package section19_static_And_final_keyworda;
import java.util.Scanner;
public class Cexample141 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("ente the first number");
        int num1=input.nextInt();
        System.out.println("ente the second  number");
        int num2=input.nextInt();
        try
        {
            int result=num1/num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e)
        {
            System.out.println("input mismatched " + e.getMessage());
        }

    }
}
