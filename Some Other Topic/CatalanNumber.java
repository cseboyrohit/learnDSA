public class CatalanNumber {

    // Function to calculate the n-th Catalan number
    public static long catalan(int n) {
        if (n <= 1) {
            return 1;
        }
        
        // Create an array to store catalan numbers
        long[] catalan = new long[n + 1];
        
        // Initialize the first two values
        catalan[0] = 1;
        catalan[1] = 1;
        
        // Fill the catalan array in bottom-up manner
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        
        // Return the n-th Catalan number
        return catalan[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example: Calculate the 5th Catalan number
        System.out.println("The " + n + "th Catalan number is: " + catalan(n));
    }
}

/* ********************************************************
    The outer loop (for (int i = 2; i <= n; i++)) iterates from 2 to n, computing each Catalan number up to C_n.
** For each i, initializes catalan[i] to 0.

* The inner loop (for (int j = 0; j < i; j++)) computes catalan[i] by summing up products of previously computed Catalan numbers:

** catalan[j] * catalan[i - j - 1]. Here, j ranges from 0 to i - 1.

** This corresponds to the recursive formula for Catalan numbers: C_i = C_0 * C_{i-1} + C_1 * C_{i-2} + ... + C_{i-1} * C_0.

    */
