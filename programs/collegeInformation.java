class college{
    String name;
    String address;
   int contact;
    college(String n,String a, int c){
         name = n;
         address = a;
         contact = c;
    System.out.println("College: "+name+" Address: "+address+" Contact: "+contact);     
    }
}
class collegeInformation{
    public static void main(String[] args) {
        college c1= new college("Liverpool","New Baneshwor",984123);
        college c2 = new college("KMC","Koteshwor",9823768);
        college c3 = new college("Nexus","Pepsicola",97612  );
        }
}