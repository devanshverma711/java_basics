// power in optimised way
//  
public class Recursion10 {
    public static void main(String[] args) {
        int a=2;
        int n =10; 
        System.out.println(optimisedPower(a, n));
    }
    public static int optimisedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower =optimisedPower(a, n/2);
        int halfPowersq = halfPower * halfPower;
        
        //n is odd
        if(n%2!=0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }   

}
