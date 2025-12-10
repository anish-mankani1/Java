package Section27collection_framework;
import java.util.*;
import java.util.function.Function;

class person{
    private Integer id;
    private String name;
    private String lastname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public person(Integer id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public person()
    {

    }

    public String toString()
    {
        return "person {" +
                id + name + lastname ;
    }


}




public class Example2
{
    public static void main(String[] args) {


        Function<person,person> modifyid= new Function<person, person>() {
            @Override
            public person apply(person person) {

                int  increment= person.getId() + 10;
                person.setId(increment);
                return person;
            }
        };

        person obj = new person(12, "Anish", "mankani");
        person obj2 = new person(13, "Manish", "mankani");
        person obj3 = new person(14, "Tanish", "mankani");
        person obj4 = new person(15, "Rakshah", "mankani");

        Collection<person> collectionobj = new ArrayList<>();


        collectionobj.addAll(List.of(obj,obj2,obj3,obj4));

        System.out.println(collectionobj);

        List<person> listobj=collectionobj.stream().map(modifyid).toList();
        System.out.println(listobj);
    }

}


