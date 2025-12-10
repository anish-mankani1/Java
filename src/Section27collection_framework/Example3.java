package Section27collection_framework;

import java.util.Collection;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;



public class Example3 {
    public static void main(String[] args) {
        Collection<Integer> obj=new ArrayList<>(List.of(1,2,3,4,5,6));

        Stream<Integer> sobj=obj.stream();

        Function<Integer,Integer> modify=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                int x=integer;
                int square=integer*integer;
                return square;
            }
        };

             Function<String,String> modify2=new Function<String,String>()
        {
            @Override
            public String apply(String obj)
            {
                String stringconversion=obj.toUpperCase();
                return stringconversion;
            }
        };



Collection<String>  c2=new ArrayList<>(List.of("Anish","MANISH","tanish"));

List<String>  listobj2=c2.stream().map(modify2).toList();
        System.out.println(listobj2);



        List<Integer> listobj=sobj.map(modify).toList();
        System.out.println(listobj);

        Predicate<Integer> pobj=new Predicate<Integer>()
        {

            @Override


                public boolean test(Integer integer)
                {
                    int x=integer;

                    if(x%2==0)
                    {
                        return true;
                    }
                    return false;
                }



        };


        Collection<Integer>  c5=new ArrayList(List.of(1,2,3,4,5,6,7,8,9));

        List<Integer>  listobj3=c5.stream().filter(pobj).toList();
        System.out.println(c5);
        System.out.println("new list of predicate" + listobj3);

    }
}
