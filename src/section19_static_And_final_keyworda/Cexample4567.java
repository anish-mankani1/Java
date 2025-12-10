package section19_static_And_final_keyworda;
class Animal
{
    public void sound()
    {
        System.out.println("sound of animal");
    }

}

class dog extends Animal{
    public void sound()
    {
        System.out.println("sound of dog");
    }
}
class cat extends Animal{
    public void sound()
    {
        System.out.println("sound of cat");
    }
}
public class Cexample4567 {
    public static void main(String[] args) {
Animal a=new dog();
Animal b=new cat();
a.sound();
b.sound();

    }
}
