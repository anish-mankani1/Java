package packae16Abstractclass;
abstract class anish{
    public void disply(){
        System.out.println("hii bro");
    }
    public  abstract void method();
}
 class manish extends anish{
     public void method(){
         System.out.println("hii from child class");
     }
 }
public class Abstract4 {
    public static void main(String[] args) {
        anish obj=new manish();
        obj.method();
    }
}
