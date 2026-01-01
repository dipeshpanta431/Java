public class throexample {
    static void show() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Exception is handled");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            show();
        } catch (NullPointerException e) {
            System.out.println("Recaught");
        }
    }
}
