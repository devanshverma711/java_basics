public class Subarray1 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int ts =0;
        int sum =0;
        int max =0;
        int min =100;
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    System.out.print(""+arr[k]+" ");
                    sum+=arr[k];  
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                System.out.println(sum);
                ts++;
                System.out.println(" ");
            }
        }
        System.out.println("Maximum subarray is - "+max);
        System.out.println("Minimum subarray is - "+min);
        System.out.println("Total subArrays are - "+ts);
    }
}

