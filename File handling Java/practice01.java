import java.io.*;

public class practice01 {
    public static void main(String[] args) {
        // writing in a file
        try {
            FileOutputStream fout = new FileOutputStream("name.txt");
            String name = "Dipesh Panta";
            String age = "20";
            byte b[] = name.getBytes();
            byte c[] = age.getBytes();
            fout.write(b);
            fout.write(c);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // reading from a file
        try {
            FileInputStream fin = new FileInputStream("name.txt");
            int i;
            while ((i = fin.read()) != -1)

            {
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
