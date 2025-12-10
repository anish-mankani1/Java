package inheritance_programs;
class person{
    private String name;
    private int age;
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return this.age;
    }
    public void setage(int age){
        this.age=age;
    }
}
class employee extends person{
    private double salary;
    public double getsalary(){
        return this.salary;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
}
public class inheritance4 {
    public static void main(String[] args) {
        employee obj=new employee();
        System.out.println(obj.getname());
        System.out.println(obj.getage());
        System.out.println(obj.getsalary());
        obj.setname("anish");
        obj.setage(12);
        obj.setsalary(12.344);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
        System.out.println(obj.getsalary());


    }
}
