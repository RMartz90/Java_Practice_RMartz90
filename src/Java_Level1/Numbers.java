package Java_Level1;

import java.util.Scanner;

// Create a Method that can check what number is greater or if they are the same

public class Numbers {
        public static void main(String[] args)
        {
            Scanner a = new Scanner(System.in);
            int n1,n2;
            System.out.print("Enter first number: ");
            n1=a.nextInt();
            System.out.print("Enter second number: ");
            n2=a.nextInt();
            if(n1==n2)
                System.out.println("They are the same numbers");
            else
            {
                if(n1>n2)
                    System.out.println(n1 + " greater than: " + n2);
                else
                    System.out.println(n2 + " greater than:4 " + n1);
            }
        }
}
