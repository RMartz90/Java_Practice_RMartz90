package Java_Level1;

import java.util.Scanner;

// Create a method that can tell if a number is Pair or Odd

public class numberPairorOdd {
  
        public static void main( String[] args )
        {
            double number;
            Scanner keyboard = new Scanner( System.in );

            System.out.print( "Enter your number: " );
            number = keyboard.nextDouble();
            while (number < 0) {
                System.out.print("Negative numbers are not accepted. Try again: ");
                number = keyboard.nextDouble();
            }
            
            if ( number % 2 == 0 )
            {
                System.out.print( number +  " is Pair " );
            }
            else
            {
                System.out.print(number + " is Odd " );
            }
            keyboard.close();
        }
     
    }

