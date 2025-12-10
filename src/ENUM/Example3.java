package ENUM;

public class Example3 {
    public static void main(String[] args) {
        enum anish
        {
            hemant,rohit ,mohit;

        }
        anish a=anish.hemant;
        System.out.println(a);
        if(a==anish.hemant)
        {
            System.out.println("it is printing hrmant");
        }
    }
}
