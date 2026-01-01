class genericExample {
    private String val;

    <T extends Character> genericExample(T value) {
        val = String.valueOf(value);
    }

    void showVal() {
        System.out.println("Val is: " + val);
    }
}

class genericConstructor {
    public static void main(String[] args) {
        genericExample ge = new genericExample('a');
        ge.showVal();
    }
}