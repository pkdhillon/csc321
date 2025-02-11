// Prabhnoor Kaur
// lab #4b

import java.util.Scanner;

public class pkaur4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int x = 0;

        // Display menu
        System.out.println("Choose an option:");
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.println("Option 4");

        // Get user input
        System.out.print("Enter an option from 1-4:  ");
        x = scanner.nextInt();

        // Display messages
        if (x == 1) {
            System.out.println("It always seems impossible until it's done.");
        } else if (x == 2) {
            System.out.println("Live the life the way you want. Stop worrying about others think.");
        } else if (x == 3) {
            System.out.println("Always be yourself.");
        } else if (x == 4) {
            System.out.println("Everything has beauty, but not everyone can see it.");
        } else {
            System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        scanner.close();  // Close scanner
    }
}

