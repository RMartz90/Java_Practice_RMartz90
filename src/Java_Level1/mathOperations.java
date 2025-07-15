package Java_Level1;

import java.util.Scanner;

// Create a Method where the user can insert to numbers and make the 4 basic mathematical operations:
// The Method should accept decimals

public class mathOperations {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);  // Create Scanner
       
        System.out.print("Please enter the first number: ");
        double number1 = scanner.nextDouble();           
        System.out.println("Your first number is: " + number1);

        System.out.print("Please enter the Second number: ");
        double number2 = scanner.nextDouble();     
        System.out.println("Your second number is: " + number2);
        scanner.close();  // Always close the scanner once user is done

        double sum = number1 + number2;
        System.out.println("Sum: " + sum);

        double subtract = number1 - number2;
        System.out.println("Subtraction: " + subtract);
       
        double division = number1 / number2;
        System.out.println("Division: " + division);

        double multiply = number1 * number2;
        System.out.println("Multiplication: " + multiply);
    }       
}
