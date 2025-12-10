
package Exam1;
import java.util.Scanner;
abstract class colleges{
    String collegename;
    colleges(String collegename)
    {
        this.collegename=collegename;
    }
    public abstract void display();
}
interface colleges2{
    void displayfacultyinfo();
}

// exception
class invalidException extends Exception
{

    public invalidException (String message)
    {
        super(message);
    }
}

 class jits extends colleges implements colleges2
{
    String departmentname;
    jits(String collegename,String departmentname) throws invalidException {
        super(collegename);
        if (departmentname == null) throw new invalidException("department name is invalid");
        this.departmentname = departmentname;
    }
        public void displayfacultyinfo()
        {
            System.out.println("hii this is faculty body");
        }
        public void display()
        {
            System.out.println(collegename);
            System.out.println(departmentname);
        }
    }


public class Testing2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter college name ");
       String  collegename=input.next();
        System.out.println("enter department name");
        String  departmentname=input.next();
        try {
            jits obj = new jits("jhulalela", "cse");
            System.out.println(obj.collegename);
        }catch (invalidException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
