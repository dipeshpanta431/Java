public class breakGoto {
    public static void main(String[] args) {
        boolean b = true;
        one: {
            two: {
                System.out.println("break is used as goto");
                if (b)
                    break two;
                System.out.println("Inside two label");
            }
            System.out.println("Inside one label");
        }
        System.out.println("After one label");
    }

}
