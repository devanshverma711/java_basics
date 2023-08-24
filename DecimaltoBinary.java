import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convert(num));
    }

    static int convert(int num){
        int temp = 0;
        int pow =0;
        while(num>0){
            temp=temp+(num%2)*(int)Math.pow(10, pow) ;
            num=num/2;
            pow++;
        }
        return temp;
    }
}
