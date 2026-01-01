class area {
    double length;
    double breadth;

    void set(double length, double breadth) {
        double area_rectangle = length * breadth;
        System.out.println("Area of rectangle: " + area_rectangle);
    }

    void set(double length) {
        double area_square = length * length;
        System.out.println("Area of square: " + area_square);
    }
}

public class method_overloaded {
    public static void main(String[] args) {
        area a = new area();
        a.set(12, 8);
        a.set(6);
    }
}
