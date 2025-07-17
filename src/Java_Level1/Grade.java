package Java_Level1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int grade;

        // Validates the range is only 0 to 100
        System.out.print("Enter your grade (0–100): ");
        grade = a.nextInt();
        while (grade < 0 || grade > 100) {
            System.out.print("Invalid grade. Try again: ");
            grade = a.nextInt();
        }

        // Converting grade to a letter
        char letter;
        if (grade >= 90) letter = 'A';
        else if (grade >= 70) letter = 'B';
        else if (grade >= 60) letter = 'C';
        else if (grade >= 50) letter = 'D';
        else letter = 'E';

        // Use a switch case to print the message
        switch (letter) {
            case 'A':
                System.out.println("Exceed Expectations");
                break;
            case 'B':
                System.out.println("Remarkable");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Sufficient Grade");
                break;
            case 'E':
                System.out.println("Insufficient Grade");
                break;
        }
        a.close();
    }
}
