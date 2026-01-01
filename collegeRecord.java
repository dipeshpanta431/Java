class college{
    String cname;
    long contact;
    college()
    {
        cname = "KCMIT";
        contact = 0143;
    }
    college(String n, long c){
        cname=n;
        contact=c;
    }
    void display(){
        System.out.println("College: "+cname+" Contact: "+contact);
    }
}
class collegeRecord {
    public static void main(String[] args) {
        college c1 = new college();
        c1.display();
        college c2 = new college ("Liverpool",787);
        c2.display();
    }
    
}
