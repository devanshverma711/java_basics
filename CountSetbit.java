class CountSetbit{
    public static void main(String[] args) {
        System.out.println(Count(15));
    }
    public static int Count(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        
        return count;
        
    }
}