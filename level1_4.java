// Program Name: FactorialCalculator
// Purpose: Calculate factorial of a number

import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int factorial = 1;
        int counter = 1;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        if(number < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        }
        else {

            // Calculating factorial
            while(counter <= number) {
                factorial = factorial * counter;
                counter++;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        }

        input.close();
    }
}