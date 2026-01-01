class A {
    void show() {
        System.out.println("BIM");
    }
}

class B extends A {
    void show() {
        System.out.println("Second");
    }
}

class C extends A {
    void show() {
        System.out.println("Semester");
    }
}

public class polymorphismDemo {
    public static void main(String[] args) {
        A ob = new A();
        B obj = new B();
        C objt = new C();
        A r; // reference variable of A
        r = obj;
        r.show();
        r = objt;
        r.show();
        r = ob;
        r.show();
    }
}
