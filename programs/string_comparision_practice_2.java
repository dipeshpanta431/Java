class book {
    String title;
    int price;

    void setVar(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void showVar() {
        System.out.println("Title: " + title);
        System.out.println("Price is: " + price);
    }
}

public class string_comparision_practice_2 {
    public static void main(String[] args) {
        book b1 = new book();
        b1.setVar("Java Tutorial", 990);
        book b2 = new book();
        b2.setVar("Java Practice", 550);
        book b3 = new book();
        b3.setVar("Code with Dipesh", 890);
        book b4 = new book();
        b4.setVar("Java & Python", 777);
        book[] books = { b1, b2, b3, b4 };
        for (book b : books) {
            if (b.title.startsWith("Java")) {
                b.showVar();
            }
        }

    }
}
