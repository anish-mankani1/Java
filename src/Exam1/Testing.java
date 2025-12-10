package Exam1;
abstract class college{
    public abstract  void department();
    public abstract  void fees();
}
interface Faculty{
    public void form();
    default void that(){
        System.out.println("this is just a demo");
    }
}
class jit extends college implements Faculty{
   public  void  department(){
        System.out.println("jit");
    }
    public  void  fees(){
        System.out.println("20000");
    }
    public  void form (){
        System.out.println("jit from");
    }
}
public class Testing {
    public static void main(String[] args) {
        jit obj=new jit();
        obj.department();
obj.fees();

    }
}
