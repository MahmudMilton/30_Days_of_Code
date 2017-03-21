public class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }
}

public class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName,lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }

        int average = sum / testScores.length;
        char grade;

        if (average < 40) {
            grade = 'T';
        } else if (40 <= average && average < 55) {
            grade = 'D';
        } else if (55 <= average && average < 70) {
            grade = 'P';
        } else if (70 <= average && average < 80) {
            grade = 'A';
        } else if (80 <= average && average <90) {
            grade = 'E';
        } else {
            grade = 'O';
        }
        return grade;
    }
}

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
