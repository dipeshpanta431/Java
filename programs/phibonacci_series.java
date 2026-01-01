class recursion{
    int fib(int n)
    {
        if (n==0 || n==1)
        return n;
        else
        return fib(n-1)+fib(n-2);
    }
    
}
class phibonacci_series{
    public static void main(String[] args) {
        recursion ob =new recursion();
        
        System.out.println(ob.fib(6));
    }
}


