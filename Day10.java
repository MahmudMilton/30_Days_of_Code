import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] ones = Integer.toBinaryString(n).split("[0]+");
        int max = 0;
        for (String s : ones) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
