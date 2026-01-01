interface shape {
    void area();

    void perimeter();
}

class circle implements shape {
    double pi = 3.14;
    int radius = 8;

    public void area() {
        double a_circle = pi * radius * radius;
        System.out.println("Area of circle: " + a_circle);
    }

    public void perimeter() {
        double p_circle = 2 * pi * radius;
        System.out.println("Perimeter of circle: " + p_circle);
    }
}

class rectangle implements shape {
    int length = 15;
    int breadth = 6;

    public void area() {
        int a_rectangle = length * breadth;
        System.out.println("Area of rectangle: " + a_rectangle);
    }

    public void perimeter() {
        int p_rectangle = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is: " + p_rectangle);
    }
}

public class interface_practice_01 {
    public static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new rectangle();
        s1.area();
        s1.perimeter();
        System.out.println();
        s2.area();
        s2.perimeter();

    }
}
