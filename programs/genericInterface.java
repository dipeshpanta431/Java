interface exampleinterface<T> {
    void show(T t);

}

public class genericInterface implements exampleinterface<Integer> {
    int t;

    public void show(Integer t) {
        this.t = t;
    }

    public int get() {
        return t;
    }

    public static void main(String[] args) {
        genericInterface ob = new genericInterface();
        ob.show(22);
        System.out.println(ob.get());
    }

}
