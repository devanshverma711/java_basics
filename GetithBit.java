public class GetithBit {
    public static void main(String[] args) {
       System.out.println(getIthBit(10,3));
    }

    public static int getIthBit(int n,int i){
        int Bitmask = 1<<i;
        if((n&Bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
}
