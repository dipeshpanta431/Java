import java.util.Scanner;

public class comparison {
    public static void main(String []args)
    {
        System.out.println("Enter two integers (a and b):");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b) {
          System.out.println("b is greater.");  
        }
        else if (a>b) {
            System.out.println("a is greater");
        }
        else
           System.out.println("Both are equal.");
    }
    
}
