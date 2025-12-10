package section19_static_And_final_keyworda;
import java.util.Arrays;
 class employeee{
     int x=10;
     static int y;
     static {
         System.out.println("block1");
         y=17;
     }
     static {
         System.out.println("block2");
         System.out.println(y);
     }

         public static void main(String[] args) throws ClassNotFoundException
         {
             System.out.println("main");
         }

 }

