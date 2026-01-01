class genericss<T> {
    private T objt;

    genericss(T objt) {
        this.objt = objt;
    }

    public T getob() {
        return objt;
    }

    void showType() {
        System.out.println("Type is: " + objt.getClass().getName());
    }
}

public class genericExample2 {
    public static void main(String[] args) {
        genericss<Float> ob1 = new genericss<Float>(1.1f);
        float c = ob1.getob();
        ob1.showType();
        System.out.println(c);
    }

}
