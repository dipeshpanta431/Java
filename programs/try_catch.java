public class try_catch {
    public static void main(String[] args) {
        int a = 50;
        System.out.println("Value of a: " + a);
        try {
            int b = a / 0; // Exception
            System.out.println("Value of b: " + b);
        } catch (ArithmeticException e) // Exception handled
        {
            System.out.println(e);
        }
        System.out.println("After try-catch block");
    }

}
