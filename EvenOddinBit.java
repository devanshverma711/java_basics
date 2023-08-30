public class EvenOddinBit {
    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(11);
        oddorEven(14);
    }
    public static void oddorEven(int n){
        int Bitmask = 1;
        if((n&Bitmask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    } 
}
