interface A {
    void set();
}

interface B {
    void show();
}

interface C extends A, B {
    void display();
}

class efg implements C {
    public void set() {
        System.out.println("Inside A");
    }

    public void show() {
        System.out.println("Inside B");
    }

    public void display() {
        System.out.println("Inside C");
    }
}

public class multipleInheritanceInterface {
    public static void main(String[] args) {
        C ob = new efg();
        ob.set();
        ob.show();
        ob.display();
    }
}
