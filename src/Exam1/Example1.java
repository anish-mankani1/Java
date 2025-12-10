package Exam1;
abstract class Animal{
    public abstract void sound();
    public void  sleep()
    {
        System.out.println("sleeppppp");
    }
}

class dog extends Animal{
    public void sound(){
        System.out.println("dog  sound whu whu");
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("cat  sound mihahu ");
    }
}
public class Example1 {
    public static void main(String[] args) {
  Animal  obj=new dog();
        Animal  obj1=new cat();
        obj.sound();
        obj.sleep();
        obj1.sound();
        obj1.sleep();
    }
}
