import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int n =3,m=3;
        
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print("Enter the value");
                arr[i][j]=sc.nextInt();
            }
        }

       for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        Search(arr, key);
    }
    public static boolean Search(int arr[][],int key){
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.print("key found at "+"("+ i+","+j+")");
                    return true;  
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
