//first occurance in array
public class Recursion7 {
    public static void main(String[] args) {
        int[] arr= {8,3,6,9,5,10,2,5,3};
        int i = 0;
        int key =5;
        System.out.println(check(arr,key,i));
    }

    static int check(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return check(arr, key, i+1);
    }
}
