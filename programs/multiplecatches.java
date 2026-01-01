public class multiplecatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("Value of a: " + a);
            int b = 15 / a;
            int c[] = { 100, 200 };
            c[5] = 98;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("After try-catch");
    }
}
