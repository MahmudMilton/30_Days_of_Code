import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip = mealCost * tipPercent / 100.0;
        double tax = mealCost * taxPercent / 100.0;
        double totalCost = mealCost + tip + tax;

        int grandTotalCost = (int) Math.round(totalCost);

        System.out.println("The total meal cost is " + grandTotalCost + " dollars.");
    }
}
