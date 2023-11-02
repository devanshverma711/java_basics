import java.util.Arrays;

public class aaa {
    static int ballsAndbats(int n, int[] s, int[] m, int x, int y) {
        int sumS = Arrays.stream(s).sum();
        int sumM = Arrays.stream(m).sum();

        int opsS = (int)Math.ceil((double)x / sumS);
        int opsM = (int)Math.ceil((double)y / sumM);

        return Math.min(opsS, opsM);
    }

    public static void main(String[] args) {
        int[] s1 = {2, 3, 1};
        int[] m1 = {7, 9, 11};
        int x1 = 10;
        int y1 = 9;
        System.out.println(ballsAndbats(s1.length, s1, m1, x1, y1));  // Output: 2

        int[] s2 = {1, 7};
        int[] m2 = {2, 6};
        int x2 = 6;
        int y2 = 11;
        System.out.println(ballsAndbats(s2.length, s2, m2, x2, y2));  // Output: 1
    }
}
