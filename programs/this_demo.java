class player {
    String name;
    int age;

    player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name is: " + name + "    Age: " + age);
    }
}

public class this_demo {
    public static void main(String[] args) {
        player p = new player("Messi", 37);
        player pp = new player("Ronaldo", 39);
        p.show();
        pp.show();
    }

}
