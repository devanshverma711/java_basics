import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean isPrime = true;
        if(num==2){
            isPrime=false;
        }
        else{
            for(int i =2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime==true){
            System.out.println("It is Prime number");
        }
        if(isPrime==false){
            System.out.println("It is Composite number");
        }
    }
}
