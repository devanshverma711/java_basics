import java.util.Scanner;

public class primenoRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        prime(n);
    }
    static void prime(int n ){
        for(int j=2;j<=n;j++){ 
            Boolean isPrime=true;
            for(int i =2;i<=Math.sqrt(j);i++){
                if(j%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(j);
            }
        }
    }
}
