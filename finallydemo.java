public class finallydemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 15;
            System.out.println(a + " " + b);
            int c = 20;
            int d = c / 0;
            System.out.println(c + " " + d);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("This will execute always!");
        }
        System.out.println("What about this statement?");
    }

}
