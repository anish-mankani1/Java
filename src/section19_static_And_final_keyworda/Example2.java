package section19_static_And_final_keyworda;

  class parent1{
     final public void method(){
        System.out.println("method 1 ");
    }
    public void method2(){
        System.out.println("met");
    }
}
class parent2  extends parent1
{
    public void method2(){

        System.out.println("method 2");
    }
}
public class Example2 {
    public static void main(String[] args) {

    }
}
