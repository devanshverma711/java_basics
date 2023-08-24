import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
    }
    static void fact(int num){
        int i =1;
        int factoria =1;
        while(i<=num){
            factoria *=i;
            i++;
        }
        System.out.println(factoria);
    }
}
