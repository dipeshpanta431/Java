class person
{
    String name, address;
    void set(String name, String address)
    {
        this.name=name;
        this.address=address;
    }
    void show()
    {
        System.out.println(name+" "+address);
    }
}
class student extends person
{
    int roll;
    void put(String name, String address, int roll)
    {
        super.set(name,address);
        this.roll = roll;
    }
    void show()
    {
        System.out.println(roll);
    }
}
public class method_overriding 
{
 public static void main(String[] args) 
 {
  student s = new student();
  s.put ("Sabin","KMC",1);
  s.show();  
  }   
}
