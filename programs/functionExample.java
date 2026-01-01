import java.util.Scanner;

public class functionExample {
    public static void printMyName (String name){
        System.out.println("Hello "+name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        printMyName(name);
    }
    
}
