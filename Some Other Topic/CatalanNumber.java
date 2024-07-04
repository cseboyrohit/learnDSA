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
