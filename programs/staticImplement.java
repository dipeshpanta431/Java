class static_demo{
    static int a=5;
    static int b=10;
    static void show()
    {
    System.out.println(a);
    }
}
public class staticImplement {
    public static void main(String[] args) {
        static_demo.show();
        System.out.println(static_demo.b);
    }
}
