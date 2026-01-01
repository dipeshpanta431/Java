public class Sumofarraygenerics {
    static <T extends Number, V extends Number> void show(T[] arr, V[] array) {
        for (int i = 0; i < arr.length; i++) {
            T x = arr[i];
            V y = array[i];
            System.out.print(x + " ");
            System.out.print(y + " ");
            System.out.println("Sum is:" + (x.doubleValue() + y.doubleValue()));
        }
    }

    public static void main(String[] args) {
        Integer[] iarr = { 4, 7, 3, 1, 9 };
        Integer[] jarr = { 5, 4, 3, 2, 1 };
        show(iarr, jarr);
    }

}
