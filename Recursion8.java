//check last occurance of key
public class Recursion8 {
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int i =arr.length-1;
        int key =5;
        System.out.println(checklast(arr,key,i));
    }

    public static int checklast(int[] arr,int key,int i){
        if(i==-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return checklast(arr, key, i-1);
    }
}
