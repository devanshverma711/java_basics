import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of list a: ");
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        System.out.print("Enter elements of list a: ");
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        System.out.print("Enter the size of list b: ");
        int m = scanner.nextInt();
        List<Integer> b = new ArrayList<>();
        System.out.print("Enter elements of list b: ");
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }

        System.out.print("Enter the number of swaps (k): ");
        int k = scanner.nextInt();

        int result = getMaximumDistinctCount(a, b, k);
        System.out.println("Maximum count of distinct elements in list a: " + result);

        scanner.close();
    }

    public static int getMaximumDistinctCount(List<Integer> a, List<Integer> b, int k) {
        // Create a mapping of elements in list a to their corresponding elements in list b
        Map<Integer, Integer> mapping = new HashMap<>();

        // Populate the mapping
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            mapping.put(a.get(i), b.get(i));
        }

        // Initialize a set to keep track of visited elements in list a
        Set<Integer> visited = new HashSet<>();

        // Initialize a count for the maximum distinct elements
        int count = 0;

        for (int element : a) {
            if (!visited.contains(element)) {
                visited.add(element);
                if (k > 0 && mapping.containsKey(element)) {
                    visited.add(mapping.get(element));
                    k--;
                }
                count++;
            }
        }

        return count;
    }
}
