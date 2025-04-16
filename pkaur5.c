// Prabhnoor Kaur
// Lab #5

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void) 
{
    int i = 0;
    int arr[10] = {0};
    int intVar = 30;
    float floatVar = 3.14;
    char charVar = 'A';
    double doubleVar = 9.8765;

    // Print values and addresses using the exact format you requested
    printf("The int value is %d and it's address is %p\n", intVar, (void*)&intVar);
    printf("The float value is %f and it's address is %p\n", floatVar, (void*)&floatVar);
    printf("The char value is %c and it's address is %p\n", charVar, (void*)&charVar);
    printf("The double value is %lf and it's address is %p\n", doubleVar, (void*)&doubleVar);

    {
        int y = 10;
    }
    // printf("The value of y is %d \n", y);
    
    for (i = 0; i < 10; i++) 
    {
        printf("Address of arr[%d] = %p \n", i, (void*)&arr[i]);
    }

    return EXIT_SUCCESS;
}

