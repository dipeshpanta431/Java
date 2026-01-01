import java.io.*;

public class writeByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("name.txt");
            String name = "Dipesh Panta";
            byte b[] = name.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
