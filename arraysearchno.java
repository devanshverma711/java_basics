
import java.util.Scanner;

public class arraysearchno {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int size = sc.nextInt();
            int number[] = new int[size];  
            for(int i=0;i<size;i++){
                System.out.println("Enter next element");
                number[i] = sc.nextInt();
            }
            System.out.println("Enter element to search");
            int x =sc.nextInt();
            for(int i=1;i<number.length;i++){
               if(number[i]==x){
                   System.out.println("element "+ x +" is at "+i+" index");
                }
            }
        }           
    }
}