package Multithreading;

class print10 extends Thread {

    public void run() {
        int i = 10;
        {
            for (int j = 0; j <= i; j++) {

                try {
                    Thread.sleep(1000);
                    System.out.println(j);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    
                }
            }
        }

    }
}
class print5 extends Thread {
    int i = 5;

    public void run() {
        for (int j = 0; j <= i; j++) {
            try {
                Thread.sleep(1000);

                System.out.println(j);
            }
             catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }
}
public class Thread5 {
    public static void main(String[] args)
    {
            print10 obj=new print10();
           print5 obj1=new print5();
           obj.start();
            obj1.start();
    }
}
