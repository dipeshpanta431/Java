class box {
    double height, width, depth;

    void set(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void show() {
        System.out.println("Volume is : " + height * width * depth);
    }

    class multiple_bojects {
        public static void main(String[] args) {
            box ob[] = new box[5];
            int i;
            for (i = 0; i < 5; i++) {
                ob[i] = new box();
            }
            ob[0].set(10.5, 7.5, 5.0);
            ob[1].set(4, 2, 3);
            ob[2].set(10, 12, 13);
            ob[3].set(20, 21, 22);
            ob[4].set(9, 8, 7);
            for (i = 0; i < 5; i++) {
                ob[i].show();
            }
        }
    }
}