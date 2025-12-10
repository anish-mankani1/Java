package Section27collection_framework;

import Section27collection_framework.model.cat;

import java.util.LinkedList;

public class Example4 {
    public static void main(String[] args) {


        LinkedList<cat> obj = new LinkedList<>();
        cat catobj = new cat("tom");
        cat catobj2 = new cat("jerry");

        obj.add(catobj);
        obj.add(catobj2);
        obj.add(new cat("robert"));
        obj.add(new cat("rakesh"));
        System.out.println(obj);


        try {
            obj.remove(catobj);
        } catch (Exception e) {
            System.out.println(e); ;
        }

        System.out.println(obj);


    }
}
