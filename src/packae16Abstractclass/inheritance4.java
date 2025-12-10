package packae16Abstractclass;
abstract class employee{
    private String name;
    private double salary;
    public employee(String name, double salary){
        this.name=name;
        this.salary=salary;

    }
    public String getname(){
        return this.name;

    }
    public void setname(String name){
        this.name=name;
    }
    public double getsalary(){
        return this.salary;

    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public abstract double calculatebonus();
    public void display(){
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(this.calculatebonus());
    }
}
 class  manager extends employee{
    public manager(String name,double salary) {
        super(name,salary);
    }
    public double calculatebonus(){
        return getsalary()*0.20;
    }
}

class developer extends employee{
    public developer(String name,double salary) {
        super(name,salary);
    }
    public double calculatebonus(){
        return getsalary()*0.10;
    }
}

public class inheritance4 {
    public static void main(String[] args) {
   developer obj =new developer("anish",12.223);
   obj.calculatebonus();
   obj.display();
    }
}
