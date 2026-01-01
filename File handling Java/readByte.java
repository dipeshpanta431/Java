import java.io.*;

public class readByte {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("name.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.println(i);
                fin.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
