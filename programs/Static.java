class staticExample{
    static int a=10;
    static int b;
    static void show(int c){
        System.out.println(a+" "+b+" "+c);
    }
    static{
        b=a+5;
    }
public static void main(String[] args) {
    show(12);
}
}