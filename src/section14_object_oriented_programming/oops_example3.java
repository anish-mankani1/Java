package section14_object_oriented_programming;

   class cylinder{
       double radius;
       double height;
       double perimeter(){
           return (4* radius) + (3*height);
       }
       double volume(){
           return 12;
       }
   }
public class oops_example3 {
    public static void main(String[] args) {
        cylinder ab=new cylinder();
        System.out.println(ab.volume());

    }
}
