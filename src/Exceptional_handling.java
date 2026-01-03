class exception extends Exception
{
    public exception(String message)
    {
        super(message);
    }

}

public class Exceptional_handling
{
    public static void main(String[] args) {
        int age=10;

        try {
            if (age<18)
            {
                throw new exception("age should be greated than 18");

            }
        else
            {
                System.out.println("you are allowed");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
