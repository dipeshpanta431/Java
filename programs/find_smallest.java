import java.util.*;
public class find_smallest {
    public static void main(String[] args) {
        System.out.println("Enter three numbers (a,b,c):");
        Scanner ob= new Scanner(System.in);
        double a;double b;double c;
        a=ob.nextDouble();
        b=ob.nextDouble();
        c=ob.nextDouble();
        if (a<b && a<c)
        System.out.println("a is smallest.");
        else if(b<c && b<a)
        System.out.println("b is smallest.");
        else if(c<a && c<b)
        System.out.println("c is smallest.");
    }
}
