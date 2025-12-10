package section19_static_And_final_keyworda;
//driver class or application starter class

class skoda{
    final int x=10;
     static int price=30000;
     static public void print(){
         System.out.println(price);

     }
}


public class Example1 {
    public static void main(String[] args) {
        System.out.println(skoda.price);
        skoda.print();

    }
}
