package Java_Level1;

import java.util.Scanner;

// Create a Method where the user can insert to numbers and make the 4 basic mathematical operations:

public class mathOperations {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);  // Create Scanner
       
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();           
        System.out.println("Your first number is: " + number1);

        System.out.print("Please enter the Second number: ");
        int number2 = scanner.nextInt();     
        System.out.println("Your second number is: " + number2);
        scanner.close();  // Always close the scanner once user is done

        int sum = number1 + number2;
        System.out.println("Sum: " + sum);

        int subtract = number1 - number2;
        System.out.println("Subtraction: " + subtract);
       
        int division = number1 / number2;
        System.out.println("Division: " + division);

        int multiply = number1 * number2;
        System.out.println("Multiplication: " + multiply);
    }       
}
