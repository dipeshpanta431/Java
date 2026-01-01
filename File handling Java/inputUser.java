import java.io.*;
import java.math.*;

import java.util.*;

public class inputUser {
    public static void main(String[] args) {
        String name;
        String age;
        System.out.println("Enter you name, age:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("student.txt");
            BufferedWriter br = new BufferedWriter(fw);
            br.write(name);
            br.write(age);
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
