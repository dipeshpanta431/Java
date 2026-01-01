public class AIOOBE_01_practice {
    public static void main(String[] args) {
        int number[] = new int[5];
        try {
            number[0] = 5;
            number[1] = 6;
            System.out.println((number[0] + number[1]));
            number[6] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

}
