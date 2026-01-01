import java.util.Scanner;

public class multiplication_table {
    public static void main(String[]args)
    {
        System.out.println("Enter integer:");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int i;
        System.out.println("Multiplication table of "+a+" is:");
        for(i=1;i<11;i++){
            int b=a*i;  
            System.out.println(a+"*"+i+"="+b);
    }
   }
}
