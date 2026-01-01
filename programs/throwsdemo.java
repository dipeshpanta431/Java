class throwsdemo {
    static void show() throws IllegalAccessException {
        System.out.println("Inside throwone.");
        throw new IllegalAccessException("XYZ");
    }

    public static void main(String[] args) {
        try {
            show();
        } catch (IllegalAccessException e) {
            System.out.println("caught: " + e);
        }
    }
}