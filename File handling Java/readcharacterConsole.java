import java.io.*;

class readcharacterConsole {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a character: ");
            char ch;
            do {
                ch = (char) br.read();
                System.out.println(ch);

            } while (ch != 'q');

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}