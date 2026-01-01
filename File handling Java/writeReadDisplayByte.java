import java.io.*;

public class writeReadDisplayByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("student.txt");
            String name = "Dipesh Panta\n";
            String roll = "Roll:10";
            byte b[] = name.getBytes();
            byte c[] = roll.getBytes();
            fo.write(b);
            fo.write(c);
            fo.close();
            System.out.println("Written Successful in file!");
            System.out.println();
            System.out.println("Output from the file:");
            try {
                FileInputStream fin = new FileInputStream("student.txt");
                int i;
                while ((i = fin.read()) != -1) {
                    System.out.print(i + " ");
                }
                fin.close();

            } catch (Exception f) {
                f.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Exit");
    }
}
