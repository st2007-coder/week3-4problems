// Program Name: MultiplicationTable
// Purpose: Display multiplication table from 6 to 9

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Loop from 6 to 9
        for(int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        input.close();
    }
}