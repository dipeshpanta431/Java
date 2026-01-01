public class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating a jagged array
        int[][] arr = new int[3][];
        
        // Defining row lengths to match the shape
        arr[0] = new int[1]; // Row 1: 1 element
        arr[1] = new int[3]; // Row 2: 3 elements
        arr[2] = new int[2]; // Row 3: 2 elements
        
        // Assigning values
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[1][1] = 3;
        arr[1][2] = 4;
        arr[2][0] = 5;
        arr[2][1] = 6;
        
        // Printing the jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
