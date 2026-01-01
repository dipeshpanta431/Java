public class throwDemo {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not a valid voter!");
        } else {
            System.out.println("Welcome to election!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(19);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Please vote for good candidate!");
    }
}
