package section14_object_oriented_programming;



class rectangle{
    int lenght;
    int breadth;
     int   area(){
        return lenght*breadth;
    }


        }
public class OOPS_EXAMPLE2 {
    public static void main(String[] args) {
        rectangle ab=new rectangle();
        ab.lenght=10;
        ab.breadth=20;
        System.out.println(ab.area());
    }
}
