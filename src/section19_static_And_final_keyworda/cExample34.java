package section19_static_And_final_keyworda;

interface vehicle12{
    void  maxspeed();
}

class bike implements vehicle12{
  public void maxspeed()
  {
      System.out.println(" The maximum speed of bike is  100 ");
  }
}
 class car implements vehicle12{
     public void maxspeed()
     {
         System.out.println("the maximum speed of car is 180");
     }
 }
public class cExample34 {
    public static void main(String[] args) {
        bike obj=new bike();
        car obj2=new car();
        obj.maxspeed();
        obj2.maxspeed();
    }
}
