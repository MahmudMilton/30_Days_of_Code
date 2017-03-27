import java.util.Scanner;

public class Day20 {
    private static void printArray(int[] x) {
        int l = x.length;
        System.out.println("First Element: " + x[0]);
        System.out.println("Last Element: " + x[l-1]);
    }

    public static void bubbleSort(int[] x) {
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        for(int i = 0; i < x.length; i++) {

            for(int j = 0; j < x.length - 1; j++) {
                // Swap adjacent elements if they are decreasing order
                if(x[j] > x[j + 1]) {
                    int tmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if(numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        in.close();

        bubbleSort(a);
        printArray(a);
    }
}
