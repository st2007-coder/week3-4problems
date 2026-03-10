// Program Name: DivisibleByFive
// Purpose: Check if a number is divisible by 5

import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {

        // Creating Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int number;

        // Taking user input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Checking divisibility
        boolean isDivisible = (number % 5 == 0);

        // Displaying result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}