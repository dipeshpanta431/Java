import java.io.*;

class readcharacter {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Characterwrite.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}