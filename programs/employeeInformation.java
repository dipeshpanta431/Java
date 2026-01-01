class employee{
    String name,post;
    double salary;
}
class employeeInformation{
    public static void main(String[] args) {
        employee ob = new employee();
        ob.name = "Sabin Karki";
        ob.post = "CEO";
        ob.salary =20000;
        employee sc = new employee();
        sc.name = "Sonup Shrestha";
        sc.post = "Human Resource Manager";
        sc.salary = 15000;
        System.out.println("Employee 1:");
        System.out.println("Name: "+ob.name);
        System.out.println("Post: "+ob.post);
        System.out.println("Salary: "+ob.salary);
        System.out.println();
        System.out.println("Employee 2:");
        System.out.println("Name: "+sc.name);
        System.out.println("Post: "+sc.post);
        System.out.println("Salary: "+sc.salary);

    }
}