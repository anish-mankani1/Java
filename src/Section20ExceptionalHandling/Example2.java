package Section20ExceptionalHandling;

public class Example2 {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,5,0};
        int r;
        try{
            r=a[0]/a[1];
            System.out.println(r);
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("you are dividng number by zero");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
