class Abc {
    int a = 10;
    private int b = 15;

    class B {
        void show() {
            int c = a + b;
            System.out.println(c);
        }
    }

    void display() {
        B b = new B();
        b.show();
    }
}

public class inner_class {
    public static void main(String[] args) {
        Abc ob = new Abc();
        ob.display();
    }

}
