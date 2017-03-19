import java.util.Scanner;

public class Day09 {
    public static int Factorial(int n) {
        // Base Case:
        if(n <= 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int fact = Factorial(N);
        System.out.println(fact);
    }
}
