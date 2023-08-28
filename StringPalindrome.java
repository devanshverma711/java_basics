public class StringPalindrome {
    public static void main(String[] args) {
        String str1 = "racecar",str2="noon",str3="madam",str4="Devansh";
        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));
        System.out.println(checkPalindrome(str3));
        System.out.println(checkPalindrome(str4));
    }

    private static boolean checkPalindrome(String str) {
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
            }
            else{
                return false;
            }
        }
        return true;
    }
}
