class A {
    int a = 10;
    private int b = 20;

    class B {
        void show() {
            System.out.println(a + " " + b);
        }
    }

    void display() {
        B b = new B();
        b.show();
    }
}

public class nestedclass {
    public static void main(String[] args) {
        A ob = new A();
        ob.display();
    }

}
