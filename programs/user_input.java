// Program to take information from user and display it.
import java.util.*;
public class user_input
{
    public static void main(String[]args)
    {
 System.out.println("Enter your name, address, age, weight:");       
Scanner ob= new Scanner(System.in);
String name=ob.nextLine();
String address=ob.nextLine();
int age=ob.nextInt();
double weight=ob.nextDouble();
System.out.println(name);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("Weight:"+weight);
    }
}
