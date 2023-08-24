import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int facn=fact(n);
        int facr=fact(r);
        int fac_nr=fact(n-r);

        int answer = facn/(facr*fac_nr);
        System.out.println(answer);
    }
    static int fact(int num){
        int i =1;
        int factoria =1;
        while(i<=num){
            factoria *=i;
            i++;
        }
        return factoria;
    }
}
