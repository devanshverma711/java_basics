public class Recursion4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        int s =n+ sum(n-1);
        return s;
    }
}
