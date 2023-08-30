public class ClearRangeBits {
    public static void main(String[] args) {
        System.out.println(clearIbits(10, 2,4 ));
 
     }
 
     public static int clearIbits(int n ,int i,int j){
         int Bitmask1 = ((~0)<<(j+1));
         int Bitmask2 = (1<<i)-1;
         int Bitmask = Bitmask1|Bitmask2;
         int result = n&Bitmask;
         return result;
     }
 }
 
