public class CleariBits {
    public static void main(String[] args) {
       System.out.println(clearIbits(15, 2));

    }

    public static int clearIbits(int n ,int i){
        int Bitmask = -1<<i;
        int result = n&Bitmask;
        return result;
    }
}
