// Prabhnoor Kaur
// Lab #9c

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
    int num, guess;

    srand(time(NULL));
    num = (rand() % 20) + 1;

    printf("Enter a number between 1 and 20:\n");

    while (1) {
        scanf("%d", &guess);

        if (guess < 1 || guess > 20) {
            printf("You input a number that is out of range. Re-enter a number between 1 and 20:\n");
            continue;
        }

        if (guess == num) {
            printf("You won and guessed the number correctly!\n");
            for (int i = 0; i < guess; i++) {
                printf("You won and guessed the number correctly!\n");
            }
            break;
        } else if (guess < num) {
            printf("Your number is too low. Please Try again:\n");
        } else {
            printf("Your number is too low. Please Try again:\n");
        }
    }

    return 0;
}

