package section19_static_And_final_keyworda;
 class employee{
     static int x=10;
     int y;
      void show(){
         System.out.println(x);
         System.out.println(y);

     }
     static void display(){
         System.out.println(x);
     }
     static {
         System.out.println("block01 ");
     }
 }
public class Example4 {
    public static void main(String[] args) {
        employee t1=new employee();
        t1.show();
        employee.display();
        employee t2=new employee();
    t2.show();
    }
}
