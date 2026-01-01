class Student {
    private String name;
    private double percentage;

    void set(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    void display() {
        System.out.println(name + " " + percentage);
    }

    String get_name() {
        return name;
    }

    double get_percentage() {
        return percentage;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set("Alice", 85.4);

        Student s2 = new Student();
        s2.set("Bob", 78.2);

        Student s3 = new Student();
        s3.set("Charlie", 92.3);

        Student s4 = new Student();
        s4.set("David", 67.8);

        Student s5 = new Student();
        s5.set("Eve", 89.1);

        Student s6 = new Student();
        s6.set("Frank", 74.5);

        Student s7 = new Student();
        s7.set("Grace", 81.9);

        Student s8 = new Student();
        s8.set("Hannah", 88.7);

        Student s9 = new Student();
        s9.set("Ivan", 76.3);

        Student s10 = new Student();
        s10.set("Judy", 91.4);
        Student S[] = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };

        Student topStudent = S[0];
        for (int i = 1; i < (S.length); i++) {
            if (S[i].get_percentage() > topStudent.get_percentage()) {
                topStudent = S[i];
            }
        }
        System.out.println("Student with highest percentage: ");
        topStudent.display();
    }

}
