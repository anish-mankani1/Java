package inheritance_programs;
abstract class course{
    String name;
    public abstract double  calculatefee();
    public course(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.calculatefee());
    }

}
 class onlinecourse extends course{

  int videohousrs;
     public onlinecourse(String name,int hour) {
         super(name);
         this.videohousrs =hour;
     }


     @Override
  public double calculatefee(){

      return videohousrs*200;
  }
}
class offlinecourse extends course{
int classroomhours;

    public offlinecourse(String name,int hour) {
        super(name);
        this.classroomhours =hour;
    }
@Override
public double calculatefee(){
    return classroomhours * 300;
}
}

public class inheritance6 {
    public static void main(String[] args) {
  course obj=new onlinecourse("anish",5);
  obj.display();

     course obj2=new offlinecourse("manish",10);
     obj2.display();


    }
}
