public class SetithBit {
    
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
     }
 
     public static int getIthBit(int n,int i){
         int Bitmask = 1<<i;
         n=n|Bitmask;
         return n;
     }
 }
