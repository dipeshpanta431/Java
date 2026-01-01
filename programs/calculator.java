import java.util.*;

public class calculator {
    public static void main(String []arrgs)
    {
        System.out.println("Enter two integers:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Enter a operator");
        Scanner sc = new Scanner(System.in);
        String operator=sc.nextLine();
       
        switch (operator) {
            case "+":
                double c=a+b;
                System.out.print("Sum is:");
                System.out.println(c);
                break;
            case "-":
                if (a<b) {
                    double d=b-a;
                    System.out.print("Difference is:");
                    System.out.println(d);              
                }
                else{
                    double e=a-b;
                    System.out.print("Difference is:");
                    System.out.println(e);    
                }  break;
            case "*":
              double f = a*b;
              System.out.println("Product is:");
              System.out.println(f);
              break;
            case "/":
                double h=a/b;
                System.out.println("Division is:");
                System.out.println(h);  
             break; 
           default:System.out.println("Invalid operator");
                break;
        }
    }
    
}
