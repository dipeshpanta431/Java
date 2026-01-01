import java.util.*;
public class printFactorial{
    public static void printFactorial(int n){
        if(n<0){
        System.out.print("Invalid number.");
        return;}
        int factorial=1;
        for(int i=n;i>=1;i--){
         factorial = factorial * i;
      }
      System.out.println("Factorial of "+n+" is: "+factorial);
      return;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n); 
    }
    
}
