public class Recursion5 {
    public static void main(String[] args) {
        int n=25;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fibo(n-1);
        int fib2 = fibo(n-2);
        int fib = fib2+fib1;
        return fib;
    }
}
