package Exam1;
abstract  class Employee{
    String name;
    int id;
    double salary;
     public Employee(String name, int id,double salary){
this.name=name;
this.id=id;
this.salary=salary;
    }

 public   abstract double  calculatebonus();
public void display(){
    System.out.println(this.name);
    System.out.println(this.id);
    System.out.println(this.salary);
    System.out.println(this.calculatebonus());
}
}
class Manager extends Employee{
  public Manager(String name,int id,double salary)
  {
      super(name,id,salary);

  }
  public double calculatebonus(){
      return salary *0.15;
    }
}
class Developer extends Employee{
    public Developer (String name,int id,double salary)
    {
        super(name,id,salary);

    }
    public double calculatebonus(){
        return salary *0.20;
    }
}
public class Exam2 {
    public static void main(String[] args) {
        Employee[] obj2=new Employee[4];
        obj2[0]=new Manager("rohit",14,124.33);
        obj2[1]=new Manager("mohit",15,125.33);
        obj2[2]=new Developer("varun",16,126.33);
        obj2[3]=new Developer("venom",17,127.33);
        for(Employee emp:obj2){
            emp.display();

        }
    }
}
