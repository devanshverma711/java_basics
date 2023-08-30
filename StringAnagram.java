import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str = "race";
        String str1 = "care";
        System.out.println(check(str,str1));
    }

    private static boolean check(String str, String str1) {
        if(str.length()==str1.length()){
            str=str.toLowerCase();
            str1=str1.toLowerCase();

            char[] strarr = str.toCharArray();
            char[] str1arr = str1.toCharArray();

            Arrays.sort(strarr);
            Arrays.sort(str1arr);
            System.out.println(strarr);
            System.out.println(str1arr);
            return Arrays.equals(strarr,str1arr);
        }
        else{
            return false;
        }

    }
}
