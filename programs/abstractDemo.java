abstract class example // abstract class
{
    void show() {
        System.out.println("This is concrete method.");
    }

    abstract void display(); // abstract method
}

class sub extends example {
    void display() {
        super.show();
        System.out.println("Implementing display!");
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        sub s = new sub();
        s.display();
    }

}
