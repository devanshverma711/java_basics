public class ClearithBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
     }
 
     public static int clearIthBit(int n,int i){
         int Bitmask = 1<<i;
         int bmask = ~Bitmask;
         int result=n&bmask;
         return result;
     }
 }
