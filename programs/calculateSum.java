import java.util.Scanner;

public class calculateSum {
    public static int calculateSum(int a,int b)
    {
       int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Sum of two given numbers is: "+sum);
    }
    
}
