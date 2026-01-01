public class AIOOBE {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[2] = 12;
        System.out.println("Value of a[2] is: " + a[2]);
        try {
            a[8] = 30; // Exception
            System.out.println("Value of a[8] is: " + a[8]);
        } catch (ArrayIndexOutOfBoundsException e) // Exception handled.
        {
            System.out.println(e);
        }
        System.out.println("After exception handled.");
    }
}
