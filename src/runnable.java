class run implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        run obj=new run();
        run obj2=new run();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();
        t2.start();
    }


}
