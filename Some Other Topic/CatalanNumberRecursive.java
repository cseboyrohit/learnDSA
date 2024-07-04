public class CatalanNumberRecursive {

    // Function to calculate the nth Catalan number recursively
    public static long catalanRecursive(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += catalanRecursive(i) * catalanRecursive(n - 1 - i);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int n = 5; // Calculate the 5th Catalan number
        
        long catalanNumber = catalanRecursive(n);
        
        System.out.println("The " + n + "th Catalan number (using recursion) is: " + catalanNumber);
    }
}
