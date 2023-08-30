public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char a='a';a<='z';a++){
            sb.append(a+" ");
        }
        System.out.println(sb);
    }
}
