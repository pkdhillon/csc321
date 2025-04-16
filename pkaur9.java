// Prabhnoor Kaur
// Lab #9

import java.util.Scanner;
import java.util.Random;

public class pkaur9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(20) + 1;
        int guess;

        System.out.println("Enter a number between 1 and 20:");

        while (true) {
            guess = scanner.nextInt();

            if (guess < 1 || guess > 20) {
                System.out.println("You input a number that is out of range. Re-enter a number between 1 and 20:");
                continue;
            }

            if (guess == num) {
                System.out.println("You won and guessed the number correctly!");
                for (int i = 0; i < guess; i++) {
                    System.out.println("You won and guessed the number correctly!");
                }
                break;
            } else if (guess < num) {
                System.out.println("Your number is too low. Please try again:");
            } else {
                System.out.println("Your number is too low. Please try again:");
            }
        }

        scanner.close();
    }
}

