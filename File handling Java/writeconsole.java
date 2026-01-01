import java.io.*;

public class writeconsole {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String name = "Dipesh Panta";
        int salary = 850000;
        pw.println(name + " " + salary);
    }

}
