import java.util.Scanner;

public class Day06 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        String words[] = new String[T];
        StringBuffer stringBufferEven = new StringBuffer();
        StringBuffer stringBufferOdd = new StringBuffer();

        for(int i = 0; i < T; i++) {
            words[i] = scanner.nextLine();
            for(int j = 0; j < words[i].length(); j++) {
                if(j % 2 == 0) {
                    stringBufferEven.append(words[i].charAt(j));
                } else {
                    stringBufferOdd.append(words[i].charAt(j));
                }
            }
            System.out.println(stringBufferEven + " " + stringBufferOdd);
            stringBufferEven.delete(0, stringBufferEven.length());
            stringBufferOdd.delete(0, stringBufferOdd.length());
        }
    }
}
