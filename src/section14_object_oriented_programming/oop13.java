package section14_object_oriented_programming;
class employee{
    private String employename;
    private int employeid;
    private double employesalary;
    private byte workinghours;
    public void setemployeename(String name){
        employename=name;

    }
    public String getemployeename()
    {
        return employename;
    }
    public void setemployeeid(int id){
        employeid=id;

    }
    public int getemployeeid()
    {
        return employeid;
    }
    public void setemployesalary(double salary){
        employesalary=salary;

    }
    public double getemployesalary()
    {
        return employesalary;
    }
    public void setemployeworkinghour(byte whr){
        workinghours=whr;

    }
    public byte getemployeworkinghour()
    {
        return workinghours;
    }
    public void print(){
        System.out.println("the employe name is" + employename);
        System.out.println("the employee is is " + employeid);
        System.out.println("the employee salary is " + employesalary);
        System.out.println("the employee working hours is " + workinghours);
    }
}
public class oop13 {


    public static void main(String[] args) {
        employee obj =new employee();
        obj.setemployeeid(12);
        obj.setemployeename("anish");
        obj.setemployesalary(1234.23);
        obj.setemployeworkinghour((byte)123);
obj.print();
    }
}
