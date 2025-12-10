package Exam1;



import java.util.*;

public class Testing11 {
    public static void main(String[] args) {
        List<Person>  personlist= new ArrayList<>();

        Person obj=new Person("Anish",12,12.34f);
        Person obj2=new Person("MAnish",13,11.34f);
        Person obj3=new Person("TAnish",14,15.34f);
        Person obj4=new Person("Anisha",15,18.34f);
        personlist.add(obj);
        personlist.add(obj2);

        personlist.addAll(List.of(obj3,obj4));
        System.out.println(personlist);

    }
}

class Person {
    private String name;
    private int age;
    private float marks;

    public Person(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", marks=" + marks + "}";
    }
}