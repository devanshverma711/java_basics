import java.util.Scanner;

public class untill10x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        do{
                System.out.println("Enter next number");
               num =  sc.nextInt();
               if(num%10==0){
                break;
               }
               
        }while(true);
    }    
}
