import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();

        String fullName = name + " "+ surname;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
}
