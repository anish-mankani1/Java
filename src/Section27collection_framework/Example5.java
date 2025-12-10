package Section27collection_framework;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example5 {

    public static void main(String[] args) {


        Collection<String> c1= new ArrayList(List.of("Anish","Manish","TANISH","Hema"));
        Collection<Integer> c2= new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        Function<String,String> obj= new Function<String, String>() {
            @Override
            public String apply(String s) {

                String ss=s.toUpperCase();
                return  ss;
            }};

        Predicate<Integer> pobj=new Predicate<Integer>()
        {
            public boolean test(Integer integer)
            {
                if(integer%2==0)
                {
                    return true;
                }
                return false;
            }
        };


        List<String> lobj=c1.stream().map(obj).toList();
        System.out.println("String object after travesing and performing operation " + lobj);
        List<Integer> lobj2=c2.stream().filter(pobj).toList();

        System.out.println("Integer object after performing operation " + lobj2);

    }
}
