import java.util.Scanner;

public class Day04 {

    int age;

    public void Person(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to " + age + ".");
        }
        age = initialAge;
    }

    public void yearPassed() {
        age++;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main (String[] args) {
        Day04 person = new Day04();

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        person.Person(input);
        person.amIOld();
    }
}
