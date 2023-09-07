//Tilling Problem

public class Recursion11 {
    public static void main(String[] args) {
        int n=4 ;
        System.out.println(tillingProblem(n));
    }

    private static int tillingProblem(int n) {
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2);

        int twoWays = fnm1+fnm2;
        return twoWays;
    }
}
