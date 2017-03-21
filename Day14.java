import java.util.Arrays;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] a) {
        elements = a;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
}

import java.util.Scanner;

public class Day14 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
