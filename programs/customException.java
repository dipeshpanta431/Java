import java.util.Scanner;

class mobile extends Exception {
    String type;
    long phone_num;

    mobile(String type, long phone_num) {
        this.type = type;
        this.phone_num = phone_num;
    }

    public String toString() {
        return "Invalid number[" + phone_num + "]";
    }

}

public class customException {
    static void show(String type, long phone_num) throws mobile {
        System.out.println(type + " " + phone_num);
        if (String.valueOf(phone_num).length() > 10 || String.valueOf(phone_num).length() < 10) {
            throw new mobile(type, phone_num);
        }
        System.out.println("normal exit");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter mobile type and phone number");
            String ty;
            long a;
            Scanner sc = new Scanner(System.in);
            ty = sc.nextLine();
            a = sc.nextLong();
            show(ty, a);
            sc.close();   
        } catch (mobile m) {
            System.out.println(m);
        }
    }

}
