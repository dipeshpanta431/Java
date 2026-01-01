class factoriaL_demo{
    int fact(int n){
 if(n==0 || n==1)
 return 1;
 else
  return n*fact(n-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        factoriaL_demo ob = new factoriaL_demo();
        System.out.println("Factorial of 5 is: "+ob.fact(5));

    }
}
