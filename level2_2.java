// Program Name: FactorFinder
// Purpose: Find factors of a given number

import java.util.Scanner;

class FactorFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Factors of " + number + " are:");

        for(int i = 1; i <= number; i++) {

            if(number % i == 0) {
                System.out.println(i);
            }

        }

        input.close();
    }
}