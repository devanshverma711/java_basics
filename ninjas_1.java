import java.util.Scanner;

public class ninjas_1 {
    static int divisible3(int n, int[] x) {
        int[] arr = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 3 == 0) {
                arr[i] = x[i];
            } else {
                arr[i] = x[i] * x[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            x[i] = scanner.nextInt();
        }

        int result = divisible3(x.length, x);
        System.out.println("Sum: " + result);

        scanner.close();
    }
}

