package Interface;
interface abstractclass{
    void method();
   public abstract void method2();

}
class mychild implements abstractclass
{
    public void method(){
        System.out.println("method class");
    }
    public void method2(){
        System.out.println("method 2 classs");
    }
    public void method3(){
        System.out.println("method 3 class");
    }
}
public class Interface10 {
    public static void main(String[] args) {
        abstractclass obj=new mychild();
        obj.method();
        obj.method2();
        // a class which provide body to abstract class is known as implementation class
    }
}
