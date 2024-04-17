import java.util.Scanner;

public class TreeProduct {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int H = scanner.nextInt();
            if (H == 0) break;

            int[] values = new int[(1 << H) - 1];
            for (int i = 0; i < values.length; i++) {
                values[i] = scanner.nextInt();
            }

            int result = calculateP1(values, 0);
            System.out.println(result);
        }
    }

    static int calculateP1(int[] values, int index) {
        if (2 * index + 1 >= values.length) {
            // Leaf node
            return values[index];
        }

        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        int maxLeft = calculateP1(values, leftChildIndex);
        int maxRight = calculateP1(values, rightChildIndex);

        return Math.max(maxLeft * values[index], maxRight * values[index]) % MOD;
    }
}