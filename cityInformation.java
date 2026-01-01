class city{
    String name;
    double area;
    int population;
    void show()
    {
        System.out.println("City: "+name+" Area: "+area+"km"+" Population: "+population);
    }
}
public class cityInformation {
    public static void main(String[] args) {
        city c1 = new city();
        city c2 = new city();
        city c3 = new city();
        c1.name ="Kathmandu";
        c1.area = 50.67;
        c1.population = 3184758;
        c2.name ="Pokhara";
        c2.area = 464.24;
        c2.population = 2584621;
        c3.name ="Dharan";
        c3.area = 192.32;
        c3.population = 1693847;
        c1.show();c2.show();c3.show();
    }
}
