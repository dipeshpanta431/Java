class person {
    String name;
    int age; 

    person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}

class worker extends person {
    int salary;

   worker (String name, int age, int salary) {
        super(name, age); // Using super to call the constructor of the superclass
        this.salary = salary;
        System.out.println(salary);
    }
}

public class superDemo {
    public static void main(String[] args) {
        worker w = new worker("Rahul", 19, 7375);    
    }
}
