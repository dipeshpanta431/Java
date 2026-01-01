class second_largest_interger_array {
    public static void main(String[] args) {
        int a[] = { 2, 5, 4, 3, 6, 7, 22, 33 };
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > largest) {
                second_largest = largest;
                largest = num;
            } else if (num > second_largest && num != largest) {
                second_largest = num;
            }

        }
        System.out.println("Second largest integer in array a is: " + second_largest);
    }
}