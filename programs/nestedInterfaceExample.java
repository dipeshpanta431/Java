interface abc {
    void set();

    interface xyz {
        void show();
    }
}

class pqr implements abc, abc.xyz {
    public void set() {
        System.out.println("Inside abc");
    }

    public void show() {
        System.out.println("Inside xyz");
    }
}

public class nestedInterfaceExample {
    public static void main(String[] args) {
        abc ob1 = new pqr();
        ob1.set();
        abc.xyz ob2 = new pqr();
        ob2.show();
    }
}
