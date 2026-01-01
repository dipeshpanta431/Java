interface student
{
    String name = "Dipesh";
    int age = 19;
}
class std implements student
{
     void show ()
     {
        System.out.println(name+" "+age);
     }
}
public class variableInterface {
    public static void main(String[] args) {
   std ob = new std();
    ob.show();
}
}