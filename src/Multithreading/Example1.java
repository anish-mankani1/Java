package Multithreading;
import java.util.Arrays;
import java.util.Scanner;

class pri extends Thread{
    private int threadnumber;
    public pri(int i)
    {
        this.threadnumber=i;
    }
      public void run()
      {
          for(int i=1;i<=5;i++)
          {
              System.out.println(i + "Thread" + threadnumber);
              try{
              Thread.sleep(1000);} catch (InterruptedException e) {

              }
          }
      }
 }
public class Example1 {
    public static void main(String[] args) {
for(int i=0;i<3;i++) {


    pri obj = new pri(i);

    obj.start();
}









    }
}
