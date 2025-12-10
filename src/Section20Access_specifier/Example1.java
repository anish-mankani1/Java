package Section20Access_specifier;


class myclass{
    private int x=10;
    public int y=100;
    int z=19;
    protected int a=0;
}

class mychild extends myclass{
    public void method()
    {

    }
}
public class Example1 {
    public static void main(String[] args) {
        myclass obj=new myclass();
        System.out.println(obj.y);
        
    }
}
