package polymorphism;

class Super{
    public void display(){
        System.out.println("hello");
    }
}
class sub extends Super{//overrided method
    @Override//annotation
    public void display(){
        System.out.println("hello world subclass");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Super obj=new Super();
        obj.display();
        sub Sub=new sub();
        Sub.display();
        Super sobj=new sub();
        sobj.display();
    }
}
