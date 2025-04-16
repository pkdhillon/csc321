// Prabhnoor Kaur
// lab #10c

import java.util.Scanner;

public class pkaur10
{
    public static void main(String[] args)
    {
        double r = 0, h = 0, v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        r = input.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        h = input.nextDouble();

        v = Vol(r, h);

        System.out.println("The volume of the cylinder is: " + v);
    }

    static double Vol(double r, double h)
    {
        double result = Math.PI * r * r * h;
        return result;
    }
}

