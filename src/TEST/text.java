package TEST;
import java.util.Scanner;
public class text {

    public String meth(String name){
        return name.replace(" ","");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string you want");
                String result=input.nextLine();
                text obj =new text();
        System.out.println(obj.meth(result));
    }
}
