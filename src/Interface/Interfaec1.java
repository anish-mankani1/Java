package Interface;
interface test1{
    public abstract void method1();
    public abstract void method2();

}
// implementation class
class test2 implements test1{
    @Override
    public  void method1(){
        System.out.println("method1");
    }
    public  void method2(){
        System.out.println("method 2 test 2");
    }
}
public class Interfaec1 {
    public static void main(String[] args) {
        test1 obj=new test2();
        obj.method1();
        obj.method2();

    }
}
