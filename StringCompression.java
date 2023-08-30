public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccdd";
        compression(str);
        compress(str);
    }

    private static void compression(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int same =0;
        int count =1;
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(same)){
                if(count>1){
                    sb.append(count);
                }
                count =1;
                same = i;
                sb.append(str.charAt(same));
            }
            else{
                count++;
            }
        }
        if(count>1){
            sb.append(count);
        }
        System.out.println("Using StringBuilder ----> ");
        System.out.println(sb.toString());
    }

    public static void compress(String str){
        String newStr = "";

        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        System.out.println("Using String ---> ");
        System.out.println(newStr);
    }
}
