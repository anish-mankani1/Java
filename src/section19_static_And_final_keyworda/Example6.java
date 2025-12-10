package section19_static_And_final_keyworda;


class Super{
final void method(){
    System.out.println("final classs");
}
        }
class child extends Super{

     void method2(){
         System.out.println("method 2 classs");

    }
}
public class Example6 {
    public static void main(String[] args) {
 child obj=new child();
 obj.method2();
 obj.method();

 Super obj2=new child();
 obj2.method();
    }
}
