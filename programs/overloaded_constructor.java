class Student {
    String name, address;
    int age, roll;

    Student() {
        name = "Ram";
        roll = 15;
        System.out.println(name + " " + roll);
    }

    Student(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println(name + " " + address);
    }

    Student(String n, String add, int a, int r) {
        name = n;
        address = add;
        age = a;
        roll = r;
        System.out.println(name + " " + address + " " + age + " " + roll);
    }
}

public class overloaded_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Hari", "Kathmandu");
        Student s3 = new Student("Ramesh", "India", 18, 21);

    }

}
