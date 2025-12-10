package section14_object_oriented_programming;



class students{
    String car_name;
    String car_brand;
    String car_colour;
    int car_number;
    void print(){
        System.out.println("name is " + car_name);
        System.out.println(car_brand);
        System.out.println(car_colour);
        System.out.println(car_number);
    }
}
public class oopexample5 {
    public static void main(String[] args) {
        students input=new students();
        input.car_name="maruti";
        input.car_brand= "audi";
        input.car_colour="blue";
        input.car_number=12;
        input.print();
    }
}
