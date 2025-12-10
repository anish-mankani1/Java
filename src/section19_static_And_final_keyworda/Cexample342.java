package section19_static_And_final_keyworda;


import java.util.*;

public class Cexample342 {
    public static void main(String[] args) {
       List<String> obj=new ArrayList<>();
       obj.add("Anish");
       obj.add("Rohit");
       obj.add("Mohit");
        System.out.println(obj + "  Arraya list");

        Collection<Integer> obj2=new LinkedList<>();
        obj2.add(1);
        obj2.add(2);
        obj2.add(3);
        System.out.println(" Linked list " + obj2);

        Set<Float> obj3=new HashSet<>();
        obj3.add(11.11f);
        obj3.add(11.12f);
        obj3.add(11.13f);
        obj3.add(11.13f);
        System.out.println(" set  "  + obj3);

        Collection<Float> obj4=new LinkedHashSet<>();
        obj4.add(12.11f);
        obj4.add(12.12f);
        obj4.add(12.13f);
        obj4.add(12.21f);
        System.out.println(" linked hashset  "  + obj4);

        Collection<Float> obj5=new TreeSet<>();
        obj5.add(13.11f);
        obj5.add(13.14f);
        obj5.add(13.13f);
        obj5.add(13.13f);
        System.out.println(" treeset  "  + obj5);

        Map<Integer,String> ob=new HashMap<>();
        ob.put(1,"Anish");
        ob.put(2,"Manish");
        ob.put(5,"Tasnish");
        ob.put(11,"rohan");
        ob.put(22,"hgema");
        ob.put(1,"multan");
        System.out.println(" hashmap  " + ob);

        Map<Integer,String> ob1=new LinkedHashMap<>();
        ob1.put(1,"Anish");
        ob1.put(2,"Manish");
        ob1.put(5,"Tasnish");
        ob1.put(11,"rohan");
        ob1.put(22,"hgema");
        ob1.put(1,"multan");
        System.out.println(" linked hashmap  " + ob1);


        Map<Integer,String> ob2=new TreeMap<>();
        ob2.put(1,"Anish");
        ob2.put(2,"Manish");
        ob2.put(5,"Tasnish");
        ob2.put(11,"rohan");
        ob1.put(12,"hgema");
        ob2.put(1,"multan");
        System.out.println(" treemap  " + ob2);

        Queue<Integer> k1=new PriorityQueue<>();
        k1.add(1);
        k1.add(2);
        k1.add(3);
        k1.add(32);
        k1.add(31);
        System.out.println("queue " + k1);

        ArrayDeque<Integer> n1=new ArrayDeque<>();
        n1.addAll(List.of(1,2,3,4,5));
        n1.addLast(9);
        n1.addFirst(0);
        System.out.println("Array Deque  " + n1);

        Stack<String> h1=new Stack<>();
        h1.push("a");
        h1.push("b");
        h1.push("c");
        h1.pop();
        System.out.println("Stack  " +  h1);


        Set<Integer> sq=new TreeSet<>();
        sq.add(1);
        sq.addAll(List.of(2,3,4,2,1,3,4,3));
     System.out.println(sq + "the result ");
    }
}




