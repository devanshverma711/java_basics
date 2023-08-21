import java.util.Scanner;

public class reverseofNumber {
    public static void main(String[] args) {
       // try (Scanner sc = new Scanner(System.in)) {
            int num = 123;//sc.nextInt();
            int temp=0;
            while(num>0){
                temp =temp*10 + num%10;
                num = num/10;
            }
            System.out.println(temp);
       // }
    }
}
