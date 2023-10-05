class majorityI{
    public static void main(String[] args){
        int[] arr = {2,2,3,3,1,2,2};
        int n = arr.length;
        System.out.println(majoritybrute(arr,n));
    }

    static int majoritybrute(int[] arr,int n) {
        for(int i=0;i<n;i++){
           int count =0;
           {
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
           }
        }
        return -1;
    }
}