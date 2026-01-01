class MyException extends Exception {
    int detail;

    MyException(int a) {
        detail = a;
    }

    public string tostring() {
        return "My Exception[" + detail + "]";
    }
}

public class custom_exception {
    static void show(int a) throws MyException {
        System.out.println("a:" + a);
        if (a > 20)
            throw new MyException(a);
        System.out.println("Normal Exit!");
    }

    public static void main(String[] args) {
        try {
            show(10);
            show(25);
        } catch (MyException e) {
            System.out.println("caught:" + e);
        }
    }
}
