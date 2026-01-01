import java.util.*;

class fibonacci {
    int fib(int i) {
        if (i == 0 || i == 1) {
            return i;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
}

public class fibonacci01 {
    public static void main(String[] args) {
        fibonacci fb = new fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term of sequence: ");
        int a = sc.nextInt();
        System.out.println("Fibonacci sequence of " + a + " is:" + fb.fib(a));
        for (int n = 0; n < a; n++) {
            System.out.print(fb.fib(n) + " ");
        }
    }

}
