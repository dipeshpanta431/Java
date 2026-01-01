public class breakloop {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("Loop Exit");
    }

}
