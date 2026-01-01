import java.util.*;
import java.io.*;

public class number_type {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Length of string is: " + (String.valueOf(str).length()));
        for (int i = 2; i < (String.valueOf(str).length()); i++) {
            if ((String.valueOf(str).length()) % i == 0) {
                try {
                    FileWriter fw = new FileWriter("composite.txt");
                    BufferedWriter br = new BufferedWriter(fw);
                    br.write(str);
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            } else {
                try {
                    FileWriter fw = new FileWriter("prime.txt");
                    BufferedWriter br = new BufferedWriter(fw);
                    br.write(str);
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        sc.close();
    }
}
