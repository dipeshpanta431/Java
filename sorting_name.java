import java.util.Arrays;

class student {
    int roll;
    String name;

    void setVar(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void show() {
        System.out.println(roll + " " + name);
    }
}

public class sorting_name {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setVar(01, "Dipesh Panta");
        student s2 = new student();
        s2.setVar(02, "Priyanshi Panta");
        student s3 = new student();
        s3.setVar(03, "Aarvi Poudel");
        student s4 = new student();
        s4.setVar(04, "Sapana Thapa");
        student s5 = new student();
        s5.setVar(05, "Rojina Bista");
        student s6 = new student();
        s6.setVar(06, "Sabin Karki");
        student s7 = new student();
        s7.setVar(07, "Pratap Aadikari");
        student s8 = new student();
        s8.setVar(12, "Kushal Malla");
        student s9 = new student();
        s9.setVar(23, "Pawan Thapa");
        student s10 = new student();
        s10.setVar(10, "Bijay Rai");
        student[] stu = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };
        Arrays.sort(stu, (student st1, student st2) -> st1.name.compareTo(st2.name));

        for (student a : stu) {
            a.show();
        }
    }
}
