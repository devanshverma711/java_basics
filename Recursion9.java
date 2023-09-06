//power of number

public class Recursion9 {
    public static void main(String[] args) {
        int num =2;
        int pow =10;
        int q=num;
        System.out.println(power(num,pow));
    }
    static int power(int num , int pow){
        if(pow == 0){
            return 1;
        }
        return num*power(num, pow-1);
       
    }
}
