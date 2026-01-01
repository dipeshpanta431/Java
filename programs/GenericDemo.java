class Gen<T> {
    private T obj1;

    Gen(T obj1) {
        this.obj1 = obj1;
    }

    public T getob() {
        return obj1;
    }

    void showType() {
        System.out.println("Type of T is: " + obj1.getClass().getName());
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Gen<Integer> ob1 = new Gen<Integer>(100);
        ob1.showType();
        int v = ob1.getob();
        System.out.println("Value is: " + v);

        Gen<String> ob2 = new Gen<String>("Generics!!!");
        ob2.showType();
        String s = ob2.getob();
        System.out.println(s);
    }
}
