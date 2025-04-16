// Prabhnoor Kaur
// Lab #6

#include <stdio.h>

int main(void)	
{

    // Declare variables
    int x = 20, y = 10;
    double dx = 20.0, dy = 10.0;

    // Evaluate expressions for integer values
    printf("Integer Evaluations:\n");
    printf("x + y * x / y - x = %d\n", x + y * x / y - x);
    printf("-x - y / x * y + x = %d\n", -x - y / x * y + x);
    printf("x + y - x / y = %d\n", x + y - x / y);


    // Evaluate expressions for double values
    printf("\nDouble Evaluations:\n");
    printf("dx + dy * dx / dy - dx = %lf\n", dx + dy * dx / dy - dx);
    printf("-dx - dy / dx * dy + dx = %lf\n", -dx - dy / dx * dy + dx);
    printf("dx + dy - dx / dy = %lf\n", dx + dy - dx / dy);

    return 0;

}

