import java.util.Scanner;

public class Day01 {

    public static void main (String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int j;
        double e;
        String r;

        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        r = scan.nextLine();

        System.out.println(j + i);
        System.out.println(e + d);
        System.out.println(s + r);

        scan.close();
    }
}
