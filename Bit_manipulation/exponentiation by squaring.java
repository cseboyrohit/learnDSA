public class FastExponentiation {

    // Function to perform fast exponentiation (x^y)
    public static long power(long x, long y) {
        long result = 1;  // Initialize result

        // Update x if it is more than or equal to 2
        x = x % 1000000007; // To avoid overflow, you can apply modulus (Optional)

        while (y > 0) {
            // If y is odd, multiply x with result
            if (y % 2 == 1) {
                result = (result * x) % 1000000007; // Modulus to avoid overflow (Optional)
            }

            // y must be even now, square the base
            x = (x * x) % 1000000007; // Modulus to avoid overflow (Optional)

            // Divide y by 2
            y = y / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        long base = 2;
        long exponent = 10;

        // Example: calculating 2^10
        System.out.println("Result: " + power(base, exponent)); // Expected: 1024
    }
}
