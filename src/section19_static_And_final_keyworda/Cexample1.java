package section19_static_And_final_keyworda;

abstract class shape{
    public void area() {

    }


}
 class  circle extends shape{

    int radius=5;
    @Override
    public void area()
    {
        System.out.println((1/2) * radius);
    }
 }
 class rectangle extends shape{
    int lenght=2;
    int breadth=3;
     public void area()
     {
         System.out.println("the area is " +  lenght*breadth);

     }
 }

public class Cexample1 {
    public static void main(String[] args) {
   circle obj=new circle();
   rectangle obj2=new rectangle();

   obj.area();
   obj2.area();
    }
}
