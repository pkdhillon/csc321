// Prabhnoor Kaur
// Lab #6

public class pkaur6 {

   public static void main(String[] args) {
   
     	// Declare variables
        int x = 20, y = 10;
        double dx = 20.0, dy = 10.0;

        // Evaluate expressions for integer values
        System.out.println("Integer Evaluations:");
        System.out.println("x + y * x / y - x = " + (x + y * x / y - x));
        System.out.println("-x - y / x * y + x = " + (-x - y / x * y + x));
        System.out.println("x + y - x / y = " + (x + y - x / y));

        // Evaluate expressions for double values
        System.out.println("\nDouble Evaluations:");
        System.out.println("dx + dy * dx / dy - dx = " + (dx + dy * dx / dy - dx));
        System.out.println("-dx - dy / dx * dy + dx = " + (-dx - dy / dx * dy + dx));
        System.out.println("dx + dy - dx / dy = " + (dx + dy - dx / dy));
    }
}

