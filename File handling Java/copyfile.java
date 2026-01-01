import java.io.*;

public class copyfile {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("student.txt");
            fout = new FileOutputStream("prime.txt");
            int length;
            while ((length = fin.read()) != -1) {
                fout.write(length);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
