public class genericsexamp<T> {

    private T name;

    genericsexamp(T name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        genericsexamp<String> ob = new genericsexamp<String>("Dipesh");
        ob.display();

    }

}
