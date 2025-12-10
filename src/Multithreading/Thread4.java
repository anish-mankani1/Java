package Multithreading;




public class Thread4 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String[] args) {
        thread obj = new thread();
        obj.start();
        int i = 1;
        while (true) {
            System.out.println(i + "world");
            i++;
        }
    }
    }


