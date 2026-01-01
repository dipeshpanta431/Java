class access{
    int a;
    public int b;
    private int c;
    void setc(int c)
    {
        this.c=c;
    }
    int getc()
    {
        return c;
    }
  
}
public class access_control {
    public static void main(String[] args) {
        access ob = new access();
        ob.a= 5;
        ob.b= 10;
        ob.setc(15);
        System.out.println(ob.a+" "+ob.b+" "+ob.getc());

    }
    
}
