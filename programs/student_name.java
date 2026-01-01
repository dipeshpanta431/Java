class student {
    private String name;
    private int age;

    void set(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    int getage() {

        return age;
    }
}

class student_name {
    public static void main(String[] args) {   
        student ob1 = new student();
        ob1.set("Prinsha", 12);
        student ob2 = new student();
        ob2.set("Priyanshi", 8);
        student ob3 = new student();
        ob3.set("Dipesh", 19);
        student ob4 = new student();
        ob4.set("Sabin", 18);
    if (ob1.getage() < ob2.getage() && ob1.getage() < ob3.getage() && ob1.getage() < ob4.getage())
     {
       ob1.display();
     }
    else if (ob2.getage() < ob3.getage() && ob2.getage() < ob4.getage() && ob2.getage() < ob1.getage()) {
         ob2.display();
    }
    else if (ob3.getage() < ob1.getage() && ob3.getage() < ob2.getage() && ob3.getage() < ob4.getage())   {
        ob3.display();
    }
        else
        {
            ob4.display();
        }
    }
 }



