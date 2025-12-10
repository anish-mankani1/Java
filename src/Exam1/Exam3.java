package Exam1;
 class anish extends invalidException{
     anish( String msg)
     {
         super(msg);
     }
 }
public class Exam3 {
   static void manish(String msg) throws anish
   {
       if (msg==null) throw new anish(" you are enetering wrong values");
   }

    public static void main(String[] args) {

        try
        {
            manish(null);
        }catch (invalidException e)
        {
            System.out.println(e.getMessage());
        }
    }






}
