// Program Name: LeapYearChecker
// Purpose: Check whether a year is a leap year

import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Enter a year: ");
        year = input.nextInt();

        if(year >= 1582) {

            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            }
            else {
                System.out.println(year + " is NOT a Leap Year.");
            }

        }
        else {
            System.out.println("Year must be 1582 or later.");
        }

        input.close();
    }
}