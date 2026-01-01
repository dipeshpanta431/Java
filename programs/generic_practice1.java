class Gen<T> {
    private T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    public T getob() {
        return obj;
    }

    void showType() {
        System.out.println("Type of T is: " + obj.getClass().getName());
    }
}

public class generic_practice1 {
    public static void main(String[] args) {
        Gen<Integer> ob = new Gen<Integer>(5);
        ob.showType();
        int c = ob.getob();
        System.out.println(c);
    }

}
