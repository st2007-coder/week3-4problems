// Program Name: NumberTypeChecker
// Purpose: Identify whether number is positive, negative, or zero

import java.util.Scanner;

class NumberTypeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(number > 0) {
            System.out.println("The number is Positive");
        }
        else if(number < 0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }

        input.close();
    }
}