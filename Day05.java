import java.util.Scanner;

public class Day05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N >= 2 && N <= 20) {
            for(int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + N*i);
            }
        }
    }
}
