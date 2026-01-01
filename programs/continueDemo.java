public class continueDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 6; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                continue;
            System.out.println();
        }
    }

}
