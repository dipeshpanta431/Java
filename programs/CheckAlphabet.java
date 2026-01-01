
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is an alphabet
        if (Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is an alphabet.");
        } else {
            System.out.println("'" + ch + "' is not an alphabet.");
        }

        // Close the scanner
        scanner.close();
    }
}
