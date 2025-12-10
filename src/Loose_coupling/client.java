package Loose_coupling;

public class client {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.l1=new Dell_laptop();
        obj.project();
    }
}
