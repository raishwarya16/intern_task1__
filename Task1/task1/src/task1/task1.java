package task1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integer numbers
        System.out.print("Please enter the first integer number: ");
        int firstInteger = sc.nextInt();

        System.out.print("Please enter the second integer number: ");
        int secondInteger = sc.nextInt();

        // Prompt the user to enter a floating-point number
        System.out.print("Please enter a floating-point number: ");
        float floatingPointNumber = sc.nextFloat();

        // Prompt the user to enter a single character
        System.out.print("Please enter a single character: ");
        char singleCharacter = sc.next().charAt(0);

        // Prompt the user to enter a boolean value (true/false)
        System.out.print("Please enter a boolean value (true/false): ");
        boolean booleanValue = sc.nextBoolean();

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        sc.nextLine(); // Consume the leftover newline character
        String name = sc.nextLine();

        // Output the entered values
        System.out.println("\nYou have entered the following values:");
        System.out.println("First integer: " + firstInteger);
        System.out.println("Second integer: " + secondInteger);
        System.out.println("Floating-point number: " + floatingPointNumber);
        System.out.println("Single character: " + singleCharacter);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("Name: " + name);

        sc.close();
    }
}
