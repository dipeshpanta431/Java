class country
{
    String name;
    void set(String name)
    {
        this.name = name;
        System.out.println(name);
    }
}
class province extends country
{
    int province;
    void input(String name,int p)
    {
        province = p;
        set(name);
        System.out.println(province);
    }
}
class city extends province{
    String cname;
    void put(String name,int p,String c)
    {
        cname = c;
        input(name,p);
        System.out.println(cname);
    }
}
public class multi_level_hierarchy {
    public static void main (String[] args)
    {
        city ob = new city();
        ob.put("Nepal",3,"Kathmandu");
    }
    
}
