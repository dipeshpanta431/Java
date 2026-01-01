import java.util.*;

public class stringComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  names of 5 persons:");

        String name[] = new String[5];
        for (int i = 0; i < 5; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Persons whose name starts with S are: ");
        for (int i = 0; i < 5; i++) {
            if (name[i].charAt(0) == 'S') {
                System.out.println(name[i]);
            }
        }
    }

}
