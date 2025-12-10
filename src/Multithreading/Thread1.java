package Multithreading;

public class Thread1 {




// Order of execution of statements is known as flow of program.
// This flow is known as Single Control Flow that is executing the program
// This single control flow is known as single program or it is just a single thread.
// This is a main thread.

    static void display()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args)
    {
        display();
        System.out.println("World");
    }
}
