import java.util.Scanner;

public class FoodCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the cost of mess food and restaurant splurges
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the weekly food cost
        int weeklyCost = 6 * X + Y;

        // Output the result
        System.out.println(weeklyCost);
    }
}