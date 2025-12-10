package section19_static_And_final_keyworda;

import java.util.function.Function;

abstract  class Anish{
    public  abstract void animal();
}
public class cxexample34 {
    public static void main(String[] args) {
        Anish a=new Anish()
        {
            public void animal()
            {
                System.out.println("hello from anonymous class");
            }

        };
        a.animal();
    }



}
