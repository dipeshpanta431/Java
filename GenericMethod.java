public class GenericMethod {
    static <T> void show(T[] arr) {
        for (T x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] iarr = { 1, 3, 5, 7, 9 };
        System.out.println("Value of integer array: ");
        show(iarr);
        System.out.println();
        String[] str = { "Apple", "Ball", "Cat", "Dog", "Elephant", "Fish" };
        System.out.println("Value of String array:");
        show(str);
    }

}
