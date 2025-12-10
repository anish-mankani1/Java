package Section27collection_framework;
import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Collection c1= new ArrayList(List.of('A','b','c','d','e'));
        Collection c2= new ArrayList(List.of('f','g','h','i','E','F'));
        System.out.println(c1);
        System.out.println(c2);

        c1.add('e');
        System.out.println(c1);

        c1.addAll((c2));
        System.out.println(c1);

        c1.remove('e');
        System.out.println(c1);

        c1.removeAll(c2);
        System.out.println(c1);

        c1.add('E');
        c1.add('F');

        c1.retainAll(c2);
        System.out.println("after retaining " + c1);

        boolean is_present=c1.contains('E');
        System.out.println(" checking values "  +  is_present);

        is_present=c1.containsAll(c2);
        System.out.println("After contain all values " + is_present);

        Collection c3=new ArrayList(List.of('1','2','3','4'));

        Collection c4=new ArrayList(List.of('1','2','3','4','5'));



        boolean is_similiar=c3.equals(c4);
        System.out.println(is_similiar);

        int  sizze=c3.size();
        System.out.println("sizee " + sizze);

        boolean empty= c3.isEmpty();
        System.out.println(empty);


        Collection<String> c5= new ArrayList(List.of("pranay","gandhar","Anish"));
        Iterator it=c5.iterator();

        while (it.hasNext())
        {
            String o= it.next().toString();
            System.out.println(o);
        }

    }
}
