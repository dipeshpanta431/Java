class car {
    int speed;

    car() {
        speed = 120;

    }

    public void finalize() {
        System.out.println("Object of car is destroyed!");
    }
}

class bike {
    int speed;

    bike() {
        speed = 100;
    }

    protected void finalize() {
        System.out.println("Object of bike is destroyed!");
    }
}

public class garbage_collection {
    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        c = null; // c has no future use
        System.gc();
        System.out.println("Speed of bike:" + b.speed);
    }

}
