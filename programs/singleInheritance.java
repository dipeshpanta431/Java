class institution{
    String name, address;
    void set( String n, String a)
    {
        name = n;
        address = a;
        System.out.println(name+" "+address);
    }
}
class faculty extends institution{
    String fname;
    void input(String n, String a,String f )
    {
        fname = f;
        set(n,a);
        System.out.println(fname);
    }
}
public class singleInheritance {
    public static void main(String[] args)
     {
    faculty ob = new faculty();
    ob.input("KCMIT","Mid-Baneshwor","Management");
    }
}