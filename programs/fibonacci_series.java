class fibonacci{
    int fib(int n){
     if(n==0 || n==1)
     return n;
     else return fib(n-1)+fib(n-2);
    }
}
public class fibonacci_series {
    public static void main(String[] args) {
        fibonacci ob = new fibonacci();
        System.out.println("Fibonacci sequence of 5th term is:"+ob.fib(5));
    }
    
}
