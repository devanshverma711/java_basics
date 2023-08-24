import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int i = sc.nextInt();
        System.out.println(convert(i));
    }
    static int convert(int i){ 
        int pow =0;
        int dec =0;
        int ld =0;
        while(i>0){
            ld = i%10;
            dec = (int) (dec + (ld*(Math.pow(2, pow))));
            i=i/10;
            pow++;
        }
        return dec;
    }
}
    
