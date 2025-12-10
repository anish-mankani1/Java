package section14_object_oriented_programming;

class circle{
    double radius;
    double area(){
        return 3.41 * radius *radius;
    }
    double perimeter(){
        double perimeter=2*3.14*radius;
        return perimeter;
    }
}
public class OOP_EXAMPLE {


    public static void main(String[] args) {
        circle ab=new circle();
        ab.radius=98;
        System.out.println( ab.area());
        System.out.println(ab.perimeter());

    }
}
