class A {
    interface abc {

        void show();
    }
}

class xyz implements A.abc {
    public void show() {
        System.out.println("Nested Interface");
    }
}

public class nestedInterface {
    public static void main(String[] args) {
        A.abc ob = new xyz();
        ob.show();
    }

}
