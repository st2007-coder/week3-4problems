// Program Name: VotingEligibility
// Purpose: Check if a person can vote based on age

import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int age;

        // Taking input
        System.out.print("Enter age: ");
        age = input.nextInt();

        // Checking eligibility
        if(age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } 
        else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}