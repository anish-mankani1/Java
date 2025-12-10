package section19_static_And_final_keyworda;

interface vehicle{
    void accelerate();
    void brake();
    default void twoseater(){
        System.out.println("duggati two seater");
    }
}

class ferari implements  vehicle{
    public void accelerate(){
        System.out.println("acclerate from ferrai");
    }
    public void brake(){
        System.out.println("ferRAI brake");
    }
}

class omni implements vehicle
{

    @Override
    public void accelerate() {
        System.out.println("omni accelerate");
    }

    @Override
    public void brake() {
        System.out.println("omni brake");
    }
}
public class Example3 {
    public static void main(String[] args) {

    }
}
