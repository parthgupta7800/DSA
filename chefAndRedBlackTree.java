import java.util.Scanner;

public class chefAndRedBlackTree {
    static int countNodes(int x, int y, char[] color) {
        int count = 0;
        while (x <= y) {
            if (color[x] == 'B') {
                count++;
            }
            x /= 2;
            y /= 2;
        }
        return count;
    }

    static void changeColor(char[] color) {
        for (int i = 1; i < color.length; i++) {
            if (color[i] == 'B') {
                color[i] = 'R';
            } else {
                color[i] = 'B';
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        char[] color = new char[(int) Math.pow(2, Math.ceil(Math.log(1e9) / Math.log(2))) + 1];
        for (int i = 1; i < color.length; i++) {
            color[i] = 'B'; // Initialize color array
        }

        for (int q = 0; q < Q; q++) {
            String query = scanner.next();
            if (query.equals("Qi")) {
                changeColor(color);
            } else {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (query.equals("Qb")) {
                    System.out.println(countNodes(x, y, color));
                } else {
                    System.out.println(countNodes(x, y, color) - 1); // Excluding the root node
                }
            }
        }
    }
}