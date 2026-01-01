import java.util.*;

class factorial {
    int fact(int i) {
        if (i == 1 || i == 0) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }
}

public class factorial01 {
    public static void main(String[] args) {
        factorial fc = new factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int a = sc.nextInt();

        System.out.println("Factorial of " + a + " is: " + fc.fact(a));
        sc.close();
    }

}
