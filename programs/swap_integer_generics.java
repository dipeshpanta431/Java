public class swap_integer_generics {
    public static <T> void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5 };
        swap(array, 2, 4);
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

}
