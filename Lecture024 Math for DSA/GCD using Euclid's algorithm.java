public class GCDExample {

    // Method to calculate GCD using Euclid's algorithm iteratively
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 24;
        
        // Calculate GCD of num1 and num2
        int result = gcd(num1, num2);
        
        // Output the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
