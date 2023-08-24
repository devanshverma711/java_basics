public class Subarray3 {
    public static void main(String[] args) {
       int arr[] = {-2,-3,4,-1,-2,1,5,-3};
       int Min = kadanes(arr);
       System.out.println("Max Subarray sub is "+ Min);
    }

    public static int kadanes(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        if(count==arr.length){
            int min=arr[0];
            for(int i =1;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;  
        }
        for(int i =0;i<arr.length;i++){
            cs= cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }
}
