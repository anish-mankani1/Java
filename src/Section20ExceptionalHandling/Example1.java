package Section20ExceptionalHandling;

public class Example1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("the answqer is " + c);
        }
        catch (Exception e) {
            System.out.println("you are dividing a number by zero pls recheck that");
            System.out.println(e.getMessage());
        }


    }
}
