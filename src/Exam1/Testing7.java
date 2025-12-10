package Exam1;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Testing7 {
    public static void main(String[] args) {
      List<String> list1=new LinkedList<>();

      list1.addAll(List.of("John","johnny","janarathan","amar"));
        System.out.println(list1);

         Stream<String> ss =list1.stream();

        System.out.println(ss.toList());

        Function<String,String> obj = new Function<String,String>()
        {
            public String apply(String s)
            {
                return s.toUpperCase();
            }
        };

        List<String>  printlist=list1.stream().map(obj).toList();
        System.out.println(printlist);

        List<String> A1=list1.stream().map(String::toUpperCase).toList();
        System.out.println(A1);

        List<String> A2=list1.stream().map(String::toLowerCase).toList();
        System.out.println(A2);


    }
}
