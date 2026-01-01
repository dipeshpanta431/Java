interface teacher {
    void tech();
}

interface student extends teacher {
    void read();
}

class college implements student {
    public void tech() {
        System.out.println("Teacher teaches student");
    }

    public void read()

    {
        System.out.println("Student read book");
    }
}

public class extendedInterface_example {
    public static void main(String[] args) {
        student ob = new college();
        ob.tech();
        ob.read();
    }
}
