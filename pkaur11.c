// Prabhnoor Kaur
// Lab #11b

#include <stdio.h>
#include <math.h>

double calcHyp(double base, double height);

int main(void) {
    double base, height, hyp;

    printf("Enter the base of the triangle: ");
    scanf("%lf", &base);

    printf("Enter the height of the triangle: ");
    scanf("%lf", &height);

    hyp = calcHyp(base, height);

    printf("The hypotenuse of the triangle with base %.2f and height %.2f is %.2f\n", base, height, hyp);


    return 0;
}

double calcHyp(double base, double height) {
    return sqrt((base * base) + (height * height));
}

