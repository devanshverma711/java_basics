public class Recursion2 {
    public static void main(String[] args) {
        int n =10;
        printInc(n);
    }

    static void printInc(int n) {
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
}
