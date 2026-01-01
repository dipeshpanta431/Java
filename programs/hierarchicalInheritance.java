class company {
    void show() {
        System.out.println("Cosmotech");
    }

}

class department extends company {
    void display() {
        System.out.println("IT");
    }
}

class employee extends company {
    void present() {
        show();
        System.out.println("Ram");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        department d = new department();
        employee e = new employee();
        d.display();
        e.present();
    }

}
