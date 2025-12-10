package inheritance_programs;



class circle{


  private   double radius;


  public circle(){
      System.out.println("no argumnet constructor");
  }
  public circle(double radius){
      this.radius=radius;
      System.out.println("all argument constructor");
  }

  //getters and setters
    public double getradius() {
        return this.radius;
    }
    public void setradius(double rad){
            this.radius=rad;
        }


        //function circle
     public double area(){
      double result=Math.PI * this.radius*this.radius;
      return result;
     }
     public double perimeter(){
      return 2 *Math.PI*this.radius;
     }

     class cylinder extends circle{
      private double height;
      public double volume(){
          double vol=Math.PI*this.getradius()*this.getradius() *this.height;
          return vol;
      }
     }

}
public class inhertance1 {
    public static void main(String[] args) {
        circle obj=new circle();
        System.out.println(obj.getradius());
        double a=obj.area();
        System.out.println(a);
        obj.setradius(100);
         a=obj.area();
        System.out.println(a);
    }
}
