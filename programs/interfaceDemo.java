interface numberDemo
{
    int square(int x);
    int cube (int x);
}
class xyz implements numberDemo
{
 int area1;
 int area2;
 public int square (int x)
 {
    area1= x * x;
    return area1;
 }
 public int cube (int x)
 {
    area2 = 6*x*x;
    return area2;
 }
}
public class interfaceDemo {
    public static void main(String[] args) {
        numberDemo ob = new xyz();
        System.out.println("Area of square is: "+ob.square(5));
        System.out.println("Area of cube is: "+ob.cube(2));
    }
}
