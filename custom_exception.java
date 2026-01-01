public class custom_exception {
    static void validate(String phone_num) {
        if ((phone_num.length() != 10)) {
            throw new ArithmeticException("invalid phone number!");
        } else {
            System.out.println("phone number recorded.");
        }
    }

    public static void main(String[] args) {
        try {
            validate("9825987034");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
