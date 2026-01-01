
// Program to check weather a character is alphabet or not.
import java.util.Scanner;

class check_alphabet {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner ob = new Scanner(System.in);
        char a = ob.next().charAt(0);
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z')
            System.out.println(a + " is an alphabet.");
        else
            System.out.println(a + " is not an alphabet.");
    }
}