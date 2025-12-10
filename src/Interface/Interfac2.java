package Interface;

interface vehicle{
    void accelerate();
    void brake();
    void gearshift();
}
class maruti implements vehicle{
    @Override
    public void accelerate() {
        System.out.println("maruti ccelrate");
    }
    public void brake() {
        System.out.println("maruti brake");
    }
    public void gearshift() {
        System.out.println("maruti gearshift");
    }

}
class omni implements vehicle{
    public void accelerate() {
        System.out.println("omni ccelrate");
    }
    public void brake() {
        System.out.println("omni brake");
    }
    public void gearshift() {
        System.out.println("omni gearshift");
    }

}
public class Interfac2 {
    public static void main(String[] args) {

    }
}
