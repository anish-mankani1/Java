package packae16Abstractclass;
abstract class Super9{
    public Super9(){
        System.out.println("super class");
    }
    public void display(){
        System.out.println("function in display");
    }
  abstract public void method();


}
class sub extends Super9{
    public sub(){
        System.out.println("constrctor of sub2");
    }
    public void method(){
        System.out.println("sub class extending super class");
    }
}
public class Abstract3 {
    public static void main(String[] args) {
        sub obj=new sub();
        obj.method();

    }
}
