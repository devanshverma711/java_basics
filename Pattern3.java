public class Pattern3 {
    public static void main(String[] args) {
        char ch ='A';
        for(int i =1;i<=4;i++){
            for(char j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
