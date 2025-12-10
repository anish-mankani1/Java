package section19_static_And_final_keyworda;

class student
{
     int age;
     int salary;
    String name;

    public student()
    {

    }
    public  student(String name)
    {
        this.name=name;
    }
    public student(String name, int age, int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return this.name + this.age + this.salary;
    }
}
public class cexample45768 {
    public static void main(String[] args) {
        student obj=new student();
        student obj1=new student("Anish");
        System.out.println(obj1.toString());
        student obj2=new student("ANISH",20,100);
        System.out.println(obj2.toString());

    }

}
