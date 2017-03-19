import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Name and Phone to a Dictionary
        Map<String, Integer> nameAndPhone = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            // Putting things inside our dictionary
            nameAndPhone.put(name, phone);
        }
        while(in.hasNext()) {
            String name = in.next();
            if(nameAndPhone.get(name) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(name + "=" + nameAndPhone.get(name));
            }
        }
        in.close();
    }
}
