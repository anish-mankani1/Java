package Exam1;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class testing10 {
    static void checkAge(int age) throws MyException {
        if (age < 18) throw new MyException("Age must be 18 or above");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


