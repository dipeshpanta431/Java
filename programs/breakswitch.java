public class breakswitch {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                default:
                    System.out.println("i is either 2 or 3");
            }
        }
    }

}
