package Exam1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Testing5 {
    public static void main(String[] args) {
        List<Integer> c1= new LinkedList<>(List.of(1,2,3,4,5));
        List<Integer> c2= new ArrayList(List.of(1,2,3,4,5));

        System.out.println(c1);
        System.out.println(c2);

        int element= c1.get(2);
        System.out.println(element);

        c1.set(2,-99);
        element=c1.get(2);
        System.out.println(element);


        c1.add(17);
        System.out.println(c1);

        c1.add(3,898);
        System.out.println(c1);

        c1.addAll(c2);
        System.out.println(c1);

        c1.addLast(7689);
        System.out.println(c1);

        c1.addFirst(954);
        System.out.println(c1);


    }
}
