import java.util.Scanner;

public class Day07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        int[] reverseArr = new int[n];
        for (int i = 0; i < reverseArr.length; i++){
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        for (int a : reverseArr) {
            System.out.println(a + " ");
        }
    }
}
