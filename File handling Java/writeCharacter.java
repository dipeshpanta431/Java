import java.io.*;

public class writeCharacter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Characterwrite.txt");
            String name = "Kantipur College Of Management And Information Technology";
            fw.write(name);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
