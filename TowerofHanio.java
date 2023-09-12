public class TowerofHanio {
    public static void main(String[] args) {
        int n = 2;
        recursion( n,"S","H","D");
    }
    public static void recursion(int n,String s,String h,String d){
        if(n==1){
            System.out.println("Transfer disk "+n+ " from "+s+" to "+d );
            return;
        }
        recursion(n-1,s,d,h);
        System.out.println("Transfer disk "+n+ " from "+s+" to "+d );
        recursion(n-1,h,s,d);
    }
}
