package ENUM;

public class Example1 {

    enum anish
    {
        sunday("hi i m sunday"),
        monday("hi i m sunday"),
        tuesday("hi i m sunday"),
        wednesday("hi i m sunday"),
        thursady("hi i m sunday"),
        friday("hi i m Friday"),
        saturday("hi i m sunday");

         private final String s;

         private anish(String s)
         {
             this.s=s;
         }
         public String getday()
         {
             return this.s;
         }
    }
    public static void main(String[] args) {
        anish a= anish.friday;
        System.out.println(a.getday());
    }
}
