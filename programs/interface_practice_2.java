interface Exam {
    void setExam(String division, int mark);

    void showExam();
}

class test implements Exam {
    String division;
    int mark;

    public void setExam(String division, int mark) {
        this.division = division;
        this.mark = mark;
    }

    public void showExam() {
        System.out.println("obtained division: " + division);
        System.out.println("obtained mark: " + mark);
    }
}

public class interface_practice_2 {
    public static void main(String[] args) {
        Exam ex = new test();
        ex.setExam("distinction", 88);
        ex.showExam();
    }
}
