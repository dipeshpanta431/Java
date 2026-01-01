public class exceptionHandlingExample1 {
    static void get() throws IllegalAccessException {
        System.out.println("New exception coming!!!");
        throw new IllegalAccessException("Access Denied!!!");
    }

    public static void main(String[] args) {

        try {
            get();
            int a = 10, b = 20;
            System.out.println("a+b: " + a + b);
            int c = (a + b) / 0;

        } catch (IllegalAccessException a) {
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);

        } finally {
            System.out.println("after exception handled!");
        }
    }

}
