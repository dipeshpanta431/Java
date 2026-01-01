import java.util.*;

public class case_change {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.startsWith("U")) {
            String a = s.toUpperCase();
            System.out.println(a);
        } else if (s.startsWith("L")) {
            String b = s.toLowerCase();
            System.out.println(b);
        }
        sc.close();
    }
}
