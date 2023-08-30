public class Powerof2Bits {
    public static void main(String[] args) {
       System.out.println(powerof2(2));
        System.out.println(powerof2(3));
        System.out.println(powerof2(16));
        System.out.println(powerof2(31));
    }
     public static boolean powerof2(int n){
         if((n&(n-1))==0){
            return true;
         }
         else{
            return false;
         }
     }
}
 

