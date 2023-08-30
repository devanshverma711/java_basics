public class convertfirsttoUpper {
    public static void main(String[] args) {
        String sh = "hi , i am devansh verma";
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(sh.charAt(0));
        sb.append(ch);
;
    for(int i =1;i<sh.length();i++){
        if(sh.charAt(i)==' ' && i<sh.length()-1){
            sb.append(sh.charAt(i));
            i++;
            sb.append(Character.toUpperCase(sh.charAt(i)));
        }
        else{
            sb.append(sh.charAt(i));
        }
    }
    System.out.println(sb);
    }
}
